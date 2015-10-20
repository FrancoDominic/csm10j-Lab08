
package partA;


public class Car extends MotorVehicle
{
    @Override
    public void TurnOn()
    {
        System.out.println("Car is starting");
    }
    
    @Override
    public void TurnOff()
    {
        System.out.println("Car is stopping");
    }
}    