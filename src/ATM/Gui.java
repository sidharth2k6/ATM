package ATM;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Gui {
    Scanner scanner = new Scanner(System.in);

    int welcomeScreen(){
        System.out.print("Enter your Card Number: ");
        return  scanner.nextInt();
    }

    int homepage(){
        System.out.println("\nEnter choice: ");
        System.out.println("1. Withdraw");
        System.out.println("2. deposit");
        System.out.println("3. check balance");
        System.out.println("0. for exit");
        return scanner.nextInt();
    }

    void throwError(String massage){
        System.out.println("Error: " + massage);
    }

    //for debugging
    void showDetails(Account account){
        System.out.println("A/c Number: " + account.acNumber);
        System.out.println("Card Number: " + account.cardNumber);
        System.out.println("Pin: " + account.pin);
    }

    int setPinPage(){

        while(true){
            System.out.print("Enter your pin: ");
            int enteredPin = scanner.nextInt();
            System.out.print("Confirm pin: ");

            if(enteredPin == scanner.nextInt()){

                return enteredPin;
            }
            else{
                throwError("Invalid, Try again!");
            }
        }
    }

}