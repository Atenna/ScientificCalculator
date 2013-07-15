/**
 * Class implements abstract class Node
 * Defines behavior of calc. for unary operations
 * 
 * @author Atenna
 * @version 31.3.2013
 */
public class UnaryOperation extends Node
{
   private String sign; 
    private static final String[] SIGNS = new String[] {
        "!", "sin", "asin", "cos", "acos", "tan", "atan", "ln", "log"
    };
    
    /**
     * Konštruktor pre ľavostranné unárne operácie, volá konštruktor Node potomka a nastavuje znak
     */
    public UnaryOperation(Node child, String sign)
    {
        super(child, null);
        this.sign = sign;
    }

     /**
     * Konštruktor pre pravostranné unárne operácie, volá konštruktor Node potomka a nastavuje znak
     */
    public UnaryOperation(String sign)
    {
        this(null, sign);
    }

    /**
     * no need to comment
     */
    public static boolean isUnary(String sign)
    {
        for(int i = 0; i < SIGNS.length; i++) {
            if(SIGNS[i].equals(sign))
                return true;
        }
        return false;        
    }
    
    /**
     * Metóda zisťujúca, či je operácia ľavostranná.
     */
    public static boolean isLeft(String sign)
    {
        if (sign.equals("!")){
            return false;}
        return true;
    }
    
    public static String[] getSignsInOrder()
    {
        return SIGNS;
    }
    
    /**
     * extends Node, defines 'behavior' of Calc within processing unary op.
     * not sure if it is a good idea to convert these ifs into switch 
     * //just taking into consideration older versions of java eg at my school
     */
    @Override
    public double calculate()
    {
        double a = leftChild.calculate();
        if (sign.equals("!")){
            return fakt(a);}
        else if (sign.equals("sin")){
            return Math.sin(toRad(a));}
        else if (sign.equals("asin")){
            return toDeg(Math.asin(a));}
        else if (sign.equals("cos")){
            return Math.cos(toRad(a));}
        else if (sign.equals("acos")){
            return toDeg(Math.acos(a));}
        else if (sign.equals("tan")){
            return Math.tan(toRad(a));}
        else if (sign.equals("atan")){
            return toDeg(Math.atan(a));}
        else if (sign.equals("ln")){
            return Math.log(a);}
        else if (sign.equals("log")){
            return Math.log10(a);}
        else {
            return 0;
        }
        
    }
    
    /**
     * convert degreees to radians
     */
    private static double toRad(double degrees) 
    {
        return degrees * (Math.PI / 180);
    }
    
    /**
     * convert radians to degrees
     * don't know why did i implemented already implemented method in java
     */
    private static double toDeg(double radians)
    {
        return radians * (180 / Math.PI);
    }
    
    @Override
    public String getStringValue()
    {
        return sign;
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
