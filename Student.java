package jar;

public class Student {

	  int roll_no;  
	  String name, classno, gender; 
	  public Student(int roll, String n, String c) {
	  this.roll_no = roll ; 
	  this.name = n;
	  this.classno = c;
	  
	  System.out.println("My name is "+name+", I study in "+classno+" class and my roll number is "+roll_no);
	  }              
} 
