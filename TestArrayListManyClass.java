package example;

import example.Account;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;


public class TestArrayListManyClass {
 public static void main(String[] args){
   ArrayList<Object> obj = new ArrayList<>();
   circle cir = new circle(45);
   Rectangle rect1 = new Rectangle(23,45);
   Date date = new Date();
   Account a1 = new Account(2344,54647.566,5.3);
   obj.add(cir);
   obj.add(rect1);
   obj.add(date);
   obj.add(a1);
   for(int i = 0; i < obj.size() ; i++){
    System.out.println(obj.get(i).toString());
    System.out.println("\n\n");
    }
    for(int i = 0 ; i < obj.size() ; i++){
      int j = (int)(Math.random()*obj.size());
      Object obj1 = obj.get(j);
      obj.set(j,obj.get(i));
       obj.set(i,obj1);
    }
    for(int i = 0; i < obj.size() ; i++){
    System.out.println(obj.get(i).toString());
      System.out.println("\n\n");
    }
 } 
}
