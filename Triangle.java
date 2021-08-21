package example;

public class Triangle extends GeometricShape implements MathsSimlier {
 private double side1;
 private double side2;
 private double side3;
 public Triangle() throws IllegalTriangleException{
   this(1.0,1.0,1.0);
   if(!this.verifyTriangle())
     throw new IllegalTriangleException(1.0,1.0,1.0);
 }
 public Triangle(double side1, double side2, double side3)throws IllegalTriangleException{
   this.side1 = side1;
   this.side2 = side2;
   this.side3 = side3;
   if(!this.verifyTriangle())
     throw new IllegalTriangleException(side1,side2,side3);
 }
 public Triangle(String color,boolean filled){
   super(color,filled);
 }
 public Triangle(String color,boolean filled, String border){
   super(color,filled,border);
 }
 public Triangle(double side1, double side2, double side3, String color,boolean filled) throws IllegalTriangleException{
   super(color,filled);
   this.side1 = side1;
   this.side2 = side2;
   this.side3 = side3;
   if(!this.verifyTriangle())
    throw new IllegalTriangleException(side1,side2,side3);
 }
 public Triangle(double side1, double side2, double side3, String color,boolean filled,String border)throws IllegalTriangleException{
   super(color,filled,border);
   this.side1 = side1;
   this.side2 = side2;
   this.side3 = side3;
   if(!this.verifyTriangle())
     throw new IllegalTriangleException(side1,side2,side3);
 }
 public void  setSide1(double side1)throws IllegalTriangleException{
   this.side1 = side1;
   if(!this.verifyTriangle())
     throw new IllegalTriangleException(side1,side2,side3);
 }
 public void setSide2(double side2)throws IllegalTriangleException{
   this.side2 = side2;
   if(!this.verifyTriangle())
     throw new IllegalTriangleException(side1,side2,side3);
 }
 public void setSide3(double side3)throws IllegalTriangleException{
   this.side3 = side3;
   if(!this.verifyTriangle())
     throw new IllegalTriangleException(side1,side2,side3);
 }
 public double getSide1(){
   return side1;
 }
 public double getSide2(){
   return side2;
 }
 public double getSide3(){
   return side3;
 }
 public double getArea(){
   double s = getPerimeter() / 2.0;
   return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
 }
 public double getPerimeter(){
   return side1 + side2 + side3;
 }
 public boolean verifyTriangle(){
   return (side3 < (side1 + side2)) || (side2 < (side1 + side3)) || (side1 < (side2 + side3));
 }
 @Override
 public String toString(){
  return "Triangle: \n"+ super.toString() + "\nside1 = " + side1 + "\nside2 = " + side2 +
"\nside3 = " + side3 +"\nPerimeter = "+ this.getPerimeter() +"\nArea = " + this.getArea(); 
 }
}
class IllegalTriangleException extends Exception{
 private double side1;
 private double side2;
 private double side3;
 public IllegalTriangleException(){
   super("Invaild Triangle");
 }
 public IllegalTriangleException(double side1, double side2, double side3){
   super("Invaild Triangle");
   this.side1 = side1;
   this.side2 = side2;
   this.side3 = side3;
 }
 public IllegalTriangleException(String msg){
   super(msg);
 }
 public void printMessage(){
   System.out.println(this.getMessage());
 }
 @Override
 public String getMessage(){
   return super.getMessage();
 }
 @Override 
 public String toString(){
   return "\nside1 = " + side1 + "\nside2 = " + side2 + "\nside3 = " + side3 ;
 }
}