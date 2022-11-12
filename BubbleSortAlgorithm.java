import java.util.Scanner;

public class BubbleSortAlgorithm {

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
			for(j=1;j<a.length-i;j++)
			{
				if(a[j]<a[j-1])
				{
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
			
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println("Sorted array is" +a[i]);
		}
		
	}

}
