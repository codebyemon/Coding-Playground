public class OOP6 {
    public static void main(String[]args){
        // This program is connected with Animal.java, Dog.java, Cat.java,Organism.java, Plant.java

        // Inheritance = One class inherits the attributes and methods
        //               from another class. Child <- Parent <- Grandparent
        //                     Organism
        //                         |
        //               Animal -------- Plat
        //                  |
        //          Dog -------- Cat

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        dog.eat();
        cat.eat();

        System.out.println(dog.lives);
        System.out.println(cat.lives);
        dog.speak();
        cat.speak();

        System.out.println(plant.isAlive);
        plant.photosynthesise();
        


    }
}

