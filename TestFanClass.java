package example;
import java.util.Scanner;
public class TestFanClass {
 public static void main(String args[]){
   Fan f1 = new Fan();
   System.out.println(f1.toString());
   f1.setColor("Yellow");
   f1.setRadius(4.5);
   f1.setFanOn("on");
   f1.setSpeed("fast");
   System.out.println(f1.toString());
   Fan f2 = new Fan();
   System.out.println(f2.toString());
   f2.setColor("Red");
   f2.setRadius(6.56);
   f2.setFanOn("off");
   f2.setSpeed("medium");
   System.out.println(f2.toString());
 }
}
/** its class represent to Fan and methods */
class Fan{
/** its word to represent to speed point view */
 private String[] Const = {"SLOW","MEDIUM","FAST"};
 private int speed;
 /** its represent to Fan is on or off */
 private boolean on;
 /** Fan physical properties */
 private double radius;
 private String color;
 /** no-args constructer to assign default value */
 public Fan(){
   speed = Const[0].indexOf("SLOW") + 1;
   on = false ;
   radius = 5 ;
   color = "blue";
 }
 /** return speed to String */
 public String getSpeed(){
   return Const[speed-1];
 }
 /** its return Fam on or not */
 public boolean getOn(){
   return on;
 }
 public double getRadius(){
   return radius;
 }
 public String getFanColor(){
   return color;
 }
 /** Fan speed as args is speed in word like slow */
 public void setSpeed(String eff){
   speed = Const[0].equalsIgnoreCase(eff) ? 1 : 1;
   speed = Const[1].equalsIgnoreCase(eff) ? 2 : 1;
   speed = Const[2].equalsIgnoreCase(eff) ? 3 : 1;
 }
 /** its command to Fan on/off */
 public void setFanOn(String eff){
   on = eff.equalsIgnoreCase("ON");
 }
 public void setColor(String color){
   this.color = color;
 }
 public void setRadius(double radius){
   this.radius = radius;
 }
 /** its return String to all information about Fan */
 @Override
 public String toString(){
   if(on)
     return "Fan color : " + color + "\nFan Radius : " + radius + "\nFan speed : " + Const[speed-1];
   else
     return "Fan is off ! " + "\nFan color : " + color + "\nFan Radius : " + radius ;
 }
}