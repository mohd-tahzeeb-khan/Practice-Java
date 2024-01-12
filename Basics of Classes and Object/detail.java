//WAP to enter the details of  the student using classes and object
import java.util.*;
class student {
    int roll;
    String name;
    String mobile;
    String address;
    int age;
    Float percentage;
    Scanner input=new Scanner(System.in);
    student(){
        System.out.print("Enter your Roll No: ");
        roll=input.nextInt();
        System.out.print("Enter you Name:");
        name=input.next();
        System.out.print("Enter you mobile No:");
        mobile=input.next();
        System.out.print("Enter your Address");
        address=input.next();
        System.out.print("Enter your Age");
        age=input.nextInt();
        System.out.print("Enter your Percentage");
        percentage=input.nextFloat();
    }
    void Print(){
        System.out.println(roll);
        System.out.println(name);
        System.out.println(mobile);
        System.out.println(address);
        System.out.println(age);
        System.out.println(percentage);
    }
}
public class detail{
    public static void main(String[] args){
        student obj=new student();
        obj.Print();

}
}
