//Print design using a 2d array. design([- - - - - - - - - -                                                                                           
//                                       - - - - - - - - - -                                                                                           
//                                       - - - - - - - - - -                                                                                           
//                                       - - - - - - - - - -                                                                                           
//                                       - - - - - - - - - -                                                                                           
//                                       - - - - - - - - - -                                                                                           
//                                       - - - - - - - - - -                                                                                           
//                                       - - - - - - - - - -                                                                                           
//                                       - - - - - - - - - -                                                                                           
//                                       - - - - - - - - - -  ])
public class printmatrix {
    public static void main(String[] args){
        int[][] arr=new int[10][10];
        int i,k;
        for(i=0;i<10;i++){
            for(k=0;k<10;k++){
                System.out.print("-");
            }
            System.out.println("");
        }
    }
}
