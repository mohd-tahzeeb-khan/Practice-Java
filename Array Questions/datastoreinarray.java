//write a program to store 10 elements in the array and display the array using for loop
public class datastoreinarray{
    public  static void main(String args[]){
        int no[]=new int[11];
        for(int i=1; i<=10; i++){
            no[i]=i;
        }
        for(int i=1;i<=10;i++){
            System.out.println(no[i]);
        }
    }
}