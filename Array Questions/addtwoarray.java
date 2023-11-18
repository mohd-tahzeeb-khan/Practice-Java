import java.util.*;
public class addtwoarray {
    public static void main(String[] args){
        int[] arr1=new int[5];
        int[] arr2=new int[5];
        int[] arr3=new int[5];
        Scanner obj=new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter Element for position" +i+ ":");
            arr1[i]=obj.nextInt();
        }
        for(int j=0; j<arr2.length; j++){
            System.out.println("Enter Element for Second array at position:" +j+ " :");
            arr2[j]=obj.nextInt();
        }
        for(int k=0; k<arr3.length; k++){
            arr3[k]=arr1[k]+arr2[k];
            System.out.println(arr3[k]);
        }
    }
}
