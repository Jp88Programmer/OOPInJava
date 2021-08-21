package example;
import example.Account;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class TestAccount{
 public static void main(String args[]){
   Scanner scan = new Scanner(System.in);
   Account a1 = new  Account("Jayendra",1233,80000.78,4.5);
   System.out.print("Enter a Amount to withdraw : ");
   double amount = scan.nextInt();
   a1.withdraw(amount);
   System.out.println("Balance : " + a1.checkBalance());
   System.out.print("Enter a Amount to deposit : ");
   amount = scan.nextInt();
   a1.deposit(amount);
   System.out.println("Balance : " + a1.checkBalance());
   System.out.print("Enter a Amount to withdraw : ");
   amount = scan.nextInt();
   a1.withdraw(amount);
   System.out.println("Balance : " + a1.checkBalance());
   System.out.print("Enter a Amount to withdraw : ");
   amount = scan.nextInt();
   a1.withdraw(amount);
   System.out.println("Balance : " + a1.checkBalance());
   System.out.print("Enter a Amount to deposit : ");
   amount = scan.nextInt();
   a1.deposit(amount);
   System.out.println("Balance : " + a1.checkBalance());
    System.out.println(a1.toString());
   }
  } 
class Account{
 private String name;
 /** its Account number */
 private int id;
 /** main balance */
 private double balance;
 /** Annual Interest rate by any bank scheme */
 private double annualInterestRate;
 /**  Date of Opening when Account was open and Activate */
 private Date dateCreated;
 private ArrayList<Transaction> tr =  new ArrayList<>();
 /** no-args Constructer and also assiging by default value */
 public Account(){
   this(1,100.00,4.5);
 }
 public Account(int id){
   this.id = id ;
   this.balance = 100.00;
 }
 /** args Constructer when object create you can initialise value */
 public Account(int id, double balance,double annualInterestRate){
   this.id = id ;
   this.balance = balance;
   this.annualInterestRate = annualInterestRate;
 }
 public Account(String name,int id, double balance){
   this.name = name;
   this.id = id ;
   this.balance = balance;
 }
 public Account(String name,int id, double balance,double annualInterestRate){
   this.name = name;
   this.id = id ;
   this.balance = balance;
   this.annualInterestRate = annualInterestRate;
 }
 /** its return account Opening date */
 public Date accountOpeningDate(int year,int month,int monthOfDate){
   dateCreated = new Date(year,month,monthOfDate);
   return dateCreated;
 }
 public  void setName(String name){
   this.name = name;
 }
 /** update id is not recommended */
 public  void setId(int id){
   this.id = id;
 }
 /** check the balance if is updated or not */
 public double checkBalance(){
   return balance ;
 }
 /** return monthly interest rate */
 public double getMontlyInterestRate(){
   return  annualInterestRate / 1200.0;
 }
 /** return monthly interest  */
 /** formula = balance * montly interest rate */
 public double getMontlyInterest(){
   return balance*getMontlyInterestRate();
 }
 /** that is withdraw process withdraw amount your account  if sufficient balance available */
 public void withdraw(double withdrawAmount){
   if(balance < withdrawAmount)
    System.out.println("Not Sufficient Balance \nPlease Deposit Amount");
   else{
   if(withdrawAmount > 20000)
    balance = balance -  withdrawAmount - (balance - withdrawAmount)*8/10000.0;
   else
     balance = balance - withdrawAmount;
    System.out.println("Withdrew Successful\nPlease Collect Cash");
    }
   tr.add(new Transaction('W',balance, withdrawAmount));
 }
 /** you can deposit your savings */
 public void deposit(double depositAmount){
   this.balance = this.balance + depositAmount;
      tr.add(new Transaction('D',balance,depositAmount));
 }
 public String desription(){
    String str = "";    
   for( int i = 0 ; i < tr.size() ; i++)
    str = str + tr.get(i).toString() +"\n";
    return str ; 
 }
  @Override
 /** return String to all information your bank account */ 
 public String toString()
 {
   return "\nAccount Id : "+id + "\nAccount Holder :"+ name +"\nAccounting Opening Date : " + dateCreated +"\nTransaction : " +   desription();
 }
}
/* this Transaction class its represent the history of Transaction ( like withdraw and depposit ) addting the inheritance 
 */
class Transaction extends Account {
  private Date date = new Date();
  /** which type of Tr.. want , take w to withdraw and d to deposit */
  private char type;
  private double balance;
  /** amount of Tr... */
  private double amount ;
  public Transaction(char type,double balance,double amount){
    this.type = type;
    this.balance = balance;
    this.amount = amount;
  }
  public void setType(char type){
    this.type = type;
  }
  public void setAmount(double amount){
       this.amount = amount;
  }
  public void setBalance(double balance){
        this.balance = balance;
  }
  public char getType(){
    return type;
  }
  public double getAmount(){
    return amount;
  }
  public double getBalance(){
    return balance;
  }
  public String toString(){
    return "\nTransaction Date : "+ date  + "\nType of Transaction : " + type +"\nAmount : "+ amount + "\nBalance : " + balance ;
  }
}