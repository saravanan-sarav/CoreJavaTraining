package L_Collections.ArrayList;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Student> stdDbObj = new ArrayList<>();

//        Create Object and Add to Array
        Student std = new Student(1, "Saravanan");
        stdDbObj.add(std);

//        Add Direct without declaring Variable
        stdDbObj.add(new Student(2, "Rajeshuu"));

//        Set Value Using Setter Method
        Student std1 = new Student();
        std1.setName("Sarav");
        std1.setRollNo(3);
        stdDbObj.add(std1);

//        Printing Values
        for(Student student : stdDbObj){
            System.out.println("---Before Edit---");
            System.out.println(student.getName());
        }

//        Removing an Object
        stdDbObj.remove(1);
        for(Student student : stdDbObj){
            System.out.println("---After Removing---");
            System.out.println(student.getName());
        }
//        Edit the Object in Array
        for(Student student : stdDbObj){
           String name = "Saravanan S";
            stdDbObj.set(2,new Student(10,name));
        }

        for(Student student : stdDbObj){
            System.out.println("----After Edit----");
            System.out.println(student.getRollNo());
            System.out.println(student.getName());
        }
    }
}
