//storedatainarrayusingcmd
//write a program to store data of 5 elements in array and take input from user using cmd
class storedatainarrayusingcmd{
    public static void main(String args[]){
        if(args.length==5){
            int data[]=new int[5];
            int i;
            for(i=0;i<5;i++){
                data[i]=Integer.parseInt(args[i]);
            }
            for(i=0;i<5;i++){
                System.out.println(data[i]);
            }
        }else{
            System.out.println("Please Enter correct input in CMD");
        }
        
    }
}