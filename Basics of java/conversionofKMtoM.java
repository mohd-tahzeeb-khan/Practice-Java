public class conversionofKMtoM {
    public static void main(String args[]){
        if(args.length==1){
            Float km=Float.parseFloat(args[0]);
            Float m;
            m=km*1000;
            System.out.println(+km+" Kilometer is Equal to "+ m + " Meters");
        
        }
        else{
            System.out.println("Please enter the correct Parameter");
        }
    }
}
