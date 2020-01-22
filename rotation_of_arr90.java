import java.util.*;
class rotation_of_arr90
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int a[][]=new int [n][n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			    a[i][j]=a[i][j]+a[j][i];
				a[j][i]=a[i][j]-a[j][i];
				a[i][j]=a[i][j]-a[j][i];
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>=0;j--)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}