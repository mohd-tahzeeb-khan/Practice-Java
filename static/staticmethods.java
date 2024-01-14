//wap to use static variable & function to count even and odd.
import java.util.*;
class calculatevenodd{
    private int inputno;
    static int even, odd;
    Scanner input=new Scanner(System.in);
    void input(){
        System.out.println("Enter the No: ");
        inputno=input.nextInt();
    }
    void check(){
        if(inputno%2==0){
            even++;
        }
        else{
            odd++;
        }
    }
    static void printresult(){
        System.out.println("Total Even nos are: "+even);
        System.out.println("Total Odd nos are" + odd);
    }

}
public class staticmethods {
    public static void main(String[] args) {
        calculatevenodd obj1=new calculatevenodd();
        calculatevenodd obj2=new calculatevenodd();
        calculatevenodd obj3=new calculatevenodd();
        obj1.input();
        obj1.check();
        obj2.input();
        obj2.check();
        obj3.input();
        obj3.check();
        calculatevenodd.printresult();
    }
}
