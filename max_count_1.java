import java.util.*;
class max_count_1
{
	public static void main(String args[])
	{
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int m=s.nextInt();
		int right=0,left=0,maximum = m,l=0,r=0,max=0;
		while(right<n)
		{
			if(a[right]==1)
			{
				right++;
			}
			else if(a[right]==0&& m>0)
			{
				right++;
				m--;
			}
			else if(a[right]==0)
			{
				while(a[left]!=0)
				{
					left++;
				}
				left++;
				if(m<maximum)
				{
					m++;
				}
				if(left>right)
				{
					left=right;
				}
				if(right-left>max)
				{
					max=right-left;
				}
			}
		}
		System.out.println(max);
	}
}