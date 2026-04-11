import javax.swing.*;
import java.awt.Color;
public class Practice {
    public static void main(String[] args) {
        MyLable myLable = new MyLable();

        MyFrame myFrame = new MyFrame();
        myFrame.add(myLable);
        
       
       
    }
    
}

class MyFrame extends JFrame{
    MyFrame(){
        this.setTitle("Emon Hossain");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(420,420);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(255,255,255));
        
    }

}

class MyLable extends JLabel{
    MyLable(){
        this.setText("Emon");
        
        
    }


}