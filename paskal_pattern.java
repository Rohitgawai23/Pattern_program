class paskal_pattern
{
	public static void main(String[] args) {
		
		
		 for (int i = 1; i <= 5; i++)
        {
            for (int j = 5; j > i; j--)
            {
                System.out.print(" ");
            }

            int x = 1;
            for (int k = 1; k <= i; k++)
            {
                System.out.print(x + " ");
                x = x * (i - k) / (k);  //Paskal method
            }
            System.out.println();
        }
	}
}