package JavaProject4;

public class Pattern1 {

	public static void main(String[] args) {
		
		for(int i=4;i>0;i--)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<i*2;k++)
			{
				System.out.print("*");
				
			}
			System.out.println("\n");
		}
	
	
	}
}
