
public class SubsetArray {

	public static void main(String[] args) {
int a1[]= {11,3,7,1,13,2,9};
int a2[]= {11,3,7};
int a3[] = new int[5];
int i,j,k=0;

	for(i=0;i<a1.length;i++)
	{
	for(j=0;j<a2.length;j++)
	{
		if(a1[i]==a2[j])
		{
			a3[k]=a2[j];
			
		}
	}
	k++;	
}
	System.out.println("Subset array found");
for(i=0;i<a3.length;i++)
{
	
	System.out.println(a3[i]);
}
	}

}
