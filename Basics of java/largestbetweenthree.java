class largestbetweenthree{
    public static void main(String args[]){
        Float a,b,c ;
        Float largest=(float)0;
        if(args.length==3){
            a=Float.parseFloat(args[0]);
            b=Float.parseFloat(args[1]);
            c=Float.parseFloat(args[2]);
            if(a>b || a>c){
                largest=a;
            }
            if(a<b || b>c){
               largest=b; 

            }
            if(c>b || c>a){
                largest=c;
        }
            System.out.println(largest+ " is greater than other two nos");
    }else{
        System.out.println("Please three arguments.");
    }
        }
        
}