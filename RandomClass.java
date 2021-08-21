package example;
import java.util.Random;
public class RandomClass {
 public static void main(String args[]){
   Random random1 = new Random(1000);
  // random1.nextInt(100);
   for(int i = 0 ; i <= 50 ; i++){
     int j = random1.nextInt(1000);
      if((i+1)%10 == 0)
      System.out.printf("%-6d\n",j);
      else 
       System.out.printf("%-6d",j);
   }
  
 }
}
