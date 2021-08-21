                                                                                                    package example;
import java.util.ArrayList;
import java.util.Scanner;
public class Course{
 public static void main(String args[]){
  course cou1 = new course("Data structures");
  course cou2 = new course("Java programming");
  cou1.addStudent("Jayendra parmar");
  cou1.addStudent("harshd parmar");
  cou1.addStudent("narendra avasthi");
  cou2.addStudent("jayendra parmar");
  cou2.addStudent("sanket");
  cou2.addStudent("Chirag Parmar");
  System.out.println("Number of Students to join "+ cou1.getCourseName() + " "+cou1.getNumberOfStudent());
  cou1.getStudents();
  System.out.println("Number of Students to join "+cou2.getCourseName() + " "+  cou2.getNumberOfStudent());
  cou2.getStudents();
  System.out.println("Number of course in list : " + course.getNumberOfCourses());
 }
}
class course{
  private static  int numberOfCourse;
  private String courseName;
  private ArrayList<String> student = new ArrayList<>();
  public course(){
   
    
    //this.student = new String[60];
  }
  course(String couseName){
    this.courseName = courseName;
  }
  /*private void doubleSize(){
    String[] str = new Stgring[2*student.length];
    for(int i = 0 ; i < student.length ; i++h
    str[i] = student[i];
    student = str ;
  }*/
  /**to set the course name to method */
  void setCourse(String course){
    this.courseName = course ;
  }
  /** getCourse name */
  String getCourseName(){
    return courseName;
  }
  /** add the students in course which maximum 60 */
  void addStudent(String stude){
    student.add(stude);
  }
  /** number of students who join the course */
  int getNumberOfStudent(){
    return student.size();
  }
  /** get students name  who  join the course */
  void getStudents(){
    for(int i = 0 ; i < student.size() ; i++)
    System.out.println(student.get(i));
  }
  void dropStudent(String name){
   if(student.contains(name)){
     student.remove(name);
   }
   else
    System.out.println("Not exists ");
  }
  void clear(){
    this.student = null;
  }
  /** how many course add in list */
 static  int getNumberOfCourses(){
   return numberOfCourse;
  }
}