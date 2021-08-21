package example;

import example.Account;
import example.GeometricShape;
import example.IllegalTriangleException;
import example.Rectangle;
import example.Time;
import example.Triangle;
import example.circle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class TestShape {
 public static void main(String args[]){
   circle c1 = new circle(1.2,"red", true,"light pink");
   System.out.println(c1.toString());
 
  /* System.out.println("radius : " + c1.getRadius());
   System.out.println("Perimeter : " + c1.getPerimeter());
   System.out.println("Circle Area : " + c1.getArea());*/
   
   Rectangle r1 = new Rectangle(12.2,34.5,"blue",true,"red");
   System.out.println(r1.toString());
   /*
   System.out.println("length : " + r1.getLength());
   System.out.println("width : " + r1.getWidth());
   System.out.println("Perimeter : " + r1.getPerimeter());
   System.out.println("Area  : " + r1.getArea());*/
   System.out.println("-----------------------------------------");
   /* call the methods which type of subclass 
    * its polymorphism 
    */
   display(new circle(12.2,"blue",true,"white"));
   display(new Rectangle(12.2,89.6,"blue",true,"white"));
   System.out.println("-----------------Area--------------------");
   System.out.println(getArea(new circle(12.2,"purple", false,"black")));
   System.out.println(getArea(new Rectangle(12.2,89.6,"white", false,"white")));
   System.out.println("-----------------------------------------");
  GeometricShape g1 = new circle(12.22);
  System.out.println(g1.getArea());
System.out.println("-----------------------------------------");
   Object obj1 = new circle(23);//Implicit casting 
   Object obj2 = new Rectangle(12,45);//Implicit casting 
   /*
  // circle cir = obj1; //error
   circle cir = (circle)obj1;//must be follow Explicit casting  */
   GetPerimeter(obj1);
   //System.out.println("Circle Perimeter : " + GetPerimeter(obj1));
   GetPerimeter(obj2);
  // System.out.println("Rectangle Perimeter : " + GetPerimeter(obj2)); 
  System.out.println("-----------------------------------------");
  /* here the ArrayList of Object type circle and that mehods 
   */
  ArrayList<circle> listOfCircle = new ArrayList<circle>();
  listOfCircle.add(new circle(34.56,"brown", true)); 
  listOfCircle.add(new circle(35.56,"orange", false)); 
  listOfCircle.add(new circle(36.56,"green", true)); 
  listOfCircle.add(new circle(37.56,"blue", true)); 
  listOfCircle.add(new circle(38.56,"black", true)); 
  listOfCircle.add(new circle(39.56,"white", true)); 
  System.out.println("/***** : Circles info :******/");
  for(int i = 0 ; i < listOfCircle.size() ; i++)
  System.out.println(listOfCircle.get(i).toString());
  System.out.println("-----------------------------------------"); System.out.println("-----------------------------------------");
  GeometricShape ge1 = new circle(12,"black",true);
  GeometricShape ge2 = new Rectangle(23.45,34.56,"white", false);
  System.out.println("Both Object are Equal Area ? " + equals(ge1,ge2));
  System.out.println("-----------------------------------------");
  ArrayList<Object> object = new ArrayList<>();
   object.add(new Account("Jayendra",4758,2000));
   object.add(new circle(23,"black",true));
   object.add(new Time(12,22,34));
   for(int i = 0 ; i < object.size(); i++)
     System.out.println(object.get(i).toString());
  Rectangle[] rect = new Rectangle[5];
    rect[0] = new Rectangle(12,33,"black", true);
    rect[1] = new Rectangle(12,53,"black", true);
    rect[2] = new Rectangle(122,3,"black", true);
    rect[3] = new Rectangle(2,331,"black", true);
    rect[4] = new Rectangle(1,332,"black", true);
   for(int i = 0 ; i < rect.length ; i++)
    System.out.println(rect[i].toString());
    System.out.println("-----------------------------------------");
   Arrays.sort(rect);
   System.out.println("-----------------------------------------");
   for(int i = 0 ; i < rect.length ; i++)
    System.out.println(rect[i].toString());
    System.out.println("-----------------------------------------");
    try{
      Triangle tr1 = new Triangle(22,2,5);
      Triangle tr2 = new Triangle(1,2,5);
      Triangle tr3 = new Triangle(0,0,0);
      System.out.println(tr1);
      System.out.println(tr2);
      System.out.println(tr3);
    }
    catch (IllegalTriangleException ex){
      ex.printMessage();
    }
   Rectangle rec = new Rectangle(23.78,67.89) ;
   
 }
 /* here supertype as the parameters 
  * when call the method its pass to subtype and its converting supertype (casting object)
  * because supertype are also the instance of all subtype 
  * its call the polymorphism property which largly use oop conspect 
  */
 public static void display(GeometricShape obj){
   System.out.println(obj.toString());
 }
 public static double getArea(GeometricShape obj){
   return obj.getArea();
 }
  /* the parameter is Object type 
   * its practice to generic programming 
   * because Object is always instance of   subclass
   */
 public static void  GetPerimeter(Object obj){
   if(obj instanceof circle){
     System.out.println("Object Type convert into Circle Type by Casting And the Perimeter : " +      ((circle)obj).getPerimeter());
   }
   else if(obj instanceof Rectangle){
     System.out.println("Object Type convert into Rectangle Type by Casting And the Perimeter : " + ((Rectangle)obj).getPerimeter());
   }
 }
 public static boolean equals(GeometricShape g1, GeometricShape g2){
   return g1.getArea() == g2.getArea();
 }
}
