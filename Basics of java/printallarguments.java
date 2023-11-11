//Write a program to print all argument of the class.
public class printallarguments {
    public static void main(String args[]){
        String arg;
        int i;
        for(i=0; i<args.length;i++){
            System.out.println("Argument at position "+i+" is "+args[i]);
        }
    }
}
