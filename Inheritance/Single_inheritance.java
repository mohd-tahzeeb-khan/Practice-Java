class data{
    int a,b;
    void in(){
        a=10;
        b=20;
    }
    void out(){
        System.out.println("Printing data -> "+a+" , "+b);
    }
}
class childdata extends data{
    int x,y;
    void get(){
        x=20;
        y=40;
    }
    void put(){
        System.out.println("Priting data -> "+x+" , "+y);
    }
}
class Single_inheritance{
    public static void main(String[] args) {
        childdata obj=new childdata();
        obj.in();
        obj.get();
        obj.put();
        obj.out();
    }
}