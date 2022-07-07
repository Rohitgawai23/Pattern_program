/*
1 2 3 4 5 4 3 2 1
2 3 4 5 4 3 2
3 4 5 4 3
4 5 4
5
*/
class Pattern_24
{
	public static void main(String []args)
	{

	for (int i = 1; i <= 5; i++)
        {
            for (int j = i; j <= 5; j++)
            {
                System.out.print(j + " ");
            }
            for (int k = 5 - 1; k >= i; k--)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}