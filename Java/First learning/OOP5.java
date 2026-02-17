public class OOP5 {
    public static void main(String[] args){
        Cat c1 = new Cat();
        c1.color = "White";
        Cat c2 = new Cat();
        c2.color = "Purple";
        System.out.println("c1 =======");
        c1.details();
        System.out.println("c2 =======");
        c2.details();
        c1.changeAction("Jumping");
        System.out.println("c1 =======");
        c1.details();
        System.out.println("c2 =======");
        c2.details();
    }
    
}

class Cat{
    String color;
    String action = "sitting";

    void changeAction(String action){
        this.action = action;
    }

    void details(){
        System.out.println(color+" cat is "+action);
    }
}