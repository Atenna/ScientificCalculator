/**
 * Trieda Node realizuje metódy rozhrania Token
 * Obsahuje chránené atribúty leftChild a rightChild, ktoré predstavujú vrcholy stromu
 * 
 * @author Atenna
 * @version 16.12.2012
 */
public abstract class Node implements Token
{
    protected Node leftChild;
    protected Node rightChild;
    //protected Node parent;

    /**
     * Parametrický konštruktor triedy Node, nastavuje vrcholy stromu
     */
    protected Node(Node leftChild, Node rightChild)
    {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
    
    /**
     * Metóda v sebe volá parametrický konštruktor, ktorého hodnoty premenných nastavuje na null
     */
    protected Node()
    {
        this(null, null);
    }
    
    /**
     * Abstraktná metóda, ktorú musí obsahovať každá trieda rozširujúca Node
     */
    public abstract double calculate();
    
    /**
     * Setter pre ľavého potomka
     */
    public void setLeftChild(Node leftChild)
    {
        this.leftChild = leftChild;
    }
    
    /**
     * Setter pre pravého potomka
     */
    public void setRightChild(Node rightChild)
    {
        this.rightChild = rightChild;
    }
    
    /**
     * Pomocná metóda, "nakreslí" postavený strom zo zadaného výrazu
     */
    protected void visualize(String[] rows, int level) {
        if (rows[level] == null)
            rows[level] = "";
        if (rows[level+1] == null)
            rows[level+1] = "";
        rows[level] += String.format("%" + 80 / ((1 << level) + 1) + "s",
            "[" + this.getStringValue() + "]");
        if (leftChild != null)
            leftChild.visualize(rows, level + 1);
        else
            rows[level + 1] += String.format("%" + 80 / ((1 << (level + 1)) + 1) + "s", "    ");
        if (rightChild != null)
            rightChild.visualize(rows, level + 1);
        else
            rows[level + 1] += String.format("%" + 80 / ((1 << (level + 1)) + 1) + "s", "    ");
    }
    
    public void visualize() {
        String[] rows = new String[10];
        visualize(rows, 0);
        for (String s : rows)
            if (s != null)
                System.out.println(s);
    }
}
