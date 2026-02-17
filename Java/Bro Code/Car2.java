public class Car2 {
    // This class is for OOP4.java
    String model;
    String color;
    
    Car2(String model,String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("You drive the "+this.color+" "+this.model);
    }
}
