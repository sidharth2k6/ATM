package ATM;

public class Atm {
    //int currentUserIndex;
    int cardNum;

    void start(){
        Bank bank = new Bank();
        Gui gui = new Gui();

        Account account=new Account();
        login:

        //for login
        while(true) {
            cardNum = gui.welcomeScreen();
            if ((account = bank.isAvailable(cardNum)) != null) {
                // gui.showDetails(bank.accounts.get(currentUserIndex));
                gui.showDetails(account);
                break;
            } else {
                gui.throwError("Card number not Available!");
            }
        }

            if (account.pin == 0) {
                account.pin = gui.setPinPage();
            }

            while (true) {
                int choice = gui.homepage();

                switch (choice) {
                    case 1 -> {
                        account.withdraw();
                        break;
                    }
                    case 2 -> {
                        account.deposit();
                        break;
                    }
                    case 3 -> {
                        account.checkBalance();
                        break;
                    }
                    case 0 -> {
                        exit();
                        return;
                    }
                    default -> {
                        System.out.println("Wrong choice");
                    }

                }
            }

//        if(bank.accounts.get(currentUserIndex).pin == 0){
//            gui.throwError("You are new User.");
//            bank.accounts.get(currentUserIndex).setPin(gui.setPinPage());
//        }
//
//        gui.showDetails(bank.accounts.get(currentUserIndex));

    }
    void exit(){
        // for writing in file tomorrow
    }

}
