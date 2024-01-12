//Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
class Dog{
    private String name;
    private String breed;
    Dog(String name, String breed){
        this.name=name;
        this.breed=breed;
    }
    void setter(String name, String breed){
        this.name=name;
        this.breed=breed;
    }
    void dogprint(){
        System.out.println(this.name+" is a "+this.breed+" animal");
    }
}
public class Dogclass {
    public static void main(String[] args){
        Dog obj1=new Dog("Sonu", "Desi");
        Dog obj2=new Dog("kalu", "Dogerman");
        obj1.dogprint();
        obj2.dogprint();
        obj1.setter("Monti", "Videsi");
        obj2.setter("Bhuru","labra");
        obj1.dogprint();
        obj2.dogprint();

    }
    
}
