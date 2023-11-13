//Write a java program to store array in 2-dimensional array.
public class storingdatainarray {
    public static void main(String[] args){
         int[][] arr=new int[5][5];
         int i;
         int k;
        for(i=0;i<5;i++){
        for(k=0; k<5;k++){
            arr[i][k]=i+k;
            }
        }
        for(i=0; i<5; i++){
            for(k=0;k<5;k++){
                System.out.println(arr[i][k]);
            }
        }
   
    }
    }