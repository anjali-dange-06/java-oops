package Abstraction;
//we can access all the members of Student class
public class Test extends Student{
@Override
	void login(String email,int pass) {
	
}
Test(){
	System.out.println("this is TEst class constructor");
}
	@Override
	void good() {
		System.out.println("she is literally good person");
	}
	public static void main(String[] args) {
		Test t1=new Test();
		
		
	}
	
}
