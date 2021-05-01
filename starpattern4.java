/* STAR_PATTERN              
				   *
				  **
				 ***
				  **
				   *

						*/

class starpattern4
{
	public static void main(String args[])
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=2;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=2;i<=3;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			
			}
			for(int k =3;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}