public class OOP14 {
    public static void main(String[]args){
        Player sakib = new Player();
        Player tamim = new Player();
        System.out.println("Team Run: "+Player.teamRun);
        tamim.hitFour();
        System.out.println("Team Run: "+Player.teamRun);
        tamim.hitFour();
        System.out.println("Team Run: "+Player.teamRun);
        sakib.hitSix();
        System.out.println("Team Run: "+Player.teamRun);
        System.out.println("Sakib Run: "+sakib.run);
        System.out.println("Tamim Run: "+tamim.run);
        
    }
}


class Player{
    int run = 0;//instance variable. Instance variable is object dependent.
    static int teamRun = 0;//Static variable. Static variable is object independent.
    
    void hitFour(){
        run = run + 4;
        teamRun = teamRun + 4;
    }

    void hitSix(){
        run = run + 6;
        teamRun = teamRun + 6;
    }
}