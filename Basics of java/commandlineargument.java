//Write a program to take argument from the command line at run time.
public class commandlineargument {
    public static void main(String[] args){
        String name, roll, address;
        name=args[0];
        roll=args[1];
        address=args[2];
        System.out.println("Name is ->"+name);
        System.out.println("Roll no is ->" +roll);
        System.out.println("Address is ->"+address);
    }
}
