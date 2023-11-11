//Write a program to add two no, Input should be taken from user with the help commandline(hint: using command argument)
public class addtwoscommandline{
    public static void main(String args[]){
        int a, b;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        b=b+a;
        System.out.println(b);
    }
}