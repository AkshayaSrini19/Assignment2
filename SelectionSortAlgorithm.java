
public class SelectionSortAlgorithm {
	public void selectionsort(int arr[])
	{
	 for (int i = 0; i < arr.length - 1; i++)  
     {  
         int index = i;  
         for (int j = i + 1; j < arr.length; j++){  
             if (arr[j] < arr[index]){  
                 index = j;//searching for lowest index  
             }  
         }  
         int smallerNumber = arr[index];   
         arr[index] = arr[i];  
         arr[i] = smallerNumber;  
     }  
 }  

	public static void main(String[] args) {
		   int[] arr1 = {9,14,3,2,4,11,8,22};  
	        System.out.println("Before Selection Sort");  
	        for(int i:arr1){  
	            System.out.print(i+" ");  
	        }  
	        System.out.println();  
	          
	       SelectionSortAlgorithm s=new SelectionSortAlgorithm();
	       s.selectionsort(arr1);  
	         
	        System.out.println("After Selection Sort");  
	        for(int i:arr1){  
	            System.out.print(i+" ");  
	        }  
	    }  
	


}