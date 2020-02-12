package Inheritance;


	
	class A // parent class
	
	{
		int a;
		
		void display()
		
		{
	
	
	 System.out.println(a);
	 
		}
	
	}
	
	
class B extends A // B is child class, A is parent class

{
	int b;
	void print()
	{
		System.out.println(b);



	}
}
public class inheritancedemo1 {
	public static void main(String[] args) {
		
		A aobj=new A();
		
		aobj.a=100;
		aobj.display();
		
		B bobjt=new B();
		bobjt.b=200;
		bobjt.a=100;
		bobjt.display();
		bobjt.print();
		
		
		
		
		
		
		
		

	}

}
