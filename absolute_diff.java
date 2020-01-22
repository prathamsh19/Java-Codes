import java.util.*;
class absolute_diff
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int l=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		int c[]=new int[l];
		for(int q=0;q<n;q++)
		{
			a[q]=s.nextInt();
		}
		for(int q=0;q<m;q++)
		{
			b[q]=s.nextInt();
		} 
		for(int q=0;q<l;q++)
		{
			c[q]=s.nextInt();
		}
		int i=0,j=0,k=0,diff=100,max=0,min=0,h=1000;
		while(i<n&&j<m&&k<l)
		{
			if(a[i]>b[j]&&a[i]>c[k])
			{
				max=a[i];
				if(b[j]>c[k])
				{
					min=c[k];
					k++;
				}
				else
				{
					min=b[j];
					j++;
				}



				if(max-min<diff)
				{
					diff=max-min;
				}
			}
			else if(b[j]>a[i]&&b[j]>c[k])
			{
				max=b[j];
				if(a[i]>c[k])
				{
					min=c[k];
					k++;
				}
				else
				{
					min=a[i];
					i++;
				}


				if(max-min<diff)
				{
					diff=max-min;
				}
			}
			else
			{
				max=c[k];
				if(a[i]>b[j])
				{
					min=b[j];
					j++;
				}
				else
				{
					min=a[i];
					i++;
				}



				if(max-min<diff)
				{
					diff=max-min;
				}
			}
		}
		System.out.println(diff);  
	}
}