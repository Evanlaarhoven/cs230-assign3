/**
 * Account.java
 * Assignment 3, Task 2
 * Emily Van Laarhoven
 * September 26, 2016 11:59pm
 */

public class Account {
  //instance variables
  private int acctnum;
  private double acctbal;
  private int counter=0;
  //constructor
  public Account(){
    this.acctnum = 0; //acct num must be unique
    this.acctbal = 0.0; //do i need to do this?
  }
  //toString 
  public String toString() {
    return "The balance in account number "+acctnum+" is $"+acctbal;
  }
  //deposit method
  protected void deposit (double depAmt) {
    this.acctbal += depAmt;
    if (this.acctnum==0){
      this.acctnum+=counter;
      counter ++;
    }
  }
  
  //withdraw method
  public void withdraw (){
  }
  //main method
  public static void main(String[] args){
   Account acct1 = new Account(); 
   acct1.deposit(10.99);
   System.out.println(acct1);
   Account acct2 = new Account();
   acct2.deposit(21.49);
   System.out.println(acct2);
  }
}
  
    