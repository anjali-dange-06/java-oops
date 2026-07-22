//*there are two ways to achieve abstraction 
//1.abstract class            2.Interface
//*abstract class contain abstract keyword in the declaration
//*abstract class can contain constructor,intstance variable,static
//variables,instance methods,static methods
//*abstract class can contains  abstract methods
//*the method without body is called as abstract method
//*we can not make the object of abstract class
//*we need to implement the child class of abstract method
package Abstraction;
public abstract class Student {
public Student() {
	System.out.println("Student constructor");
}
int id;
static String name="TCS";
void m1() {
	
}
static void m2() {
	
}
abstract void login(String email,int pass);
abstract void good();
public static void main(String[] args) {
	
}
}


