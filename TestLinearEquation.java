package example;

import example.LinearEquation;


public class TestLinearEquation {
 public static void main(String args[]){
   LinearEquation l1 = new LinearEquation(4,7,3,22,5,34);
   l1.show();
   System.out.println(l1.getX());
   System.out.println(l1.getY());
 }
}
class LinearEquation{
  private double a,b,c,d,e,f;
  public LinearEquation(){
    this(0,0,0,0,0,0);
  }
  public LinearEquation(double a,double b, double c, double d, double e, double f){
    this.a = a ;
    this.b = b ;
    this.c = c ;
    this.d = d ;
    this.e = e ;
    this.f = f ;
  }
  public double getCoffX1(){
    return a;
  }
  public double getCoffY1(){
    return b;
  }
  public double getCoffX2(){
    return c;
  }
  public double getCoffY2(){
    return d;
  }
   public double getConst1(){
    return e;
  }
    public double getConst2(){
    return d;
  }
  public boolean isSolvable(){
    return ( a * d - b * c )!= 0.0;
  }
  public double getX(){
    return (e * d - b * f) / (a * d - b * c);
  }
   public double getY(){
    return (a * f - e * c) / (a * d - b * c);
  }
  public void show(){
    if(this.isSolvable())
     System.out.println("Point don't exist ");
     else
      System.out.println("X = " + this.getX() + " Y = " + this.getY());
  }
 // public double getIntersactingPoint(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
    
 // }
 } 
