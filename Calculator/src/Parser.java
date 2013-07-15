import java.util.*;
import java.util.regex.Pattern;

/**
 * Trieda Parser zabezpečuje rozanalyzovanie výrazu typu String na Tokeny a postavenie stromu z výrazu.
 * 
 * @author Atenna
 * @version 12.5.2013
 */

public class Parser
{
    private final static String[] SIGNS_IN_ORDER = getSignsInOrder();
    
    private String expression;

    public Parser(String expression)
    {
        this.expression = expression;
    }
    
    /**
     * Metóda getSignsInOrder získa od Binary a UnaryOperation znamienka v poradí podľa precedencie,
     * a to od najmenej vyznamnych po najvyznamnejsie.
     */
    private static String[] getSignsInOrder() 
    {
        // vysledny zoznam znamienok
        List<String> result = new ArrayList<String>();
        // binary poziadame o znamienka
        List<String> binary = Arrays.asList(BinaryOperation.getSignsInOrder());
        // aj unary poziadame
        List<String> unary = Arrays.asList(UnaryOperation.getSignsInOrder());
        // binarne pridame na zaciatok
        result.addAll(binary);
        // za nimi pridame unarne
        result.addAll(unary);
        // vratime vysledny zoznam ako pole
        return result.toArray(new String[0]);
    }
    
    /**
     *  Rozdelí zadaný výraz podľa medzier na Tokeny, ktoré vráti v Zozname.
     *  Tokenom môže byť aj vrchol stromu.
     */
    private ArrayList<Token> parse()
    {
        // pridame medzery pred a za znamienka a zatvorky
        expression = expression.replaceAll(Pattern.quote("("), " ( ");
        expression = expression.replaceAll("\\)", " ) ");
        
        for (int i = 0; i < SIGNS_IN_ORDER.length; i++)
        {
            String sign = SIGNS_IN_ORDER[i];
            expression = expression.replaceAll(Pattern.quote(sign), " " + sign + " ");
        }
        
        for (String sign : SIGNS_IN_ORDER) {
            expression = expression.replaceAll(Pattern.quote(sign), " " + sign + " ");
        }
        
        String[] m = expression.split(" ");
        
        ArrayList<Token> a = new ArrayList<>();
        
        for(int r = 0; r < m.length; r++) {
            if (!m[r].trim().equals("")) {
                a.add(new StringToken(m[r]));
            }
        } 
        
        return a;
    }
    
    /**
     *  Metóda treeer stavia strom zo zadaného výrazu podľa precedencie jednotlivých operátorov
     *  Vracia vrchol stromu.
     */
    @SuppressWarnings("empty-statement")
    private Node treeer(Token[] tokens)
    {
        if (tokens.length == 0) {
            return null;
        }
        else if (tokens.length == 1) {
            if (tokens[0] instanceof Node) {
                return (Node)tokens[0];
            }
            // try to convert the sign into a number to that it can be returned as a root 
            try {
                double num = Double.parseDouble(tokens[0].getStringValue());
                return new Number(num);
            } catch (NumberFormatException ex) {
                return new Constant(tokens[0].getStringValue());
            }
        }
       
        String[] signs = SIGNS_IN_ORDER ;;
        
        boolean found = false;
        int signIndex = 0;
        for(int i = 0; i < signs.length && (!found); i++)
         {
            for(int j = 0; j < tokens.length; j++) {
                if (signs[i].equals(tokens[j].getStringValue()) && !(tokens[j] instanceof Node)) {
                    found = true;
                    signIndex = j;
                    break;
                }
            }
        }
        
        // Rozdeli pole na lavu a pravu stranu vzhladom na najdene znamienko, na kazdu z nich zavola opat metodu treeer
        if (found) {
            Token[] leftPart = Arrays.copyOfRange(tokens, 0, signIndex);
            Token[] rightPart = Arrays.copyOfRange(tokens, signIndex + 1, tokens.length);
            // ziska podstrom z lavej casti
            Node left = treeer(leftPart);
            // ziska podstrom z pravej casti
            Node right = treeer(rightPart);
            
            // premenna pre znamienko
            String sign = tokens[signIndex].getStringValue();
            // vysledok
            Node root = null;
            // zistujeme ake znamienko sme nasli
            if (BinaryOperation.isBinary(sign.charAt(0))) {
                // ak binarne, tak vytvorime binarnu operaciu
                // a nastavime jej synov (left, right) a znamienko
                //      [+]
                //      / \
                //  left   right
                root = new BinaryOperation(left, right, sign.charAt(0));
            } else if (UnaryOperation.isUnary(sign)) {
                 if (UnaryOperation.isLeft(sign)){
                    root = new UnaryOperation(right, sign);}
                    else {
                    root = new UnaryOperation(left, sign);
                }    
            }
            return root;
        }
        else {
            // ak najdeme viac ako 1 token a nie je tam znamienko, tak je zle
            throw new RuntimeException("Sign expected.");
        }
        
    }
    
    
    /**
     *  Metóda handleBrackets sa stará o výrazy v zátvorkách.
     *  Keď nájde najvnútornejšiu zátvorku, obsah zátvoriek vyberie z listu a posunie ju metóde treeer.
     *  Na miesto vybraného výrazu v zátvorkách sa vráti jeho koreň a metóda pokračuje v hľadaní zátvoriek a ich obsahov. 
     *  Tie znovu posiela metóde treer, až kým nie je postavený celý strom.
     */
    private Node handleBrackets(ArrayList<Token> tokens)
    {
        // 
        tokens.add(0, new StringToken("("));
        tokens.add(new StringToken(")"));
        while (tokens.size() > 1) {
            prvy_for:
            for(int i = 0; i < tokens.size(); i++) {
                if (tokens.get(i).getStringValue().equals("(")) {
                    OUTER:
                    for (int j = i + 1; j < tokens.size(); j++) {
                        switch (tokens.get(j).getStringValue()) {
                            case "(":
                                break OUTER;
                            case ")":
                                Token[] exp_braces = new Token[j-i-1]; //expression between braces
                                // naplni, napriklad (3 + 5) => 3, +, 5
                                for (int p = 0; p < exp_braces.length; p++) {
                                    exp_braces[p] = tokens.get(p + i + 1); //tomuto nerozumiem preco p+i+1
                                }
                                // postavi strom z pola
                                Node hruska = treeer(exp_braces); 
                                // vymaze zatvorky aj s obsahom
                                tokens.subList(i+1,j+1).clear();
                                // miesto nich vlozi koren stromu
                                tokens.set(i, hruska);
                                // vyskoci von a zacne hladat znovu
                                break prvy_for;
                        }
                    }
                }
            }
                        
        }
        return (Node)tokens.get(0);
    }
    
    /**
     *  Metóda process rozparsuje zoznam tokenov na tokeny, pošle ich metóde hanadleBrackets
     */
    public Node process() 
    {
        // rozparsuje na tokeny
        ArrayList<Token> tokens = parse();
        // premeni na pole
        //Token[] tokensArray = tokens.toArray(new Token[0]);
        // posle treeeru, aby z toho spravil strom, ktory sa da potom vyhodnotit
        return handleBrackets(tokens);
    }
}
