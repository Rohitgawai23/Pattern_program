// write a program given the factorial number 
import java.util.*;
class fact
{
	public static void main(String []args)
	{
	int n,i,fact=1;
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	
	for(i=1; i<=n; i++)
	{
		fact=fact*i;
	
	}
	System.out.println("factorial of"+n+"is= "+fact);

	}
}