/*

1 2 3 4 5 1

2 3 4 5 1

3 4 5 1

4 5 1

5 1
*/

class pattern_35
{
public static void main(String []args)
{
	int i,j;
	
	for(i=1; i<=5; i++)
	{
		for(j=i; j<=5; j++)
		{
		System.out.print(j+" ");
		}
		for( j=1; j>=1; j--)
		{
		System.out.println(j+" ");
		}
	System.out.println();
	}
   }
}