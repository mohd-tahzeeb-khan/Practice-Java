//Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.
import java.util.*;
class employeedetails{
    String name;
    String job;
    float salary;
    employeedetails(String name, String job, float salary){
        this.name=name;
        this.job=job;
        this.salary=salary;
    }
    Float setter(float salary){
        this.salary=salary;
        return this.salary;
    }
    void printemployee(){
        System.out.println(this.name);
        System.out.println(this.job);
        System.out.println(this.salary);
    }

}
public class employee {
    public static void main(String[] args) {
        employeedetails obj=new employeedetails("Mohammad Tahzeeb Khan", "Human Resource Head Developer", 266666);
        obj.printemployee();
        obj.setter(282000);
        obj.printemployee();
    }
}
