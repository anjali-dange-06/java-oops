//this different package i have made to just 
//study access modifiers
package packageforAccessModifiers;

//In protected e have to make the object of 
//child class only if u have accessed in child class
import oops.AccessModifiers1;
public class AccessModifiers3 extends AccessModifiers1{
	AccessModifiers3(){
	
	}
	public static void main(String[] args) {
 	AccessModifiers1 a5=new AccessModifiers1();  
	a5.age=12;
	System.out.println(a5.age);
	AccessModifiers3 a3=new AccessModifiers3();
	a3.clg="KBP";
	System.out.println(a3.clg);
	}
}