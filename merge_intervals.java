import java.util.*;
class merge_intervals
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=1;i<n-2;i+=2)
		{
			if(a[i]>=a[i+1]&&a[i]<=a[i+2])
			{
				a[i]=0;
				a[i+1]=0;
			}
			if(a[i]>=a[i+1]&&a[i]>=a[i+2])
			{
				a[i+2]=a[i];
				a[i+1]=0;
				a[i]=0;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}