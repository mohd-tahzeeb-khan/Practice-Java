//Write a program to n nos in array and find the sum of all the no that are stored in array

public class nnoinarrayandfindsum {
    public static void main(String args[]){
        int no[]=new int[args.length];
        int sum, i;
        sum=0;
        for(i=0;i<args.length;i++){
            no[i]=Integer.parseInt(args[i]);
        }
        for(i=0;i<args.length; i++){
            sum=no[i]+sum;
        }
        System.out.println(sum);
    }
}
