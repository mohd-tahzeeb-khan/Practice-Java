//WAP that shows the use of static variable
class basic_use{
    public static void main(String[] args) {
        basicfun obj1=new basicfun();
        basicfun obj2=new basicfun();
        obj1.increment();
        obj2.incrementb();
        obj1.increment();
        obj2.increment();
    }
}
class basicfun{
    int a=0;
    static int b=0;
    void increment(){
        a++;
        b++;
        System.out.println(a );
        System.out.println(b);
    }
    void incrementb(){
        b++;
        System.out.println(b);
    }


}
