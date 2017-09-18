///**
// * CheckingAccount.java
// * Assignment 3, Task 2
// * Emily Van Laarhoven
// * September 26, 2016 11:59pm
// */
//
//public class CheckingAccount extends Account {
// 
//  double minbal;
//  double overdraft;
//  
//  public CheckingAccount (double minbal, double overdraft){
//   this.minbal=minbal;
//   this.overdraft=overdraft;
//  }
//  
//  private void withdraw (double withAmt) {
//   super.acctbal -= withAmt;
//   if (acctbal < minbal){
//     acctbal-=overdraft;
//   }
//  }
//  
//  public String toString() {
//    return super.this.toString()+" the min bal is "+minbal;
//  }
//}