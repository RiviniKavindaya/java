class mergeSort{
	int []  mergesort(int a[])
	{
		int n=a.length;
		if(n<=1)
		{
			return a;
		}
		else
		{
			
			int L[]=new int[n/2+1];
			int R[]=new int[n/2+2];
			return merge(L,R);
		}
	}
	int []  merge(int L[],int R[])
	{
		int x=L.length-2;
		int y=R.length-2;
		int m=x+y;
		int s[]=new int[m];
		int i=0;
		int j=0;
				
		L[x+1]=1000;
		R[y+1]=1000;
		for(int k=0;k<m;k++)
		{
			if(L[i]<=R[j])
			{
				s[k]=L[i];
				i=i+1;
			}
			else if(L[i]>R[j]){
				s[k]=R[j];
				j=j+1;
			}
		}
		return s;
	}
	
	public void print(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		mergeSort m1=new mergeSort();
		int array[]={5,3,8,9,1,6};
		
		m1.mergesort(array);
		m1.print(array);
	}
	
}