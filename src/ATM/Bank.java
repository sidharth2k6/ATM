package ATM;

import java.io.*;
import java.util.ArrayList;

public class Bank extends File{
//    String filepath = "src//ATM//accounts.txt";
//
//    ArrayList<Account> accounts = new ArrayList<>();



    //File file =new File();

    Bank(){
        readData();
    }

//    String accountToString(Account account){
//        return account.acNumber + "," + account.acHolderName + "," + account.balance + "," + account.cardNumber + "," + account.pin;
//    }
//
//    Account stringToAccount(String rawData){
//        Account tempAc = new Account();
//
//        String[] arrOfData = rawData.split(",");
//
//        tempAc.acNumber = Integer.parseInt(arrOfData[0]);
//        tempAc.acHolderName = arrOfData[1];
//        tempAc.balance = Double.parseDouble(arrOfData[2]);
//        tempAc.cardNumber = Integer.parseInt(arrOfData[3]);
//        tempAc.pin = Integer.parseInt(arrOfData[4]);
//
//        return tempAc;
//    }
//
//    void writeData(ArrayList<Account> accounts){
//        try(FileWriter writer = new FileWriter(filepath)){
//
//            for(Account account : accounts){
//                writer.write(accountToString(account) + "\n");
//            }
//            System.out.println("File has been written.");
//        } catch(IOException e){
//            System.out.println("Couldn't load file!");
//        }
//    }
//
//    void readData(){
//        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
//            String line;
//
//            while((line = reader.readLine()) != null){
//                accounts.add(stringToAccount(line));
//            }
//
//            System.out.println("Data retrieve Successfully.");
//        }
//        catch(IOException e){
//            System.out.println("something wrong");
//        }
//    }
//
//    int getIndex(int cardNum){
//        file.getIndex(cardNum);
//        for(Account account : accounts){
//            if(account.cardNumber == cardNum) return accounts.indexOf(account);
//        }
//        return -1;
//    }

//    boolean isAvailable(int cardNum){
//        return (account = userAccount(cardNum)) != null;
//    }
}