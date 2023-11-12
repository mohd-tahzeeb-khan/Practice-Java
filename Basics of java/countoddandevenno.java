//write a program count the no of odd and even no in the input. Input should be from cmd
public class countoddandevenno {
    public static void main(String[] args) {
        int counteven=0;
        int countodd=0;
        for(int i=0; i<args.length;i++){
            int temp=Integer.parseInt(args[i]);
            if(temp%2==0){
                counteven++;
            }
            else{
                countodd++;
            }  
        }
        System.out.println("total count for even no is:" +counteven);
        System.out.println("total count of odd no: "+countodd);
        }
    }
