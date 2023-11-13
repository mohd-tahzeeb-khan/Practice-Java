//Find sum of all even nos in array
public class sumofevenno {
    public static void main(String args[]){
        int arr[]={12,15,1,5,45,52,12,41,325,35};
        int i;
        int sum=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sum=sum+arr[i];            
            }
        }
        System.out.println(sum);
    }
}
