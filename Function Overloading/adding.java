//WAP to add two integer and float no using function overloading
class add{
    int addition(int a, int b){
        int total=a+b;
        return total;
    }
    double addition(double a, double b){
        double total=a+b;
        return total;
    }
    String addition(String a, String b){
        String total=a+b;
        return total;
    }
}
class adding{
    public static void main(String[] args) {
        add newobj=new add();
        System.out.println(newobj.addition("Tahzeeb", "Khan"));
        System.out.println(newobj.addition(4, 8));
        System.out.println(newobj.addition(4.3, 5));

    }
}