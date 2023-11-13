//Write a program to store n nos in array, input shoudl be from user
public class store_n_nosinarray {
    public static void main(String args[]){
        int nno[]=new int[args.length];
        int i;
        for(i=0; i<args.length;i++){
            nno[i]=Integer.parseInt(args[i]);
        }
        for(i=0;i<args.length;i++){
            System.out.println(nno[i]);
        }
    }
}
