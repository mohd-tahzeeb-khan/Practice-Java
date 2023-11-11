//Convert the String into Integer and add substract two nos, by using commandline arguments
public class convert_string_into_Integer {
    public static void main(String args[]){
        int i, a;
        for(i=0; i<args.length;i++){
            a=Integer.parseInt(args[i]);
            System.out.println(a);   
        }
    }
}
