//Write a Java program to create a class called baseanimal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method

import java.security.PublicKey;

class baseanimal {
    void makeSound(){
        System.out.println("Every Animal make some Voice!!!!");
    }
}
class cat extends baseanimal{
    @Override
    void makeSound() {
        System.out.println("Meow......Meow");
    }
}
class Animal{
    public static void main(String[] args){
        cat obj=new cat();
        obj.makeSound();
    }
}
