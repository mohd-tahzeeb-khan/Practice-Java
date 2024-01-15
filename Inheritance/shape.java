//Write a Java program to create a class called shapesbase with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
class shapesbase {
    void getArea(){
        System.out.println("Area of Reatangle is Length x Breath");
    }
    
}
class rectangle extends shapesbase{
    double length;
    double breath;
    void setdata(){
        length=5.6;
        breath=7.4;
    }
    @Override
    void getArea(){
        System.out.println("Area is: "+length*breath  );
    }}
public class shape {
    public static void main(String[] args) {
        rectangle obj=new rectangle();
        shapesbase objshape=new shapesbase();
        obj.setdata();
        obj.getArea();
        objshape.getArea();
    }
}
