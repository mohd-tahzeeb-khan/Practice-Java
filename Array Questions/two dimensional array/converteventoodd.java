import java.util.Scanner;

public class converteventoodd {
    public static void main(String[] args){
        int[][] arr=new int[3][3];
        Scanner obj=new Scanner(System.in);
        for(int i=0; i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter no:");
                arr[i][j]=obj.nextInt();
            }
        }
         for(int i=0; i<3;i++){
            for(int j=0;j<3;j++){
               if (arr[i][j]%2!=0) {
                    arr[i][j]=arr[i][j]+1;
               }
            }
        }
         for(int i=0; i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    
}
