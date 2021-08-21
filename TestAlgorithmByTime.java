package example;
import example.StopWatch;
public class TestAlgorithmByTime {
 public static void main(String args[]){
   StopWatch st1 = new StopWatch();
   st1.start();
   /** you are write your own algorithm than to results algo. take time in milliseconds 
   write your algorithm and test it */ 
   for(int i = 1 ; i < 100000 ; i++)
   { 
     //write code 
   }
   st1.stop();
   System.out.println("Algorithm  required time  : " + st1.getElapsedTime() + " Ms");
 }
 public static double factorial(int number){
   if(number == 1)
    return 1;
   return (number*factorial(number-1));
 }
}
class StopWatch{
 //data field
 private  long startTime;
 private long endTime;
 //no-arg constructer
 StopWatch(){
   startTime = System.currentTimeMillis();
 }
 /** Convert Milliseconds to require sec,min and hour and return String*/
 private String convertTime(long timeInMillis){
   int second = (int)(timeInMillis / 1000);
  int minute = second / 60;
  int remainingSecond = second % 60 ;
  int remainingMinute =  minute % 60;
  int hour = minute / 60 ;
  int remainingHour = hour % 24;
  String time = "" + remainingHour + " : "+remainingMinute + " : " + remainingSecond ;
  return time ;
 }{}
 /** return String starting time to format hour : min : sec */
public  String getStartFormatTime(){
  return convertTime(startTime);
 }
 /** return String ending time to format hour : min : sec */
public  String getEndFormatTime(){
   return convertTime(endTime);
 }
 /** return Start time in milliseconds */
 public  long getStartTime(){
  return startTime;
 }
 /** return end time in milliseconds */
public  long getEndTime(){
   return endTime;
 }
 /** to reset time to start stopwatch */
public  void start(){
   startTime = System.currentTimeMillis();
 }
 /** to assign time in endTime to stop Stopwatch */
public  void stop(){
   endTime = System.currentTimeMillis();
 }
 /** what time complete the moment get time */
public  long getElapsedTime(){
   return endTime - startTime ;
 }
}
