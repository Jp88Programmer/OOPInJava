package example;
import example.Account;
import java.util.Scanner;
public class ATMMachine {
 public static void main(String args[]){
   Scanner scan = new Scanner(System.in);
   for(int i = 1 ; i <= 10 ; i++){
   System.out.print("Enter a Account id : ");
   int id = scan.nextInt();
   if(id < 1 || id > 10){
     System.out.println("Invalid id \nplease try again later");
   }
   else
     manu(id);
  }  
 }
 public static void manu(int id){
   Account account = new Account(id);
   while(true){
     System.out.println("\n----------------");
     System.out.println("   Main manu");
     System.out.println("----------------");
     System.out.println("1. check balance ");
     System.out.println("2. Withdraw");
     System.out.println("3. Deposit");
     System.out.println("4. Exit");
     System.out.println("----------------");
     System.out.print("Enter your choice : ");
     Scanner scan = new Scanner(System.in);
      int choise = scan.nextInt();
     switch(choise){
       case 1 :
         System.out.print("Balance is " + account.checkBalance());
         break ;
       case 2 :
           System.out.print("Enter a Amount to withdraw : ");
           double withdrawAmount = scan.nextDouble();
            account.withdraw(withdrawAmount);
            break ;
       case 3 :
           System.out.print("Enter a Amount to deposit : ");
            double depositAmount = scan.nextDouble();
            account.deposit(depositAmount); 
            break ;
       case 4 :
            return ;
       default :
            System.out.println("Your choice Invalid ");
     }
   }
 }
}
