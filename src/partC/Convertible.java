
package partC;

public class Convertible extends Car
{
    private boolean topUp;
    
    public Convertible(String name, boolean topUp)
    {
        super(name);
        topUp = this.topUp;
    }
    
    public void putTopUp()
    {
        topUp = true;
        System.out.println("Putting top up");
    }
    
    @Override
    public void TurnOff()
    {
        putTopUp();
        
        super.TurnOff();
    }
    
}
