// code by saqib ale

// Question No. 2 Write a Java program to create a class called "BankAccount" with a collection
//  of accounts and methods to add and remove accounts, and to deposit and withdraw money.

import java.util.Scanner;
public class BankAccount {
    private int[] userId;
    private String[] userName;
    private long[] userAmount;
    private int arraySize;
    private boolean[] isActive;
    
    // define Constructure 
    BankAccount(int arraySize){
        this.arraySize = arraySize;
        userId = new int[arraySize];
        userName = new String[arraySize];
        userAmount = new long[arraySize];
        isActive = new boolean[arraySize];
    }
    // Define method to add user Account
    public void addUserAccount(){
        Scanner obj1 = new Scanner(System.in);
        for(int i = 0; i < arraySize; i++){
            System.out.println("Enter user Name: ");
            userName[i] = obj1.nextLine();
        }
        for(int i = 0; i < arraySize; i++){
            System.out.println("Enter user Id: ");
            userId[i] = obj1.nextInt();
            System.out.println("Enter deposit Ammount: ");
            userAmount[i] = obj1.nextLong();
            isActive[i] = true;
        }
        System.out.println("Data is savded . . . . . .  .");
    }
    // remove any account by it's id 
    // i just simple unactive that account 
    public void RemoveAccountById(){
        Scanner obj1 = new Scanner(System.in);
        int removeId;
        removeId = obj1.nextInt();
        for(int i = 0 ; i < arraySize; i++){
            if(userId[i] == removeId){
                isActive[i] = false;
                break;
            }
        }
    }

    // add amount to any account by using user id
    public void depositMoney(){
        Scanner obj1 = new Scanner(System.in);
        int getdepositMoneyId;
        getdepositMoneyId = obj1.nextInt();

        for(int i = 0; i < arraySize ; i++){
            if(userId[i] == getdepositMoneyId){
                System.out.println("how much amount add  ");
                long getAmmount = obj1.nextLong();
                userAmount[i] = userAmount[i] + getAmmount;
                System.out.println("Amount Updated new balance is " + userAmount[i]);
                break;
            }
        }
    }

    //withdraw amount
    public void withdrawMoney(){
        Scanner obj1 = new Scanner(System.in);
        int getWithDrawMoneyId;
        getWithDrawMoneyId = obj1.nextInt();

        for(int i = 0; i < arraySize ; i++){
            if(userId[i] == getdepositMoneyId){
                System.out.println("how much amount withdraw  ");
                long getAmmount = obj1.nextLong();
                userAmount[i] = userAmount[i] - getAmmount;
                System.out.println("Amount Updated and remaing balance: "+ userAmount[i]);
                break;
            }
        }

    }


}
