package finalvariable;


final class bike1 //final class, we cannot extend into child; final will not go beyond the actual limit

{
	
	int speed=40;
	void run()
	{
		System.out.println(speed);
	}
}

class honda1 extends bike1

{

}
public class finalclassdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
