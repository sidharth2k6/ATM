package ATM;
import java.util.Scanner;
public class Account {
    int acNumber;
    String acHolderName;
    double balance;
    int cardNumber;
    int pin;
    Scanner scanner=new Scanner(System.in);
//    void printDetails(){
//        System.out.println("Ac Number: " + acNumber);
//        System.out.println("Ac Holder Name: " + acHolderName);
//        System.out.println("Balance: " + balance);
//        System.out.println("Card Number: " + cardNumber);
//        System.out.println("Pin: " + pin);
//    }
//
//    void setPin(int pin){
//        this.pin = pin;
//    }
//
    void withdraw(){
        System.out.println("\nHow much you want to withdraw:");
        int amount=scanner.nextInt();
        if(amount <= this.balance){
            this.balance -=amount;
        }
        else System.out.println("\nLow balance");
    }

    void deposit(){
        System.out.println("\nHow much amount you want to deposit: ");
        int amount=scanner.nextInt();
        if(amount>0){
            this.balance += amount;
        }
        else System.out.println("\nAmount can't be negative or zero");
    }

    void checkBalance(){
        System.out.println("\nyour account balance : "+this.balance);
    }

}