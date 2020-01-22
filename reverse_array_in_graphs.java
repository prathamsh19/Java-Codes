import java.util.*;
class reverse_array_in_graphs
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter K");
		int k=s.nextInt();
		for(int i=0;i<n;i+=k)
		{
			if((i+k)<=n)
			{
				for(int j=0;j<k/2;j++)
				{
					int temp=a[i+j];
					a[i+j]=a[i+k-1-j];
					a[i+k-1-j]=temp;
				}
			}
			else
			{
				int k1=n-i;
				for(int j=0;j<k1/2;j++)
				{
					int temp=a[i+j];
					a[i+j]=a[i+k1-1-j];
					a[i+k1-1-j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}