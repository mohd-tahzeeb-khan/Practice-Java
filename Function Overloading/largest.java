//WAP to find the largest no between three no using a function overlaoding
class findlargest{
    int a,b, c;
    double d,e,f;
    int larger(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
        if(this.a>this.b && this.a>this.c){
            return this.a;
        }
        if(this.b>a && this.b>c){
            return this.b;
        }
        else{
            return c;
        }
    }
    double larger(double d, double e, double f){
        this.d=d;
        this.e=e;
        this.f=f;
        if(this.d>this.e && this.d>this.f){
            return this.d;
        }
        if(this.e>f && this.e>d){
            return this.e;
        }
        else{
            return f;
        }
    }
}
public class largest {
    public static void main(String[] args) {
     findlargest obj=new findlargest();
     System.out.println(obj.larger(4,5,3));
     System.out.println(obj.larger(8.4, 6.3, 0.1));

    }
}
