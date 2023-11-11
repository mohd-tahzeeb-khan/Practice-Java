//Find largest between two no using commandline arguments
public class findlargest {
    public static void main(String args[]){
        int no2,no1,i;
        
            no1=Integer.parseInt(args[0]);
            no2=Integer.parseInt(args[1]);
            if(no1>no2){
                System.out.println("Largest no is: "+no1);
    }if(no1<no2){
        System.out.println("Largest no is: "+no2);
    }else{
        System.out.println("Both the nos are equal");
    }
        
    }
}
