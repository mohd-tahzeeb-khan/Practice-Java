//Write a program to find largest and the smallest no in array. Input should be from cmd
public class findlargestandsmallestno {
    public static void main(String args[]){
        int arr[]=new int[args.length];
        int i;
        int largest=0;
        int smallest=9999999;
        for(i=0;i<args.length;i++){
            arr[i]=Integer.parseInt(args[i]);
        }
        for(i=0;i<args.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        for(i=0;i<args.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        
            System.out.println("largest no: "+largest);
        System.out.println("smallest no: "+smallest);
        }
    }

