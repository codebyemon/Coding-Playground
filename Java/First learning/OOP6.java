public class OOP6 {
    public static void main(String[] args){
        Cat c1 = new Cat();
        c1.m1(5);
        
    }
}

class Cat{
    int x = 10;
    
    void m1(int x){
        System.out.println(x);//Local variable is printing
        System.out.println(this.x);//Instance variable is printing
    }
}