/**
 * Lab 08 CSM10J
 * Abstract classes, inheritance
 * super methods
 *
 * @author johnr
 */
public class Program {

 public static void TestPartA(){
 System.out.println("Part A");
 partA.Car car = new partA.Car();
 car.TurnOn();
 car.TurnOff();
 }

 public static void TestPartB(){
 System.out.println("Part B");
 partB.Car car = new partB.Car("Cadillac");
 System.out.println("Car is a " + car.getName());
 }

 public static void TestPartC(){
 System.out.println("Part C");
 partC.Convertible mercedes = new partC.Convertible("SL550", false);
 mercedes.TurnOff();
 }

 public static void main(String[] args){

 // Uncomment the code in TestPartA after completing part A
 TestPartA();
 // expected output
 // Car is starting
 // Car is stopping
 System.out.println();

 // Uncomment the code in TestPartB after completing part B
 TestPartB();
 // expected output
 // Car is a Cadillac
 System.out.println();

 // Uncomment the code in TestPartC after completing part C
 TestPartC();
 // expected output
 // Putting top up
 // SL550 is stopping
 System.out.println();
 }
} 
