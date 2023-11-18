//write a program to take a input and display it on the screen. Rows and Columns take as a input and storing all the data is also take input.
public class takerowcolfromuser {
    public static void main(String[] args){
        int r=Integer.parseInt(args[0]);
        int c=Integer.parseInt(args[1]);
        int[][] arr=new int[r][c];
        for(int i=0; i<r;i++){
            for(int j=0; j<c; j++){
                arr[i][j]=j;
            }
        }
        for(int i=0; i<r;i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }
}
