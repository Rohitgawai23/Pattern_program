/*
1
2 4
3 6 9
4 8 12 16
5 10 15
6 12
7
*/

class Pattern_28
{
public static void main(String []args)
{
int temp = 1;
        for(int i=1; i<=6/2+1; i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(temp*j+" ");
            }
            System.out.println();
            temp++;
        }
        for(int i=1; i<=6/2; i++)
        {
            for(int j=1;j<=6/2+1-i;j++)
            {
                System.out.print(temp*j+" ");
            }
            System.out.println();
            temp++;
        }
    }
}