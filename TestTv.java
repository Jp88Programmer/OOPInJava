package example;
import java.util.Scanner;
public class TestTv {
 public static void main(String args[]){
   Scanner input = new Scanner(System.in);
   System.out.println("tv is On/Off please enter Y/N respectively : ");
   char tvMod = input.next().charAt(0);
   if( tvMod == 'N' ){
    System.out.println("Tv is Switch off");
     System.exit(1);
    }
   boolean onOff = tvMod == 'Y';
   Tv tv1 = new Tv();
   System.out.println("Channel No : " + tv1.channel + "\nVolume : " + tv1.volume );
   tv1.setChannel(37);
   tv1.increaseChannel();
   tv1.increaseVolume();
   System.out.println("Channel No : " + tv1.channel + "\nVolume : " + tv1.volume );
    tv1.decreaseChannel();
    tv1.decreaseVolume();
    System.out.println("Channel No : " + tv1.channel + "\nVolume : " + tv1.volume );
    tv1.turnOff();
 }
}
class Tv{
  /** that's is channel and its 270 channel in tv */
  int channel;
 /** volume range 0 that mute and maximum 100 */
  int volume;
  boolean turnOnOrOff;
  Tv(){
  /** By default channel is 1 */
    channel = 1;
  /** By default volume is low medim is 30 */
    volume = 30;
  /** By default tv is on */
    turnOnOrOff = true ;
  }
   Tv(boolean turnOn , int newChannel , int newVolume){
     turnOnOrOff = turnOn;
     channel = newChannel;
     volume = newVolume;
   }
   int setChannel(int changeCh){
     channel = changeCh;
     return channel;
   }
   int increaseChannel(){
     channel++;
     if(channel > 270)
      channel = 1 ;
     return channel;
   }
   int increaseVolume(){
     volume++;
     if(volume > 100) 
      volume = 100;
     return volume;
   }
   int decreaseChannel(){
     channel--;
     if(channel < 1)
      channel = 270 ;
     return channel;
   }
   int decreaseVolume(){
     volume--;
     if(volume < 1) {
       System.out.println("Muted\n");
       volume = 0;
     }
     return volume;
   }
   void turnOff(){
     turnOnOrOff = false ;
     System.out.println("Tv is switch off");
   }
   void turnOn(){
    turnOnOrOff = true ;
    System.out.println("Let's Enjoy !") ;
   }
}
