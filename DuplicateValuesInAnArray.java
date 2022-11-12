
public class DuplicateValuesInAnArray {

	public static void main(String[] args) {
		int[] a= {1,2,1,3,2,4,5,3,6,7};
		int i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicated values are " +a[i]);
				}
			}
		}
	}

}
