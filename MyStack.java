package example;
import java.util.ArrayList;
/* this Stack class for Object type to contain Object to One time (Its Stack property )
 */
public class MyStack {
 public static void main(String args[]){
   String num = "jayendra";
 }
 /* ArrayList invoke the Object type and its instance of any of class 
  */
 private ArrayList<Object> list = new ArrayList<Object>();
 /* return true if stack is Empty */
 public boolean isEmpty(){
   return list.isEmpty();
 }
 /* return postive integer value which indicate the size of stack
  */
 public int getSize(){
   return list.size();
 }
 /* insert object in Stack */
 public  void push(Object o){
   list.add(o);
 }
 /* delete top of the Object */
 public  Object pop(){
  Object o = list.get(getSize()-1);
     list.remove(getSize()-1);
     return o;
 }
 /* return Object type to top of the Object */
 public  Object peek(){
   return list.get(getSize()-1);
 }
 @Override
 /* return string to all info of stack */
 public String toString(){
   return "Stack : \n" + list.toString();
 }
}
