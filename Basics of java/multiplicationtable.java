public class multiplicationtable {
    public static void main(String args[]){
        if(args.length==1){
            int no=Integer.parseInt(args[0]);
            for(int i=0; i<=10;i++){
                System.out.println(no+" x "+i+" = "+i*no);
            }
        }
    }
}
