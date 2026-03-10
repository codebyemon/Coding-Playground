public class OOP11 {
    public static void main(String[]args){
        /* Interface = A blueprint for class that specifies a set of abstact methods
                       that implementing classes must define.
                       Supports multiple inheritance-like behavior. */

        Rabbit r1 = new Rabbit();
        Hawk h1 = new Hawk();
        Fish f1 = new Fish();
        r1.flee();
        h1.hunt();
        f1.flee();
        f1.hunt();
    }
}
