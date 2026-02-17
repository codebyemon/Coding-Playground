public class OOP8 {
    public static void main(String[]args){
        //This program is connected with Animal2.java, Dog2.java, Cat2.java, Fish.java.


        //Method overriding = When a subclass provides its own
        //                    implementation fo a method that is already defined.
        //                    Allows for code resusability and give specific implementation.
        Dog2 dog = new Dog2();
        Cat2 cat = new Cat2();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();


    }
}
