

public class MergeSortAlgorithm {
	void merge(int a[],int L,int mid,int R)
	{
		int l=mid-L+1;
		int r=R-mid;
		
		int left[]=new int[l];
		int right[]=new int[r];
		for(int i=0;i<l;++i)
		{
		left[i]=a[L+i];
		}
		for(int j=0;j<r;++j)
		{
		right[j]=a[mid+1+j];
		}
		int i=0,j=0;
		int k=L;
		while(i<l && j<r)
		{
			if(left[i]<=right[j])
			{
				a[k]=left[i];
				i++;
			}
			else
			{
				a[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<l)
		{
			a[k]=left[i];
			i++;
			k++;
		}
		while(j<r)
		{
			a[k]=right[j];
			j++;
			k++;
		}
	}
		void sort(int a[],int L,int R)
		{
			if(L<R)
			{
				int mid=(L+R)/2;
				sort(a,L,mid);
				sort(a,mid+1,R);
				merge(a,L,mid,R);
			}
		}
	
	public static void main(String[] args) {
int a[]= {4,8,2,3,1,6,9,7,10,5};
MergeSortAlgorithm ob= new MergeSortAlgorithm();
ob.sort(a, 0, a.length-1);
System.out.println("\nSorted Array");
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]+" ");
}
	}

}
