public class Loop4 {
    public static void main(String[]args)throws InterruptedException{
        //Count down for happy new year.

        int start = 10;
        for(int i=start;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy New Year");


    }
}
