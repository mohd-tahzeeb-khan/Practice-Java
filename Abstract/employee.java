//Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw().
//Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class,
//implement the respective methods to handle deposits and withdrawals for each account type.
package Abstract;
abstract class BankAccount{
    abstract double deposit();
    abstract double withdraw();
}
class SavingsAccount extends BankAccount{
    int accountno;
    double balance;
    SavingsAccount(int accountno, double balance){
        this.accountno=accountno;
        this.balance=balance;
    }
    double deposit(){
        return this.balance++;

    }
    double withdraw(){
        return this.balance--;
    }
}
class CurrentAccount extends BankAccount{
    int accountno;
    double balance;
    double servicetax=500;
    CurrentAccount(int accountno, double balance){
        this.accountno=accountno;
        this.balance=balance;
    }
    double deposit(){
        return this.balance++;

    }
    double withdraw(){
        return this.balance-servicetax--;
    }
}
public class employee {
    public static void main(String[] args){
        SavingsAccount objsave=new SavingsAccount(1111, 15000);
        System.out.println(objsave.withdraw());
        System.out.println(objsave.deposit());
        CurrentAccount objcurrent=new CurrentAccount(1552, 45700);
        System.out.println(objcurrent.withdraw());
        System.out.println(objcurrent.deposit());
    } 
    


}
