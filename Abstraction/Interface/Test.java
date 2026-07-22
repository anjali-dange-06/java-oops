package Interface;
//interface used to achieve 100% abstraction
//interface can contains only abstract method till java 8 version
//interface can contains static ,default,and private method from java 9
//interface can not contains instance method and instance variable
//interface can not contains constructor
//we can not create the object of interface
//class can not extends interface
//class can implements interface
//we override the method of interface into Demo class
public interface Test {
/*
 Test(){
         //no constructor in interface	
         }
 */
	//static method
	static void food() {
		System.out.println("food");
	}
	//default method
	default void good() {
		System.out.println("good");
	}
	//private method
	private void m1() {
		System.out.println("anjali");
		//no instance variable is there
	}
	public static final double salary=100000;
	int id=4;//public static final by default here we have to give value compulsory
    String name="anjali";//public static final
   void login();//this  is abstract method compiler will write
                 //automatically public abstract before to this
   public abstract void registration();
    public static void main(String[] args) {
  //Test t1=new Test();//we can't create object of interface  	
    System.out.println(Test.name);//because by default its static no
                             //so we can access it via class name
   Test.food();
   System.out.println(Test.salary);
   //Test.m1();
    Demo.m4();
    //Test.m4(); not possible by interface
    }
}