import java.io.*;
import java.util.*;

public class Question4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName="data.txt";
        ArrayList<Student> st = new ArrayList<>();
        st.add(new Student(111,"Emon",4.00));
        st.add(new Student(123,"Shible",3.00));
        st.add(new Student(124,"Rupom",2.00));

        try(BufferedWriter w = new BufferedWriter(new FileWriter(fileName,true))){
            for(Student s : st){
                w.write(s.toString());
                w.newLine();
            }
            System.out.println("Data successfully written to " + fileName);
        }catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }

        System.out.print("Enter the student id for search: ");
        int searchId = sc.nextInt();
        boolean found = false;


        try(BufferedReader r = new BufferedReader(new FileReader(fileName))){
            System.out.println("Searching for Student ID " + searchId + "...");
            String line;
            while((line = r.readLine())!=null){
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                if (id == searchId) {
                    String name = parts[1];
                    double cgpa = Double.parseDouble(parts[2]);
                    Student s = new Student(id, name, cgpa);
                    System.out.println("Student Found: " + s);
                    found = true;
                    break;
                }
            }
        }catch(IOException e){
            System.out.println("Error reading file.");
        }
        if(!found){
            System.out.println("Student not found.");
        }
        
           
    }
}

class Student{
    private int id;
    private String name;
    private double cgpa;
    Student(int id,String name,double cgpa){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }
    public int getId(){return id;}
    public String toString(){
        return id+","+name+","+cgpa;
    }
}