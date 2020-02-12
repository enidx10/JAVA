package overriding;

	class bank
	{
		double rateofinterest()
		{
			return 0;
		}
	}

	class citi extends bank
	{
		double rateofinerest()
		{
return 10.5;
		}
	}
	class bofa extends bank
	{
		double rateofinterest()
		{
			return 22.5;
		}
	}
	
	class cp1 extends bank
	{
		double rateofinterset()
		{
			return 22.5;
		}
	}

public class overriding1 {

	public static void main(String[] args) {
		
		citi ci=new citi();
		System.out.println(ci.rateofinerest());
		
		bofa bo=new bofa();
		System.out.println(bo.rateofinterest());
		
		cp1 cp=new cp1();
		System.out.println(cp.rateofinterest());
		

	}

}
