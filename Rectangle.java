package example;

import example.Rectangle;
/* Rectangle class extends by GeometricShape 
 * GeometricShape is Superclass and      Rectangle is Subclass 
 */
public class Rectangle extends GeometricShape implements MathsSimlier {
 private  double length;
 private double width;
 /* Constrcter */
 public Rectangle(){
   this(1,1);
 }
 /* parameter Constrcter */
 public Rectangle(double length, double width){
   this.length = length;
   this.width = width;
 }
 public Rectangle(double length, double width,String color){
 /* super is the superClass constructer and its also method to call here is invoked the constructer 
  */
   super(color);
   this.length = length;
   this.width = width;
 }
 /* here color and filled datafeild is the instance of GeometricShape class which instance of Rectangle class or for sub class
  */
 public Rectangle(double length, double width,String color,boolean filled){
   super(color,filled);
   this.length = length;
   this.width = width;
 }
 /* here color,filled and border are datafeild of superclass and involked by super(args..) which constructer
  */
 public Rectangle(double length, double width,String color,boolean filled, String border){
   super(color,filled,border);
   this.length = length;
   this.width = width;
 }
 /* return length of Rectangle */
 public double getLength(){
   return length;
 }
 /* return width of Rectangle */
 public double getWidth(){
   return width;
 }
 /* update the length */
 public void setLength(double length){
   this.length = length;
 }
 /* update the width */
 public void setwidth(double width){
   this.width = width;
 }
 /* return perimeter of rectangle */
 public double getPerimeter(){
   return 2 * (length + width);
 }
 /* return the area of rectangle */
 public double getArea(){
   return length * width;
 }
 /* this is anonation which indicates after method is override to their superclass 
  */
 @Override
 /* return all information of rectangle 
  * its override method 
  */
 public String toString(){
    return "\nRectangle : \n" + super.toString() + "\nLength : " + length + "\nWidth : " + width +"\nPerimeter : " + this.getPerimeter() + "\nArea : " + this.getArea() ;
    }
 public int compareTo(Rectangle r1){
   if(this.getArea() == r1.getArea())
    return 0;
   else if(this.getArea() > r1.getArea())
    return 1;
   else
    return -1;
 }
 /*public boolean equals(Object obj){
  *if(obj instanceof Rectangle) {
  *  return this.length == ((Rectangle)obj).getLength();
    
  }*/
 //}
}
