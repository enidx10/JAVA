package This;

public class Thisdemo1 {
	
	
	
	int a,b;

	
		

		void getValues (int a, int b) //method variable
		{
			this.a=a;
			this.b=b;		
			
			
		}
		
		void printValues()
		{
		System.out.println(a);
		System.out.println(b);
		
		}
		
		
		public static void main(String[] args) {
			
			Thisdemo1 th= new Thisdemo1();
			th.getValues(10,200);
			th.printValues();
			
			
			//Keyword "THIS" is a reference variable in java that refers to current object
		
	}

}
