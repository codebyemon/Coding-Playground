public class Variable1 {
    static int x = 3;//Class Scope
    public static void main(String[]args){
        int x =1;//Local Scope
        System.out.println(x);
        doSomething();

    }
    static void doSomething(){
        int x =2;//Local Scope
        System.out.println(x);
    }
}
