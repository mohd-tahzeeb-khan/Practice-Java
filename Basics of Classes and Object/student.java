//Write a Java program to create a class called "Studentdetail" with a name, grade, and courses attributes, and methods to add and remove courses.
import java.util.*;
class studentdetail{
    private String name;
    private char grade;
    private String courses;
    public studentdetail(String name, char grade, String courses) {
        this.name=name;
        this.grade=grade;
        this.courses=courses;
    }
    String send_name(){
        return this.name;
    }
    char send_grade(){
        return this.grade;
    }
    String send_courses(){
        return this.courses;
    }
}
public class student {
    public static void main(String[] args) {
        studentdetail obj=new studentdetail("Rohan", 'A', "CSE");
        String getname=obj.send_name();
        char getgrade=obj.send_grade();
        String getcourse=obj.send_courses();
        System.out.println(getname);
        System.out.println(getgrade);
        System.out.println(getcourse);
        obj=null;
        String name2=obj.send_name();
        System.out.println(name2);

    }
    
}
