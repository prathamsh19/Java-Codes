import java.util.*;
class max_occured_int
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int l[]=new int[n];
		int r[]=new int[n];
		int max=0;
		System.out.println("Enter ranges");
		for(int i=0;i<n;i++)
		{
			l[i]=s.nextInt();
			r[i]=s.nextInt();
			if(r[i]>max)
			{
				max=r[i];
			}
		}
		//System.out.println(max);
		int a[]=new int[max+2];
		for(int i=0;i<=max+1;i++)
		{
			a[i]=0;
		}
		for(int i=0;i<n;i++)
		{
			a[l[i]]+=1;
			a[r[i]+1]-=1;
		}
		/*for(int i=0;i<=max+1;i++)
		{
			System.out.print(a[i]+"   sdghascgdh     ");
		}*/
		for(int i=1;i<=max+1;i++)
		{
			a[i]=a[i]+a[i-1];
			//System.out.print(a[i]+"    ");
		}
		int max1=0;
		for(int i=0;i<=max;i++)
		{
			if(a[i]>max1)
			{
				max1=a[i];
			}
		}
		System.out.println(max1);

	}
}