//write a java program to find you birthdate in array. Input of the array should be from cmd
public class findbirthdate {
    public static void main(String args[]){
        int arr[]=new int[args.length];
        int date=8;
        int flag=0;
        int i;
        for(i=0;i<args.length;i++){
            arr[i]=Integer.parseInt(args[i]);
        }
        for(i=0;i<args.length;i++){
            if(arr[i]==date){
                flag++;
            }
            
        }
        if(flag>0){
            System.out.print("Birthdate found!");
        }
        else{
            System.out.print("Birthdate not found!");
        }
    }
}
