/*
001
010
100
*/

class pattern_4june
{
	public static void main(String []args)
	{
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=3; j++)
			{
				if(i==3 && j==1)
					System.out.print("1");
				else if(i==2 && j==2)
					System.out.print("1");
				else if(i==1 && j==3)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}
}