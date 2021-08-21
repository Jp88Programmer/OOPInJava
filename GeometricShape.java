package example;
import example.GeometricShape;
import java.util.*;
/* GeometricShape class is superclass 
 * its represent the common property of all shape 
 * here feild and methods are invoked subclass 
 */
/* An abstract class cannot be used to create objects. An abstract class can contain 
 * abstract methods, which are implemented in concrete subclasses.
 */
/* Abstract classes are like regular classes, but you cannot create instances of abstract classes 
using the new operator. An abstract method is defined without implementation. Its implemen-
tation is provided by the subclasses. A class that contains abstract methods must be defined 
as abstract.
 */
public abstract class GeometricShape implements MathsSimlier,Comparable<GeometricShape>{
  String color ;
  boolean filled;
  String border;
  java.util.Date dateCreated;
  /* default constructor */
  GeometricShape(){
    color = "white";
    filled = false;
    border = "black";
    dateCreated = new Date();
  }
  /* here after parameters constructer */
  /* The constructor in the abstract class is defined as protected, because it is used only by 
subclasses. 
   */
  protected GeometricShape(String color){
    this.color = color ;
    filled = false;
    dateCreated = new Date();
  }
  protected GeometricShape(String color,boolean filled){
     this.color = color;
    this.filled = filled;
    dateCreated = new Date();
  }
  protected GeometricShape(String color,boolean filled, String border){
     this.color = color;
    this.filled = filled;
    this.border = border;
    dateCreated = new Date();
  }
  /* its getter methods */
  public String getColor(){
    return color;
  }
  public String getBorder(){
    return border;
  }
  public boolean getFilled(){
    return filled;
  }
  public Date getDate(){
    return dateCreated;
  }
  /* its setter methods */
  public void setColor(String color){
    this.color = color;
  }
  public void setBorder(String border){
    this.border = border;
  }
  public void setFilled(boolean filled){
    this.filled = filled;
  }
  /* to info of attributes in String type and return 
  */
  public String toString(){
    return "create on " + this.getDate() + "\nColor : " + color + "\nFilled " + filled + "\nBorder : " + border;
  }
  /* this comparTo method the Overrride in Comparable interface 
   */
  @Override
  public int compareTo(GeometricShape g1){
    if(g1.getArea() < this.getArea())
     return 1 ;
    else if(g1.getArea() > this.getArea())
     return -1 ;
    else
     return 0 ;
  }
  /* the abstract method not use instance of superclass also call do nothing method */
  public abstract double getArea();
  /* the abstract method not use instance of superclass also call do nothing method */
  public abstract double getPerimeter();
}
interface MathsSimlier{
  public abstract double getArea();
  public abstract double getPerimeter();
}