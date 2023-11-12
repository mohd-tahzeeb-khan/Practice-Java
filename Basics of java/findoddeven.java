//Write a program to find whether the no is even or odd. Input should be from cmd, and use validation to validate correct input
public class findoddeven {
    public static void main(String[] args) {
        if(args.length !=0){
            int no=Integer.parseInt(args[0]);
            String answer="";
            if(no%2==0){
                answer="EVEN";
            }
            if(no==0){
                answer="Equal";
            }
            if(no%2!=0){
                answer="ODD";
            }
            System.out.print(answer);
        }
        else{
            System.out.println("Please enter correct argument.");
        }
    }
}
