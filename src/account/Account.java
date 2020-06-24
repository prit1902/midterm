/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/** Improve the code by applying suitable design principles
 * date: June 24
 * @author Sivagama
 * @modified by Prit Patel
 */
public class Account {

    
        public double balance;
        public double interestRate=0.3;
        public String user;
 
     /**constructor that takes the initial balance
      * @param initialBalance 
      */
        public Account(double initialBalance,String givenUser)
        {
            balance=initialBalance;
            user=givenUser;
            //To create an account the initial balance must be greater than 50.       
        }

     /**The method for depositing amount and 
      * updating balance*/
        public void credit(double amount)
        {
            balance=balance+amount;
        }

     /**The method for debit(withdrawing amount) and 
      * updating balance */
        public void debit(double amount)
        {
            balance=balance-amount;

        } 
        
        public double findBalance()
        {
            balance = balance + (balance*interestRate);
            
            return balance;
        }
    
}//class end
