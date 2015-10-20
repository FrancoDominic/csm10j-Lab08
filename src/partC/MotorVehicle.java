
package partC;

public abstract class MotorVehicle 
{
    private String name;
    
    public String getName()
            {
              return name;
            }
    
    public MotorVehicle(String name)
    {
        this.name = name;
    }
    
    public abstract void TurnOn();
    
    public abstract void TurnOff();
   
}

