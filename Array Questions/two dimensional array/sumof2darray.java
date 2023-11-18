//Write a program to find the sum of 2d array. the size of the array will be 3x3. Input for the array will be taken from cmd
public class sumof2darray {
    public static void main(String[] args){
        int[][] arr=new int[3][3];
        int i, k;
        int sum=0;
        for(i=0;i<3;i++){
            for(k=0;k<3;k++){
                arr[i][k]=Integer.parseInt(args[i]);
            }
        }
        for(i=0;i<3;i++){
            for(k=0;k<i;k++){
                System.out.println(arr[i][k]);

                sum=sum+arr[i][k];
            }
        }
        System.out.print("Sum of the array is: "+sum);
    }
}
