
// Static methods can be called using the class name or an object.
//  Non-static (instance) methods can be called only using an object.
//  A static method cannot directly access non-static variables or methods.
//  A static method can access only static variables and static methods directly.
//  To access non-static members inside a static method, create an object.
//  A non-static method can directly access both static and non-static members.
//  Non-static variables have separate copies for each object.
//  this keyword can be used only inside non-static methods and constructors.
//  Static methods belong to the class, whereas non-static methods belong to objects.
package OOPS;
public class MethodAccessing {
	static String cname;
	String name;
    int age;
    double salary;
    MethodAccessing(){
    	cdetails();
    	getdata();
    this.name=name;
    this.age=age;
    this.salary=salary;
    }
	void setdata(String cname,String name,int age,double salary) {
	this.cname=cname;
	this.name=name;
	this.age=age;
	this.salary=salary;
	getdata();
	}
	void getdata() {
		System.out.println();
		System.out.println();
		System.out.println(age);
		System.out.println(salary);
		System.out.println(cname);
	}
	static void cdetails() {
		MethodAccessing ma=new MethodAccessing();
		ma.setdata("google","aniket",19,87000);
		MethodAccessing m1=new MethodAccessing();
		cname="TCS";
		m1.getdata();
		System.out.println("our company provides hands on experience");
		m1.name="anjali";
	}
	static void cdetails2(String branch) {
		System.out.println("the company name is : +branch");
	}
	public static void main(String[] args) {
	MethodAccessing m2=new MethodAccessing();
	MethodAccessing.cname="Amazon";
	MethodAccessing.cdetails();
	m2.age=19;
	m2.salary=375;
	m2.cname="Google";
	}
}

