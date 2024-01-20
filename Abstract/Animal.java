//Write a Java program to create an abstract class Animall with an abstract method called sound(). 
//Create subclasses Lion and Tiger that extend the Animall class and implement the sound() method to make a specific sound for each animal.
package Abstract;
abstract class Animall {
    public abstract void sound();
    public void sleeping(){
        System.out.println("UuUuUuUuUuUu");
    }
}
class Lion extends Animall{
    public void sound(){
        System.out.println("Loin's ROAR");
    }
    public void sleeping(){
        System.out.println("ZZZZZ");
    }
}
class Tiger extends Animall{
    public void sound(){
        System.out.println("Tiger's ROAR");
    }
    public void sleeping(){
        System.out.println("zzzzzz");
    }
}
class Animal{
    public static void main(String[] args) {
        Tiger objtiger=new Tiger();
        objtiger.sound();
        objtiger.sleeping();
        Lion objlion=new Lion();
        objlion.sound();
        objlion.sleeping();
    }
}
