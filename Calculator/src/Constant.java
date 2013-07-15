/**
 * Trieda charakterizuje metódy pre zadané konštanty:
 * Ludolphovo a Eulerovo číslo, Avogadrovu a Boltzmannovu konštantu 
 * a univerzálnu plynovú konštantu.
 * 
 * @author Atenna
 * @version 16.12.2012
 */
public class Constant extends Node
{
    private String constant;
    
    /**
     * Metóda nastavuje hodnotu atribútu na zvolenú konštantu
     */
    
    public Constant(String constant)
    {
        this.constant = constant;
    }
    
    /**
     * Metóda, ktorá rozširuje abstraktnú triedu Node.
     * Definuje správanie sa kalkulačky pri operáciách s konštantami.
     */
    public double calculate()
    {
        if(constant.equals("pi")) //Ludolphian number
            return Math.PI;
        else if(constant.equals("e")) //Euler's number
            //return 2.7182818284590452353602874713527;
            return Math.E;
        else if(constant.equals("R")) //Gas constant
            return 8.314472;
        else if(constant.equals("Na")) //Avogadro constant
            return  6.0221415;
        else if(constant.equals("h")) //Planck constant
            return 6.62606896;
        else if(constant.equals("k")) //Boltzmann constant
            return 1.3806503882381376;
            
            throw new RuntimeException("Unknown constant.");
    }
    
    /**
     * Metóda, ktorú musí obsahovať každá trieda, ktorá implementuje Token.
     * Vracia hodnotu typu String.
     */
    public String getStringValue() 
    {
        return constant;
    }
}
