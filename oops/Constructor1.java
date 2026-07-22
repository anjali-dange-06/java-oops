//constructor is same as method but it doesnot have any returntype
//constructor name is same as that of class name
//special method just doesnot have any returntype
//constructor will automatically execute when we create an object
//for each object constructor can call only once but method can be called any numbers of time
//there are two types of constructor parameterized and dfault constructor
package OOPS;
public class Constructor1 {
	String name;
	int id;
Constructor1(){
	System.out.println("this is a constructor");
}
Constructor1(int a){
	System.out.println("this is parameterized constructor");
}
Constructor1(String a,String b){
	System.out.println((a+" "+b));
}
Constructor1(String name,int id){
	this.name=name;
	this.id=id;
	
}
void add() {
	System.out.println("this is add method");
}
void show() {
	System.out.println("this is show method");
}
void sh() {
	System.out.println("the name is "+name);
	System.out.println("the id is "+id);
}
public static void main(String[] args) {
	Constructor1 s1=new Constructor1();
	s1.add();
	s1.show();
	new Constructor1();//object without reference variable-->also called as anonymous object(object without name)
	new Constructor1().add();//calling method with anonymous object
	new Constructor1().show();//calling methos with anonymous object
Constructor1 c1=new Constructor1(100);
Constructor1 c2=new Constructor1("anjali","dange");
Constructor1 c3=new Constructor1("anjali",101);
c3.sh();
new Constructor1().sh();
}
}