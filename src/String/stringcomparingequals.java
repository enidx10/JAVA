package String;

public class stringcomparingequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="welcome";
		System.out.println(s.contentEquals("welcome"));
		System.out.println(s.contentEquals("wel come"));
		System.out.println(s.contentEquals("we lco me"));
		
		System.out.println(s.equalsIgnoreCase("Welcome"));//ignores case sensitivity
		
		
		
		
		
	}

}
