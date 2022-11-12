import java.util.Scanner;

public class QuickortAlgorithm {

	public static void main(String[] args) {
		int[] a=new int[7];
		int i,j,temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array values");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println("Sorted array is" +a[i]);
		}
	}

}
