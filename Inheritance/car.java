//Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Honda that overrides the drive() method to print "Repairing a car".
class vehicle{
    void drive(){
        System.out.println("Car Drive");
    }
}
class honda extends vehicle{
    @Override
    void drive(){
        System.out.println("Car is Repairing");
    }
}
public class car {
    public static void main(String[] args) {
        honda obj1=new honda();
        obj1.drive();
        vehicle obj2=new vehicle();
        obj2.drive();
    }

}
