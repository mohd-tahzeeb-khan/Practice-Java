//Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.
import java.util.*;
class person{
    private String firstname;
    private String lastname;
    Scanner input=new Scanner(System.in);
    String getfname(){
        System.out.println("Enter your First Name: ");
        firstname=input.next();
        return firstname;
    }
    String getlname(){
        System.out.println("Enter your Last Name: ");
        lastname=input.next();
        return lastname;
    }
}
class employe extends person{
    private int id;
    private String jobtitle;
    int getjid(){
        System.out.println("Enter your ID: ");
        id=input.nextInt();
        return id;
    }
    @Override
    String getlname(){
        System.out.println("Enter your job title: ");
        jobtitle=input.next();
        return jobtitle;
    }
}


public class employee {
    public static void main(String[] args) {
        person objperson=new person();
        employe objemploye=new employe();
        int id;
        String lname, fname, job;
        id=objemploye.getjid();
        lname=objperson.getlname();
        fname=objperson.getfname();
        job=objemploye.getlname();
        System.out.println("Name= "+fname+" "+lname+" who have a id= "+id+" with job title= "+job);
    }   
}
