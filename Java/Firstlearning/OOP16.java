public class OOP16 {
    public static void main(String[]args){
        ABC a1 = new ABC(11);
        a1.method1();
        ABC a2 = new ABC(22);
        a2.method1();
        ABC.x = 10;
        a1.method1();
        a2.method1();
    }
}


class ABC{
    int temp;
    static int x = 4;

    ABC(int val){
        temp = val;
    }

    void method1(){
        int temp = 5;//local variable
        int x = 6;//local variable
        System.out.println(this.temp);//instance
        System.out.println(ABC.x);//static
        System.out.println(temp);//local
        System.out.println(x);//local
    }
}