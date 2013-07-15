/**
 * Trieda Token založená na reťazci (String)
 * 
 * @author Atenna
 * @version 16.12.2012
 */
public class StringToken implements Token
{
    private String aValue;
    
    /**
     * Konštruktor pre StringToken, nastavuje String hodnotu atribútu
     */
    public StringToken(String paValue)
    {
        this.aValue = paValue;
    }
    
    /**
     * Getter hodnoty typu String
     */
    public String getStringValue()
    {
        return aValue;
    }
}

