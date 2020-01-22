import java.util.*;
class max_of_ji
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("Enter elements");
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			b[i]=i;
		}
		for(int i=1;i<n;i++)
		{
			if (a[i]<a[i-1]) 
			{
                a[i]=a[i]+a[i-1];
                a[i-1]=a[i]-a[i-1];
                a[i]=a[i]-a[i-1];

                b[i]=b[i]+b[i-1];
                b[i-1]=b[i]-b[i-1];
                b[i]=b[i]-b[i-1];
                i=0;
            }
		}
		int max=0;
		for(int i=1;i<n;i++)
		{
			//System.out.println(b[i]);
			if((b[i]-b[i-1])>max)
			{
				max=b[i]-b[i-1];
			}
		}
		System.out.println(max);
		/*int max=0;
		for(int j=1;j<n;j++)
		{
			for(int i=j-1;i>=0;i--)
			{
				if(a[j]>a[i]&&(j-i)>max)
				{
					max=j-i;
				}
			}
		}
		System.out.println(max);*/
	}
}