package Interface;
//import Interface.Test;
public class Demo implements Test{
@Override
public void login() {//while abstracting it we have to write public 
	                //giving body to that method without changing 
	                //it in parent class it was public void login
	               //so name should be same and also everything should be same
	System.out.println("login");
}
@Override
public void registration() {
System.out.println("registration");
}
static void m4() {
	System.out.println("nsmaste");
}
public static void main(String[] args) {
Demo d1=new Demo();
d1.login();
d1.registration();
System.out.println(Demo.name);
System.out.println(Demo.id);
Demo.m4();
}
}
