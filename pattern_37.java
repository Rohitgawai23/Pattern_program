/*
1 3 5 7 9
3 5 7 9 1
5 7 9 3 1
7 9 5 3 1
9 7 5 3 1
*/

class pattern_37
{
	public static void main(String []args)
	{
	int i,j;
		
	for(i=1; i<=9; i=i+2)
	{
		for(j=i; j<=9; j=j+2)
		{
		System.out.print(j+" ");
		}
		for(j=i-2; j>=1; j=j-2)
		{
		System.out.print(j+" ");
		}
	System.out.println();
	}
     }
}