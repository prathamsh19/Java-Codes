import java.util.*;
class remove_duplicates
{
	public static void main(String args[])
	{
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==a[j])
			{
				continue;

			}
			if(a[i]!=a[j])
			{
				j++;
				a[j]=a[i];
			}
		}
		for(int i=0;i<=j;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}