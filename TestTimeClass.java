package example;
public class TestTimeClass {
 public static void main(String args[]){
   Time t1 = new Time();
   System.out.println(t1.toString());
   Time t2 = new Time(5555550350000l);
   System.out.println(t2.toString());
   Time t3 = new Time(2,64,60);
   System.out.println(t3.toString());
 }
}
class Time{
  private int hour;
  private int minute;
  private int second;
  
  public Time(long elapseTime){
   int Second = (int)(elapseTime / 1000);
   this.second = Second % 60;
   int Minute = Second / 60;
   this.minute = Minute % 60;
   int Hour = Minute / 60;
   this.hour = Hour % 24;
  }
  public Time(){
    //long currentTime = System.currentTimeMillis();
    this(System.currentTimeMillis());
  }
  private void convert(int Hour,int Minute,int Second){
   this.second = Second % 60;
   Minute = Minute + Second / 60;
   this.minute = Minute % 60;
   Hour = Hour + Minute / 60;
   this.hour = Hour % 24;
  }
  public Time(int hour,int minute,int second){
    this.hour   = hour ;
    this.minute = minute ;
    this.second = second ;
    convert(hour,minute,second);
  }
  public int getHour(){
    return hour ;
  }
  public int getMinute(){
    return minute ;
  }
  public int getSecond(){
    return second ;
  }
  public void setTime(long elapseTime){
   int Second = (int)(elapseTime / 1000);
   this.second = Second % 60;
   int Minute = Second / 60;
   this.minute = Minute % 60;
   int Hour = Minute / 60;
   this.hour = Hour % 24;
  }
  public String toString(){
    return "!! Time !!\n" + hour + " : " + minute + " : " + second ;
  }
}
