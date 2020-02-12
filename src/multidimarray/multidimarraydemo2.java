package multidimarray;

public class multidimarraydemo2 {

	public static void main(String[] args) {
		

		
		int a[][]= {{100,200},{300,400},{500,600}};
		
		System.out.println("Number of rows :" + a.length);
		System.out.println("Number of columns :" + a[0].length);
		
		//enhanced for loop
		
		for (int r[]:a)
		{
			for(int i:r)
				
			{
		System.out.println(i);
			}
		for(int i=0; i<a.length;i++)
		{
			
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}
	


		}
		
	}
}
		
		
		
	


