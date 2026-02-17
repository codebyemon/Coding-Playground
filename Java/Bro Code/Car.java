public class Car{
    // This class is for OOP1.java
    String make = "Frod";
    String model = "BMW";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }
    void stop(){
        isRunning = false;
        System.out.println("You stop the engine");
    }
    void drive(){
        System.out.println("You drive the "+model);
    }
    void brake(){
        System.out.println("You brake the "+model);
    }
    
}
