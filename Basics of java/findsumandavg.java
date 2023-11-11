//find sum and avg of nos, input from cmd
public class findsumandavg {
    public static void main(String args[]){
        int i,sum, avg, a;
        sum=0;
        for(i=0; i<args.length;i++){
           a=Integer.parseInt(args[i]);
           sum=sum+a; 
        }
        avg=sum/args.length;
        System.out.println("Sum of no is: "+sum);
        System.out.println("Average of no is" +avg);
    }
}
