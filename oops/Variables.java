package oops;
public class Variables {
String name;
char div;
int id;
double marks;
static String clg="dypcet";
Variables(){
	System.out.println("this is default constructor");
}
Variables(String name,int id,double marks){
	this.name=name;
	this.id=id;
	this.marks=marks;
	this.div=div;
}
void display() {
	System.out.println("the name is "+name);
	System.out.println("the division is : "+div);
	System.out.println("the id is : "+id);
	System.out.println("the marks are : "+marks);
}
	public static void main(String[] args) {
	Variables v1=new Variables("anjali",1,98.94);
	v1.display();
	System.out.println(Variables.clg);
}
}
