import java.util.*;
public class OOP4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        House h1 = new House();

        h1.input();

        h1.view();

        int door;
        int window;

        System.out.print("Number of doors you want to increase: ");
        door = sc.nextInt();
        System.out.print("Number of windows you want to increase: ");
        window = sc.nextInt();
        
        h1.incrDoor(door);
        h1.incrWindow(window);

        h1.view();
    }
}

class House{
    Scanner sc = new Scanner(System.in);
    int window;
    int door;

    void input(){
        door = sc.nextInt();
        window = sc.nextInt();
    }

    void incrWindow(int win){
        this.window = window+win;
    }

    void incrDoor(int dr){
        this.door = door+dr;
    }

    void view(){
        System.out.println(window + " " + "windows" + " " + "and" + " " + door + " " + "doors");
    }
}