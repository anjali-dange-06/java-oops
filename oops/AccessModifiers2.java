package OOPS;
public class AccessModifiers2 {
	AccessModifiers2(){

	}
	public static void main(String[] args) {
		AccessModifiers1 a1=new AccessModifiers1();  
		a1.age=12;
		System.out.println(a1.age);	
		a1.salary=900000.0;
		System.out.println(a1.salary); 
		a1.clg="dypcet";
		System.out.println(a1.clg);
	}
}
