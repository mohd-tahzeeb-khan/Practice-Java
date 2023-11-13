//Write a Java program to check if the sum of all the no in the array is exactly 45. Return false if the condition does not satisfy, otherwise true.
public class checkthesum {
    public static void main(String args[]){
        int arr[]={45,34,5,3,4,3,3,3,2,3,4,5,6,5,54,5,44,4};
        int i, sum=0;
        for(i=0;i<18;i++){
            sum=sum+arr[i];
        }
        if (sum==45) {
            System.out.println("Total is exactly 45");
        }
        else{
            System.out.println("Total is not equal to 45, totla is: "+sum);
        }
    }
}
