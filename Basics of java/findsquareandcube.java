//find square and cube of a no taken form cmd, and validate the input before processing it.
public class findsquareandcube {
   public static void main(String[] args){
        if(args.length==1){
            int a=Integer.parseInt(args[0]);
            int cube=a*a*a;
            int sqrt=a*a;
            System.out.println("Square of a N0 is: "+sqrt);
            System.out.println("Cube of a No is: "+cube);
        }
        else{
            System.out.println("enter the no");

        }
   } 
}
