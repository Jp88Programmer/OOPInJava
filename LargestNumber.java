package example;

import java.util.ArrayList;
import java.math.BigDecimal;
import java.math.BigInteger;

public class LargestNumber {
 public static void main(String[] args){
   ArrayList<Number> list = new ArrayList<>();
   list.add(454);
   list.add(23.456);
   // Add a BigInteger
 list.add(new BigInteger("3432323234344343101"));
 // Add a BigDecimal
list.add(new BigDecimal("652.0909090989091343433344343"));
//   list.add(new BigInteger("54567435647565"));
  // list.add(new BigDecimal("5+.45545555"));
   list.add(7456456);
    list.add(new BigInteger("34632323234344343101687675896676589765876"));
 // Add a BigDecimal
list.add(new BigDecimal("657568786565265.0909090989091343433344343"));
 list.add(new BigInteger("343232323434566576854343101667556755786756"));
 // Add a BigDecimal
list.add(new BigDecimal("65656652875686.0656565909090989091343433344343"));
 list.add(new BigInteger("343232365656566565767576756489067234344343101"));
 // Add a BigDecimal
list.add(new BigDecimal("66757686756852.0909090989091343433344343"));

   System.out.println(list.toString());
   System.out.println("larest value : " + larestNumber(list));
 }
 public static Number larestNumber(ArrayList <Number> list){
   Number number = list.get(0);
   for(int i = 1 ; i < list.size() ; i++){
     if(number.doubleValue() < list.get(i).doubleValue())
       number = list.get(i);
   }
  return number ; 
 }
 
}
