//Store 5 no into the array
public class storeelementsinarray{
    public static void main(String args[]){
        int arr[]=new int [5];
        int i;
        for(i=0; i<5;i++){
            arr[i]=i+1;
        }
        for(i=0; i<5;i++){
            System.out.println("Content on= "+arr[i]);
        }
    }
}