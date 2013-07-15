/**
 * Trieda rozširuje abstraktnú triedu Node.
 * V triede sú definované metódy na správanie sa kalkulačky pre binárne metódy.
 * 
 * @author Atenna
 * @version 31.3.2013
 */
public class BinaryOperation extends Node
{
    private char sign; 
    private static final char[] SIGNS = new char[]{'+', '-', '/', '*', '^', 'C'};
    
    /**
     * Konštruktor pre binárne operácie, volá konštruktor Node pre pravého a ľavého potomka, medzi ktorých nastavuje znak
     */
    public BinaryOperation(Node leftChild, Node rightChild, char sign)
    {
        super(leftChild, rightChild);
        this.sign = sign;
    }

    /**
     * Konštruktor pre binárne operácie, ak v zadanom rozparsovanom výraze, z ktorého sa stavia strom, ostane už len koreň stromu
     */
    public BinaryOperation(char sign)
    {
        this(null, null, sign);
    }

    /**
     * Metóda, ktorá podľa znamienka zisťuje, či je operácia binárna alebo nie.
     */
    public static boolean isBinary(char sign)
    {
        for(int i = 0; i < SIGNS.length; i++) {
            if(SIGNS[i] == sign) {
                return true;
            }
        }
        return false;        
    }
    
    /**
     * Metóda triedy, ktorá zoraďuje znamienka podľa precedencie do poľa.
     * (podľa neho bude porovnávať znamienka vo výraze pri stavaní stromu)
     */
    public static String[] getSignsInOrder()
    {
        String[] array_signs = new String[SIGNS.length];
        for(int k = 0; k < array_signs.length; k++) {
            array_signs[k] = SIGNS[k]+"";
        }
        return array_signs;
    }
    
     @Override
    public double calculate()
    {
        double a = leftChild.calculate();
        double b = rightChild.calculate();
        switch (sign) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '/':
                return a / b;
            case '*':
                return a * b;
            case '^':
                return exp(a, b);
            case 'c':
                if (a > 0 && b > 0 && a > b) {
            return fakt(a)/fakt(b)/fakt(a - b);
        }
                else {
            throw new IllegalArgumentException("n or k is negative or k is smaller than n."
            + "\nDon't be so negative (: \n");
        }
            case 'C':
                 if (a > 0 && b > 0 && a > b) {
            return fakt(a)/fakt(b)/fakt(a - b);
        }
                 else {
            throw new IllegalArgumentException("n or k is negative or k is smaller than n."
            + "\nDon't be so negative (: \n");
        }
            
            default: return 0;
        }
    }
    
    /**
     * Metóda, ktorá vypočíta a umocnené na b.
     */
    public double exp(double a, double b)
    {
        double c = 1;
        for(int i = 0; i<b; i++) {
            c *= a;
        }
        return c;    
    }
    
    /**
     * Metóda, ktorú musí obsahovať každá trieda implementujúca Tokens
     * Vracia hodnotu typu String.
     */
    @Override
    public String getStringValue()
    {
      return sign + "";  
    }
    
    public static long fakt(double m) 
    {
       long result = 1;
       if (m < 0) {
           throw new IllegalArgumentException("negative");
       }
       else if (m > 100) {
           throw new IllegalArgumentException("too big");
       }
       else {
           for (int i = 2; i <= m; i++) {
               result *= i;
           }
       }
       return result;
   }
}
