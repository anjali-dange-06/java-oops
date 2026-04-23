//same name as a class name
//no Returntype
//just used to initialize the values
//can be called only once by any one object
package oops;
public class Constructor {
	String name;
	//static clgame="DYPCET";
	int id;
	double marks;
	Constructor(){
		this("aniket");
		System.out.println("this is default constructor ");
	}
	Constructor(String name,int id,double marks){
		this.name=name;
		if(id>=4) {
		this.id=id;
		
		display();
		}
		else {
			System.out.println("invalid id ");
		}
		this.marks=marks;
	}
	Constructor(String name,int id){
		this.name=name;
		this.id=id;
	}
	Constructor(String name){
		this("aniket",1);
		this.name=name;
	}
	//we can call constructor in static method too
	static void  ani() {
		//this("anjali");
		Constructor c1=new Constructor("anjali");
		c1.display();
		System.out.println("good morning friends");
	}
	void display() {
		Constructor c1=new Constructor("pillya",2);
		Constructor c2=new Constructor("anjali");
		System.out.println("the name is : "+name);
		System.out.println("the id is : "+id);
		System.out.println("the marks are : "+marks);
	}
	public static void main(String[] args) {
		Constructor c1=new Constructor("anjali",8,89.98);
		c1.ani();
		
    	//Constructor c2=new Constructor("anjali",8);
		//Constructor c3=c1;
		//c1.display(); 	
	}
}
