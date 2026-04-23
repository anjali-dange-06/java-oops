//in same class we do constructor or method chainng 
//but in different classes we use inheritance
package oops;
public class Parent {
	int id;
	double salary;
	String name;
	static String clg="dypcet";
 void display() {
		 System.out.println("good morning");
	 }
	  static void display2()
          {
		  System.out.println("parent class static");
		 }
	  Parent(int id,String name,double salary){
		this("anjali");
		  this.id=id;
		 this.name=name;
		 this.salary=salary;
		 
	  }
	  Parent(){
		  System.out.println("this is default constructor"
		  		+ " of parent class");
	  }
	  Parent(int id,String nmae){
		  this.id=id;
		  this.name=name;
	  }
	  Parent(String name){
		  this.name=name;
	  }
public static void main(String[] args) {
	
}
}
