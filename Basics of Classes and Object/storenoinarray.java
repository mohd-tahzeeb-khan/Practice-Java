import java.util.*;
class store{
    store(){
        int[] arr1=new int[5];
        Scanner obj=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter no: ");
            arr1[i]=obj.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println(arr1[i]);
        }
    }
}
public class storenoinarray {

    public static void main(String[]  args){
        store aobj=new store();
    }
}