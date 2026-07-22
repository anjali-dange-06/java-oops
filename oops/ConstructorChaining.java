package OOPS;

//constructor chaining
//this call is used in constructor only and only at first line
//this keyword we can use in constructor and method
// we cant use this keyword in static method
//this call can be used only once in the constructor
public class ConstructorChaining {
	ConstructorChaining(){
		this(11);
System.out.println("zero parameterized constructor");		
	}
	ConstructorChaining(int a){
	this(11,22);
		System.out.println("one parametrized constructor");
	}
	ConstructorChaining(int a,int b){
	
		System.out.println("two parametrized constructor");
	}
public static void main(String[] args) {
	ConstructorChaining c1=new ConstructorChaining();

ConstructorChaining c2=new ConstructorChaining(1,2);
		
	}
}

