import java.util.*;
class intersection_arr
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int m=s.nextInt();
		int b[]=new int[m];
		int res[]=new int[m];
		int i=0,j=0,k=0;
		for(int l=0;l<n;l++)
		{
			a[l]=s.nextInt();
		}
		for(int l=0;l<m;l++)
		{
			b[l]=s.nextInt();
		}
		while(i<n&&j<m)
		{
			if(a[i]<b[j])
			{
				i++;
			}
			else if(a[i]>b[j])
			{
				j++;
			}
			else
			{
				res[k]=a[i];
				k++;
				i++;
				j++;
			}
		}
		for(int l=0;l<k;l++)
		{
			System.out.print(res[l]+"  ");
		}
	}
}