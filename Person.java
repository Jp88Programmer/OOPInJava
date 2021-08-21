package example;
import java.util.*;
public class Person {
 private String name;
 private String address;
 private long phoneNumber;
 private String emailAddress;
 public Person(){
   this("name","address",91,"emailAddress");
 }
 public Person(String name, String address,long phoneNumber, String emailAddress){
   this.name = name ;
   this.address = address;
   this.phoneNumber = phoneNumber;
   this.emailAddress = emailAddress;
 }
 @Override
 public String toString(){
   return "\nName : " + name + "\nAddress : " + address + "\nPhone Number : " + phoneNumber + "\nEmail Address : " + emailAddress ;
 }
}
class Student extends Person{
 final String[] STATUS = {"freshman",
"sophomore","junior","senior"};
 private String  classStauts ;
 public Student(){
   this("freshman");
 }
 public Student(int index)
 {
   classStauts = STATUS[index];
 }
 public Student(String stauts){
   this.classStauts = stauts;
 }
 public Student(String name, String address,long phoneNumber, String emailAddress){
   super(name,address,phoneNumber,emailAddress);
 }
 @Override
 public String toString(){
   return super.toString() + "\nclassStauts : " + classStauts ;
 }
}
class Employee extends Person{
 private String office ;
 private double salary;
 private Date dateCreated = new Date();
 public Employee(){
   this("Software development",45000);
 }
 public Employee(String office, double salary){
   this.office = office ;
   this.salary = salary;
 }
 public Employee(String name, String address,long phoneNumber, String emailAddress,String office, double salary){
   super(name,address,phoneNumber,emailAddress);
   this.office = office ;
   this.salary = salary;
 }
 @Override
 public String toString(){
   return super.toString() + "\nOffice : " + office + "\nSalary : " + salary + "\nJoin the date : " + dateCreated ;
 }
}
class Faculty extends Employee{
 private int  officeHours ;
 private int rank ;
 public Faculty(){
   this(12,3);
 }
 public Faculty(int officeHours,int rank){
   this.officeHours = officeHours ;
   this.rank = rank;
 }
  public Faculty(String name, String address,long phoneNumber, String emailAddress,int officeHours,int rank){
   //super(name,address,phoneNumber,emailAddress);
   this.officeHours = officeHours ;
   this.rank = rank;
 }
 @Override
 public String toString(){
   return super.toString() + "\nOffice Hours : " + officeHours +"\nRank : " + rank ;
 }
}
class Staff extends Employee {
 private String titel ;
 public Staff(){
   this("Management staff");
 }
 public Staff(String titel){
   this.titel = titel ;
 }
 public Staff(String name, String address,long phoneNumber, String emailAddress, String titel){
   //super(name,address,phoneNumber,emailAddress);
   this.titel = titel ;
 }
 @Override
 public String toString(){
   return super.toString() + "\nTitel : " + titel ;
 }
}
