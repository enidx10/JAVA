package oop;

public class constructorparameter {
	
	int x;
	int z;
	
	constructorparameter(int a, int b)
	
	{
		x=a;
		z=b;		
	}
	
	void display()
	
	{
	System.out.println(x+z);
	}
	
	
	

	public static void main(String[] args) {
		
	constructorparameter cm1= new constructorparameter(100,200);
	cm1.display();
	
	
		
		
		
		

	}

}
