class Pattern7
{
public static void main(String args[])
{
	int add=0;
for(int i = 1; i <=5; i ++)
{
	for(int j = 1; j<=i;j++)
	{
	System.out.print(j);
	add = add+j;
	
	}
	System.out.print(" "+add);
	add = 0;
	System.out.println();
}
}
}