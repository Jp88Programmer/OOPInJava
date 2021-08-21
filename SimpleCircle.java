package example;
import example.circle;
import java.util.Scanner;
public class SimpleCircle {
 
 public static void main(String args[]){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a  first circle radius : ");
   double radius = input.nextDouble();
   System.out.print("Enter a  first circle center correcnate x and y respectively  : ");
   double x = input.nextDouble();
   double y = input.nextDouble();
   circle c1 = new circle(x,y,radius);
   System.out.println("Area of circle1 : " + c1.getArea());
   System.out.println("Perimeter of circle1 : " + c1.getPerimeter());
   System.out.println("Enter second circle radius , center coordinate x and y  : ");
   radius = input.nextDouble();
    x = input.nextDouble();
    y = input.nextDouble();
   circle c2 = new circle(x,y,radius);
   System.out.println("Area of circle2 : " + c1.getArea());
   System.out.println("Perimeter of circle2 : " + c1.getPerimeter());
   System.out.println("both Circles Overlaps : " + c1.overlaps(c2));
   System.out.println("Circle1 is inside the Circle2 ? " + c2.contains(c1));
   System.out.println("Circle2 is inside the Circle1 ? " + c1.contains(c2));
   /*
  * c2.setRadius(radius);
*   System.out.printf("Area of circle : %5.3f ",c2.getArea());
  * System.out.printf("\nPerimeter of circle : %5.3f ",c2.getPerimeter());
  * System.out.println("Number of Objects in Circle class : " + c2.getNumberOfObject());
*  //PrintCircleInfo(c2); 
 * circle[] cir = new circle[10];
*  for(int i = 0 ; i < cir.length ; i++ )
 *  cir[i] = new circle(1);
  *System.out.printf("%-10s%-10s%10s\n","Radius","Area","Perimeter"); 
 * for(int i = 0 ; i < cir.length ; i++ )
 *  PrintCircleInfo(cir[i],i);
   System.out.println("\nNumber of Objects in Circle class : " + cir[1].getNumberOfObject());
   */
   System.out.println("-----------------------------------------");
   circle cir1 = new circle(23.2333);
   System.out.println("Radius before the updated : " + cir1.getRadius());
   updateRadius(cir1,-45.89);
   System.out.println("Radius after the updated : " + cir1.getRadius());
 }
 public static void PrintCircleInfo(circle c,int times){
c.setRadius(c.getRadius()+times); System.out.printf("%-10.3f%-10.3f%-15.3f\n",c.getRadius(),c.getArea(),c.getPerimeter());
 }
 /* this is one type exception if exception condition not satisfied than exception occur and catching the exception (JVM find the code to handle the exception in catch block )
  */
 public static void updateRadius(circle cir,double radius){
  try{
   
   System.out.println("Continue process.....");
   cir.setRadius(radius);
   System.out.println("Radius updated successfully");
   }
   catch (IllegalArgumentException ex){
     System.out.println("Radius is negative ");
     System.out.println(ex.getMessage());
   }
 }
}
/*build class circle its extends od GeometricShape  
 */
class circle extends GeometricShape implements MathsSimlier{
  private double x;
  private double y;
  private double radius;
  /** this static member its made when first object create and than its not create further when another object create */
  /** that is call also class member or variable */
  private static int numberOfObject = 0;
  /**default constructor*/
  circle(){
    this(0,0,1);
    numberOfObject++;
  }
  circle(double x, double y, double radius){
    this.x = x;
    this.y = y;
    this.radius = radius;
  }
   circle(double x, double y){
    this.x = x;
    this.y = y;
    this.radius = 1;
  }
  /**make parameters construtre*/
  circle(double newRadius){
    radius = newRadius;
    numberOfObject++;
  }
  /* its contains own and superclass's attributes 
   * because its own attributes 
   * here use super(args..) it's the constrcter of the superclass 
   */
  circle(double radius,String color){
    super(color);
    this.radius = radius;
  }
  circle(double radius,String color,boolean filled){
    super(color,filled);
    this.radius = radius;
  }
   circle(double radius,String color,boolean filled, String border){
    super(color,filled,border);
    this.radius = radius;
  }
  /**built area method to return area of circle */
  public double getArea(){
    return Math.PI * radius * radius;
  }
  /**to return perimeter of circle*/
  public double getPerimeter(){
    return 2 * Math.PI * radius;
  }
  /** this is static method which invoked when use to static member or variable */
  /** when another object create its not make the method thaerfore class method */
  static int getNumberOfObject(){
    return numberOfObject;
  }
  /** return radius */
  double getRadius(){
    return radius;
  }
  /* getter method of corrdenet */
  double getX(){
    return x;
  }
  double getY(){
    return y;
  }
  /** to assign the value of radius */
  void setRadius(double newRadius) 
   /* this is Declared the exception which specifies type of exception is occur 
    */
   throws IllegalArgumentException {
    radius = newRadius;
    if( radius < 0)
     throw new IllegalArgumentException("Radius must Non-negative");
  }
  /* its anonation indicate the below method is override
   */
  @Override
  public String toString(){
    return "\nCircle : \n" + super.toString() + "\nRadius : " + radius + "\nPerimeter : " + this.getPerimeter() + "\nArea : " + this.getArea() ;
  }
  /* its return boolean 
   * its reperst the position of point reference to circle 
   */
  boolean contains(double x, double y){
    double distance = Math.sqrt((this.x-x) * (this.x-x) + (this.y-y) * (this.y-y));
    return radius >= distance;
  }
  /* its return true/false
   * its represent the location (in,overlap et )
   */
  boolean contains(circle c1){
    double distance = Math.sqrt((this.x-c1.getX()) * (this.x-c1.getX()) + (this.y-c1.getY()) * (this.y-c1.getY()));
    return (this.radius >= c1.getRadius()) && (radius >= distance);
  }
  /* true if both circles are overlap */
  boolean overlaps(circle c1){
    if( this.radius - c1.getRadius() > 0 ){
     if( (this.y - c1.getY()) / (this.x - c1.getX()) == 0)
      return true;
     else
      return false;
      }
   else
      return false;
  }
}