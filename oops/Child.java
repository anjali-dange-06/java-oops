package oops;
public class Child extends Parent{
String company;
char div;
void display() {
	System.out.println("good afternoon");
}
static void display2()
{
Child c1=new Child();
c1.display();
System.out.println("childstatic");
 }
void m1() {
super.display();
System.out.println("the name is : "+name);
System.out.println("the id  is : "+id);
System.out.println("the salary is : "+salary);
System.out.println("the company is : "+company);
System.out.println("the division is : "+div);
}
Child(String name,double salary,String company,char div,int id){
	super(id,name,salary);
	this.company=company;
	this.div=div;
}

Child(){
	System.out.println("this is default constructor of child class");
}
public static void main(String[] args) {
Child c1=new Child("anjali",767676.7,"tcs",'A',2);
c1.m1();
	}
}
