package oops;
/* 
 *for this even if u are accessing in same 
package or different package the object
should be of that class where u have made that variable
*public access modifier we can use with class,variable,methods
*all class members can be access in same as well as in different classes
*to access in different package we need to import that package
*class can not be protected
*In protected we can access class members in same package
*protected access members we can also use in different package 
*/ 
public class AccessModifiers1 {
 public String name;
 public int age;
 double salary;
 protected String clg;
 private char div;
 public AccessModifiers1(){
	System.out.println("hello guys");
}
 void display1() {
	
}
public static void main(String[] args) {
	AccessModifiers1 m1=new AccessModifiers1();
m1.div='F';
System.out.println(m1.div);
}
}
