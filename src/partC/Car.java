
package partC;

public class Car extends MotorVehicle
{
    public Car(String name)
    {
        super(name);
    }
    
    @Override
    public void TurnOn()
    {
        System.out.println(super.getName() + " is starting");
    }
    
    @Override
    public void TurnOff()
    {
        System.out.println(super.getName() + " is stopping");
    }
    
}    