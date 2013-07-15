/**
 * Trieda charakterizuje metódy pre zadané čísla
 * 
 * @author Atenna
 * @version 31.3.2013
 */
public class Number extends Node
{
    private double aValue;
    
    public Number(double paValue)
    {
        this.aValue = paValue;
    }

    @Override
    public double calculate()
    {
        return aValue;
    }
    
    @Override
    public String getStringValue()
    {
        return aValue + "";
    }
}
