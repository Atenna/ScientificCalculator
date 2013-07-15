import java.util.*;

/**
 * Trieda ktorá otvorí konzolu, ukáže používateľovi svoje funkcie a návod a povolí mu zadávať výrazy.
 * 
 * @author Atenna
 * @version 16.12.2012
 */
public class Calculator
{
/**
 * Hlavná metóda triedy Calculator.
 * Otvára konzolu, na ktoru píše stručný návod s funkciami kalkulačky.
 * Do konzoly sú zadávané výrazy a tiež vypisované ich výsledky.
 * Po zadaní kľúčového slova help sa zobrazí úvodný stručný návod.
 * Po zadaní kľúčového slova exit sa zavrie Scanner a kalkulačka sa rozlúči s používateľom.
 */    

private static void help()
{
     String help = "\f*****SCIENTIFIC CALCULATOR*****\n\n"
        +"SUPPORTED BINARY OPERATIONS:\n"
        +"| + | - | * | / | c | ^ |"
        +"\n\nSUPPORTED UNARY OPERATIONS:\n"
        +"| sin | asin | cos | acos | \n"
        +"| tan | atan | log | ln | ! |"
        +"\n\nSUPPORTED CONSTANTS:\n"
        +"| e | pi | R | Na | h | k |"
        +"\n__________________________________________\n\n"
        + "Type your expression below.\n"
        +"Note that using brackets is allowed."
        +"\nTo show help, please type: help."
        +"\nTo end the calculator, please type: exit."
        +"\n__________________________________________\n\n";
     System.out.println(help);
}

public static String main(String expression)
    {
        String vysledok = "";
        //help();
        //do
        //{
            /*
            if (expression.equals("help")) {
                // PREROBIT HELP
                return vysledok;
            }
            else if (!expression.equals("exit")) {
                try {
                    Parser parser = new Parser(expression);
                    System.out.println("= " + parser.process().calculate() + "\n");
                } catch (Exception ex) {
                    System.out.println("Incorrect format of expression: "+ex.getMessage()+"\n");
                }
            }
            else if (expression.equals("I love you")) {
                System.out.println("I love you too (:");
            }*/
        //}
      
        //while(!expression.equals("exit"));
        /*
        if(expression.equals("exit")) {
            System.out.print("\nSee you later, alligator (:");
        }
        */
        
        try {
            Parser parser = new Parser(expression);
            vysledok+="= " + parser.process().calculate() + "\n";
            } catch (Exception ex) {
                    vysledok = "Incorrect format of expression: "+ex.getMessage()+"\n";
                }
        
        return vysledok;
    }
}
