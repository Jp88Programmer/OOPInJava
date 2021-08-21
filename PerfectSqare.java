package example;

import java.util.ArrayList;
import java.util.Scanner;


public class PerfectSqare {
 public static boolean isPrime(int number){
   for(int i = 2 ; i < number ; i++){
     if(number % i == 0)
       return false ;
   } 
   return true ;
 }
 public static ArrayList<Integer> primeFactor(int number){
   
   ArrayList<Integer> list = new ArrayList<>();
    while (number > 0){
       int n = 2 ;
      if( isPrime(n)){
        if( number % n == 0 )
         {
          number /= n; 
          list.add(new Integer(n)) ; } 
        else
          n++;    
      }
     
      else
       n++;
    }
   return list ; 
 }
 public static void main(String args[]){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter an Integer of m : ");
   int m = input.nextInt();
   ArrayList<Integer> list = new ArrayList<>() ;          
   list = primeFactor(m);
   for(int i = 0 ; i < list.size() ; i++)
   System.out.println(list.get(i));
 }
}
