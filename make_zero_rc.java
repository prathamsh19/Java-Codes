import java.util.*;
class make_zero_rc
{public static void convert(int a[][],int x,int y,int n)
	{
		for(int i=0;i<n;i++)
		{
			if(a[x][i]!=0)
			{
				a[x][i]=-1;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(a[i][y]!=0)
			{
				a[i][y]=-1;
			}
		}
	}

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
			for(int j=0;j<n;j++)
			{
				if(a[i][j]==0)
				{
					convert(a,i,j,n);
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i][j]==-1)
				{
					a[i][j]=0;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}