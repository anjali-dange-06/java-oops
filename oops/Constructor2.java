package OOPS;
public class Constructor2 {
	String username;
	String pass;
	String email;
	int age;
	Constructor2(String username,String pass,String email,int age){
		this.username=username;
		if(pass.length()>=6) {
		this.pass=pass;
		this.age=age;
		}
		else {
this.pass="invalid pass";
		}
		if(email.contains("@gmail.com")) {
		this.email=email;
		}
		else {
		this.email="invalid email";
		}
		if(age>18) {
		this.age=age;
		}
		else {
		this.age=0;
		}
	}
	void display() {
		System.out.println("the username is : "+username);
		System.out.println("the password is "+pass);
		System.out.println("the email is "+email);
		System.out.println("the age is :"+age);
		System.out.println("========================");
		
	}
	Constructor2(){
	System.out.println("this is default constructor");	
	}
public static void main(String[] args) {
	Constructor2 c1=new Constructor2("anjali","A@123","anjalidange66447@gmail.com",19);
	c1.display();
	Constructor2 c2=new Constructor2("ankita","Ankita@123","ankita66447@gmail.crom",11);
	c2.display();
}
}
