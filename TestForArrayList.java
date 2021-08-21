package example;

import example.MyStack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class TestForArrayList {
 public static void main(String args[]){
   ArrayList<String> name = new ArrayList<String>();
   name.add("jayendra");
   name.add("Harshd");
   name.add("parmar");
   for(int i = 0 ; i < name.size() ; i++)
    System.out.println(name.get(i));
    System.out.println("---------------------------");
   name.add(2,"Jignesh");
   for(int i = 0 ; i < name.size() ; i++)
    System.out.println(name.get(i)); System.out.println("---------------------------");
    name.add(2,"ARVINDBHAI");
   for(int i = 0 ; i < name.size() ; i++)
    System.out.println(name.get(i));
   System.out.println("---------------------------");
   System.out.println("List Size : " + name.size());
   System.out.println("Jignesh name in the List " + " ? " +  name.contains("Jignesh"));
   System.out.println("Starting index of Jignesh " + " ? " +  name.indexOf("Jignesh"));
   System.out.println("last index of Jignesh " + " ? " +  name.lastIndexOf("Jignesh"));
   System.out.println("Remove the jayendra in list " + name.remove("jayendra"));
   System.out.println("Remove element" + name.indexOf("parmar") + " : " + name.remove(name.indexOf("parmar")));
   for(int i = 0 ; i < name.size() ; i++)
    System.out.println(name.get(i));
System.out.println("---------------------------");
/* test for distinct Number use for ArrayList */
   ArrayList<Integer> i1 = new ArrayList<>();
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter a value in List  : (press 0 to not inserting elements)   ");
   int num;
   while(true){
     num = scan.nextInt();
     if(num == 0)
      break;
        /* check the object in list or not */
     if(! i1.contains(num))
      i1.add(new Integer(num));
   }
   //for(int i = 0 ; i < i1.size() ; i++)
  //  System.out.print(i1.get(i) + " ");
   for(int number : i1)
    System.out.println(number);
    System.out.println("---------------------------");
    /* Many Other method which useful in ArrayList 
     */ 
    /* like you can invoke the array to ArrayList 
       asList(array name);
     */
    Integer[] array = {2,3,1,3,3,4,4,6,2,4,7,1,3,7,9};
    ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(array));
    for(int number : list1)
    System.out.print(number + " ");
    System.out.println();
    String[] str = {"Surat","Ahmedabad","bhavnagar","Vadodara","Mumbai"};
    ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str));
    java.util.Collections.sort(list2);
      for(int i = 0 ; i < list2.size() ; i++ )
      System.out.println(list2.get(i));
      System.out.println("---------------------------");
     list2.toArray(str);
     for(int i = 0 ; i < str.length ; i++ )
      System.out.println(str[i]);
     System.out.println("---------------------------");
    java.util.Collections.sort(list1);
    for(int number : list1)
    System.out.print(number + " ");
    System.out.println();
    System.out.println("Maximum elements : " + java.util.Collections.max(list1));
    System.out.println("Minimum elements : " + java.util.Collections.min(list1));
    java.util.Collections.shuffle(list1);
    for(int number : list1)
    System.out.print(number + " ");
    System.out.println();
    System.out.println("---------------------------");
  /*  MyStack stack ;
   * Integer n = new Integer(23);
   * stack.push(n);
   *  System.out.println(stack.toString());
   */
   System.out.println("-----------------------------");
   ArrayList<Integer> arr = new ArrayList<>();
   System.out.println("Enter list values in sequence (type 0 for ending) : ");
  while(true){
    int number = scan.nextInt();
    if(number == 0)
     break ;
    arr.add(new Integer(number)); 
  } 
  int max = arr.get(0);
   for(int i = 1 ; i < arr.size() ; i++){
     if( max < arr.get(i))
      max = arr.get(i); 
   }   
   System.out.println("max number : " + max);
   
 }
}
