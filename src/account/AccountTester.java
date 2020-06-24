/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;
import java.util.Scanner;
/**
 * date: June 24
 * @author Sivagama
 * @modified by Prit Patel
 */
public class AccountTester {
    
    public static void main(String[] args) {
        /*here assumed that 5 accounts can be created
        for the given bank*/ 
        Account[] ac=new Account[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the amount by which you want to open an account:");
        double bal=sc.nextDouble();
        while(bal < 50) {
        System.out.println("$50 is minumum amount to open new account. enter again the amount by which you want to open an account:");
        bal=sc.nextDouble();
        
        }
        System.out.println("Please enter the unique user name:");
        sc.nextLine();
        String user=sc.nextLine();
        Account a=new Account(bal,user);
        System.out.println("Account created successfully.");
        System.out.println("The balance is: "+a.balance);  
        System.out.println("The InterestRate per month is "+a.interestRate);
        System.out.println("The current balance including interestrate is: "+a.findBalance()); 
        /* modify the code to store 5 accounts in array and print balance and monthly Interest for the available balance */
        
        for(int i=0; i<5; i++)
        {
            System.out.println("Please enter the amount by which you want to open an account:");
        
            bal=sc.nextDouble();
        
            while(bal < 50) {
                System.out.println("$50 is minumum amount to open new account. enter again the amount by which you want to open an account:");
                bal=sc.nextDouble();
            }
            
            System.out.println("Please enter the unique user name:");
            sc.nextLine();
            user=sc.nextLine();

            ac[i]=new Account(bal,user);
             System.out.println("Account created successfully.");
        System.out.println("The balance is: "+ac[i].balance);  
        System.out.println("The InterestRate per month is "+ac[i].interestRate);
        System.out.println("The current balance including interestrate is: "+ac[i].findBalance()); 
        }
        
        
       
        System.out.println("The balance is: "+a.balance);  
        System.out.println("The InterestRate per month is "+a.interestRate);
    }
}
