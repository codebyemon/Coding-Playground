public class OOP4 {
    public static void main(String[]args){
        //Array of objects.
        //This program is connected with Car2.java


        // Car2 car1 = new Car2("Mustang", "Red");
        // Car2 car2 = new Car2("Corvette","Blue");
        // Car2 car3 = new Car2("Charger","Yellow");
        // Car2[] cars = {car1,car2,car3};

        //Car2[] cars = new Car2[3];
        // cars[0]=car1;
        // cars[1]=car2;
        // cars[2]=car3;

        Car2[] cars = {new Car2("Mustang", "Red"),
                       new Car2("Corvette","Blue"),
                       new Car2("Charger","Yellow")
        };
       
        // for(int i=0;i<cars.length;i++){
        //     cars[i].drive();
        // }

        for(Car2 car : cars){
            car.drive();
            car.color = "black";
        }

        for(Car2 car : cars){
            car.drive();
        }


    }
}
