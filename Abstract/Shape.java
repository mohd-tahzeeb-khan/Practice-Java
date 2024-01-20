//Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). 
//Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.
package Abstract;
abstract class Shapes {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public void formula(){
        System.out.println("R*R");
    }
}
class Circle extends Shapes{
    double pie=3.14;
    double area;
    double radius;
    Circle(double area, double radius){
        this.area=area;
        this.radius=radius;
    }
    public double calculateArea(){
        return 3.14*area*area;
    }
    public double calculatePerimeter(){
        return 2*pie*radius;
    }
}
class Triangle extends Shapes{
    double a;
    double b;
    double c;
    double height, base;
    Triangle(double a, double c, double b,double height, double base){
        this.a=a;
        this.b=b;
        this.c=c;
        this.height=height;
        this.base=base;
    }
    public double calculatePerimeter(){
        return a*b*c;
    }
    public double calculateArea(){
        return height*base;
    }
}
class Shape{
    public static void main(String[] args) {
        Circle objcir=new Circle(5.1, 5.4);
        Triangle objtri=new Triangle(3, 5, 8.9,5.2, 3);
        System.out.println(objcir.calculatePerimeter());
        System.out.println(objcir.calculateArea());
        objcir.formula();
        System.out.println(objtri.calculateArea());
        System.out.println(objtri.calculatePerimeter());
        objtri.formula();

    }
}