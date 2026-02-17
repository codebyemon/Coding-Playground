public class OOP1 {
    public static void main(String[]args){
        // This program is connected with Car.java
        
        // Object = An entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It is a reference data type.
        Car car = new Car();
        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);
        car.drive();
        car.brake();
    }
}




