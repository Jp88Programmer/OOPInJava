package example;
import java.util.Scanner;
public class TestLocation {
 public static void main(String args[]){
   Scanner scan = new Scanner(System.in);
   System.out.print("Enter a Row and Column : ");
   
   int row = scan.nextInt();
   int column = scan.nextInt();
   double[][] m = new double[row][column];
   System.out.println("Enter a array value : ");
   for(int i = 0; i < m.length ; i++){
     for(int j = 0; j < m[i].length ; j++)
      m[i][j] = scan.nextInt();
   }
   
   Location l1 = new Location();
   l1 = longestValue(m);
   System.out.println(l1.toString());
 }
  public static Location longestValue(double[][] m){
   double  max = m[0][0];
   int maxIndexr = 0;
   int maxIndexc = 0;  
    for(int i = 0 ; i < m.length ; i++){
      for(int j = 0 ; j < m[i].length ; j++){
        if(max < m[i][j]){
          max = m[i][j];
          maxIndexr = i;
          maxIndexc = j;
        }
      }
    }
    Location l1 = new Location();
    l1.maxValue = max;
    l1.row = maxIndexr;
    l1.column = maxIndexc;
    return l1;
  }
}
class Location{
  public int row;
  public int column;
  public double maxValue;
  public Location(){
    row = 0;
    column = 0;
  }
  public Location(int row,int column){
    this.row = row;
    this.column = column;
    maxValue = 0;
  }
  public String toString(){
    return "" + maxValue + " (" + row + "," + column + ") ";
  }
}