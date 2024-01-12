// Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
class person {
    String name;
    int age;
    person(String getname,int getage){
        name=getname;
        age=getage;
    }
    void printperson(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    
}
public class main{
    public static void main(String[] args) {
        System.out.println("First Instance");
        person obj1=new person("Tahzeeb", 21);
        obj1.printperson();
        System.out.println("Second Instance");
        person obj2=new person("Sohail", 27);
        obj2.printperson();
    }
}
