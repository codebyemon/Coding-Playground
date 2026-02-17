public class OOP7 {
    public static void main(String[] args){
        mycal c1 = new mycal();
        c1.add1(4,5);
        System.out.println(c1.add2(3,4));

    }
}

class mycal{
    int r;
    void add1(int n1, int n2){
        System.out.println(n1+n2);
    }

    int add2(int n3, int n4){
        return n3+n4;
    }
}