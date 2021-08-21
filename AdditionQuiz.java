package example;

import java.util.*;

public class AdditionQuiz {
 public static void main(String args[]){
       Scanner input = new Scanner(System.in);
   ArrayList<Integer> list = new ArrayList<>();
  int num1 = new Random(3).nextInt(10);
  int num2 = new Random(1).nextInt(10);
  while(true){
    System.out.print("what is " + num1 + " + " + num2 + " ? ");
    int ans = input.nextInt();
    if(! list.contains(new Integer(ans)))
      list.add(new Integer(ans));
    else
     System.out.println("you already entered " + ans); 
    if((num1 + num2 ) == ans){
     System.out.println("you got it ");
     break ;
     }
     else
      System.out.println("wrong answer \nTry agian");
  } 
 }
}
