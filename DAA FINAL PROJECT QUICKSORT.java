Design and analysis of algorithm final project


Name: Fakih Hamid
ID: 105274




Quick sort algorithm : 



import java.util.Scanner;

public class Quicksort 
{
	static void swap(int[] array, int i, int j)
	{
	    int temp = array[i];
	    array[i] = array[j];
	    array[j] = temp;
	}
	 
	static int partition(int[]array, int low, int high)
	{
		int pivot = array[high];
		int i = low - 1;
		
		for(int j = low; j <= high -1; j++)
		{
			if(array[j] < pivot)
			{
				i++;
				swap(array, i, j);
			}
		}
		swap(array, i+1, high);
		
		return (i+1);
	}
	static void quicksort(int[]array, int first, int last)
	{	
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i]+ " ");
		}
		System.out.println("");
		System.out.println("");
		
		if(first < last)
		{
			int pivot = partition(array, first, last);
			
			quicksort(array, first, pivot-1);
			quicksort(array, pivot +1, last);
		}
		
		
	}
	
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a size for your array : ");
		int[] array = new int[scan.nextInt()];
		int n = array.length;
		
		for(int i = 0; i < n; i++)
		{
			System.out.print("Enter element "+ i +" of the array : ");
			array[i] = scan.nextInt();
		}
		System.out.println("");
		System.out.println("");
		
		System.out.print("The array : ");
		for(int i = 0; i < n; i++)
		{
			System.out.print(array[i]+ " ");
		}
		
		System.out.println("");
		System.out.println("");
		
		
		quicksort(array, 0, n-1);
		
		System.out.print("The sorted array : ");
		for(int i = 0; i < n; i++)
		{
			System.out.print(array[i]+ " ");
		}
		
		scan.close();
	}
}
