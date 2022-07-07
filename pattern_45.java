/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6
7 7 7
8 8
9
*/
class pattern_45
{
	public static void main(String []args)
	{
	int i,j;
	
	for(i=1; i<=5; i++)
	{	
		for(j=1; j<=i; j++)
		{
		System.out.print(i+" ");
		}
	System.out.println();
	}
	for(i=6; i<=9; i++)
	{
		for(j=i; j<=9;j++)
		{
		System.out.print(i+" ");
		}
	System.out.println();
	}
   }  
}