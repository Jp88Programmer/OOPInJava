package example;

import example.RegularPolygon;


public class TestRegularPolygon {
 public static void main(String args[]){
   RegularPolygon r1 = new RegularPolygon();
   System.out.println(r1.toString());
   RegularPolygon r2 = new RegularPolygon(5,10,3,-4);
   System.out.println(r2.toString());
   r2.setNumberOfside(50);
   r2.setLengthOfSide(100);
   r2.setCenterCorrentinate(-4,-6);
   System.out.println(r2.toString());
 }
}
class RegularPolygon{
  /** Number of Side */
  private int n;
  /** Length of Side */
  private int side;
  /** centre Correntnate of X and Y respectively */
  private double x;
  private double y;
  /** no-args Constructer with default valu8 */
  public RegularPolygon(){
    this(3,1,0,0);  
  }
  /** Constructer with value of Number of side, length and center point */
  public RegularPolygon(int n , int side , double x , double y){
    this.n = n;
    this.side = side;
    this.x = x;
    this.y = y;
  }
  public RegularPolygon(int n , int side){
    this.n = n;
    this.side = side;
    this.x = 0;
    this.y = 0;
  }
  /** All getter method to return the datafeild */
  public int getNumberOfSide(){
    return n;
  }
  public int getLengthOfSide(){
    return side;
  }
   public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }
  /** return String to centre point */
  public String getCenterCorrentinate(){
    return "(" + this.getX() + "," + this.getY() + ")";
  }
  /** All Setter Method to edit the dataField */
  public void setNumberOfside(int n){
    this.n = n;
  }
  public void setLengthOfSide(int s){
    this.side = s;
  }
  public void setCenterCorrentinate(double x, double y){
    this.x = x;
    this.y = y;
  }
  /** return the Perimeter of Ploygon */
  public double getPerimeter(){
    return n*side;
  }
  /** return the Area of Polygon */
  public double getArea(){
    return n * side  * side / (4 * Math.tan(Math.PI/n));
  }
  /** to Return the String of All info about Ploygon */
  @Override
  public String toString(){
    return "Number Of Side : " + n + "\nLength Of Side : " + side + "\nCenter Correntinate : " + "(" + x + "," + y + ")" + "\nPerimeter of Polygon : " + this.getPerimeter() + "\nArea of Polygon : " + String.format("%-10.3f",this.getArea() );
  }
}
