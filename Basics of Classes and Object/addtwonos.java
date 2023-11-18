//Write a program to add two nos using classes and object
import java.util.*;
class add{
    add(){
        int a,b,c;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter First no: ");
    a=obj.nextInt();
    System.out.println("Enter second no: ");
    b=obj.nextInt();
    c=a+b;
    System.out.println(c);
    }

}
public class addtwonos {
    public static void main(String[] args){
        add addobj=new add();
    }
}
