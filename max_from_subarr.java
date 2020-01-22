import java.util.*;
class max_from_subarr
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
		for(int i=1;i<n;i++)
		{
			if(a[i-1]+a[i]>a[i])
			{
				a[i]+=a[i-1];
			}
		}
		int max=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}