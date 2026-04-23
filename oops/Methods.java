package oops;
public class Methods {
//method with no returntype and no paramerters
	void add() {
		int a=5;
		int b=3;
		
		System.out.println("the addition is : "+(a+b));
	}
	//method with no returntype and  parameters
	void addd(int a,int b) {
	System.out.println(a+b);
	}
	//method with returntype and no parameters
	int adddd() {
		int a=4;int b=6;
		return a+b;
	}
	//method with parameters and returntype
	int addddd(int x,int y) {
		return x+y;
	}
	public static void main(String[] args) {
	Methods m1=new Methods();
	m1.add();
	m1.addd(6,8);
	int ans=m1.adddd();
	System.out.println(ans);
	int result=m1.addddd(7, 6);
	System.out.println(result);
}
}
