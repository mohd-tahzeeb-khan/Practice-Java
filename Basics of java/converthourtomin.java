//convert hours into min using cmdline argument
public class converthourtomin {
    public static void main(String args[]){
        if(args.length==1){
            int hr=Integer.parseInt(args[0]);
            int min=hr*60;
            System.out.println(hr+ " hours are "+min+" Mins");
        }else{
            System.out.println("Please enter correct argument");
        }
    }
}
