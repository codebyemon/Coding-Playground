public class OOP8 {
    public static void main(String[]args){
        Dog d1 = new Dog();
        d1.name = "Rover";
        d1.bark();
        d1.eat("bread");
        d1.eat("bread",3);
        d1.eat("bread","meat");



        // mycal c1 = new mycal();
        // System.out.println(c1.add(4,5));
        // System.out.println(c1.add(3,4,5));
        // System.out.println(c1.add(4.7,5));
    }
}




class Dog{
    String name;

    Dog(){

    }

    void eat(String fd){
        System.err.println(name+" is eating "+fd);
    }

    void eat(String fd, int qu){
        System.err.println(name+" is eating "+qu+" "+fd);
    }

    void eat(String fd, String fd2){
        System.err.println(name+" is eating "+fd+" and "+fd2);
    }
    //When a class has multipal methods with same and different number of paramiters or data types of paramiter is called Method Overloading.

    void bark(){
        System.out.println(name+" is barking");
    }
}


// class mycal{
//     int add(int n1, int n2){
//         return n1+n2;
//     }

//     double add(double n1, int n2){
//         return n1+n2;
//     }


//     int add(int n1, int n2, int n3){
//         return n1+n2+n2;
//     }
// }