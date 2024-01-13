import java.util.*;
public class positive_negative {
    public static void main(String[] args) {
        find obj1=new find();
        find obj2=new find();
        find obj3=new find();
        find obj4=new find();
        find obj5=new find();
        obj1.setter();
        obj1.check();
        obj2.setter();
        obj2.check();
        obj3.setter();
        obj3.check();
        obj4.setter();
        obj4.check();
        obj5.setter();
        obj5.check();
        obj1.out();
    }
    
}
class find{
    Scanner input=new Scanner(System.in);
    static int positive;
    static int negative;
    int value;

    void setter(){
        System.out.println("Enter Integer value");
        value=input.nextInt();
    }
    void check(){
        if(value>=0){
            positive++;
        }
        else{
            negative++;
        }
    }
    void out(){
        System.out.println("Positive no= " +positive);
        System.out.println("Negative no= "+negative);
    }
}