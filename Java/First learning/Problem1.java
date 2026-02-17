public class Problem1{
    public static void main(String[] args){
        Car c1 = new Car();
        c1.showInfo();

    }
}

class Car{
    String brand = "Toyota";
    String model = "Corolla";
    boolean year = true;

    Car(){

    }
    void showInfo(){
        System.out.println("Brand: "+brand+", Model: "+model+", Year: "+year);
    }
}