import java.util.*;
class spiral_arr
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int m=2*n;
		int a=0;
		int b=m-2;
		int c=m-2;
		int d=0;
		int count=1;
		int arr[][]=new int[m-1][m-1];
		while(a<=c && d<=b)
		{
			for(int i=a;i<=b;i++)
				arr[a][i]=n;
			a++;
			for(int i=a;i<=c;i++)
				arr[i][b]=n;
			b--;
			for(int i=b;i>=d;i--)
				arr[c][i]=n;
			c--;
			for(int i=c;i>=a;i--)
				arr[i][d]=n;
			d++;
			n--;
		}
		for(int i=0;i<m-1;i++)
		{
			for(int j=0;j<m-1;j++)
				{
					System.out.print(arr[i][j]+" ");
		        }
		    System.out.println();
		}
	}
}