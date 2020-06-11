import java.util.Scanner;

public class SelectionSort 
{
	
	//Fields used in the in the class
	private static int[] array = new int[20];
	private static int size;
	private static Scanner in= new Scanner(System.in);
	
	//Methods
	
	/*This method is used to:
	 *  input the array
	 * call the sorting method
	 */
	private static void start()
	{
		System.out.println("Enter the size of the array");
		size = in.nextInt();
		System.out.println("Enter the array elements");
		for (int i = 0; i < size; i++) 
		{
			System.out.println("Enter the "+(i+1)+" element");
			array[i]=in.nextInt();
		}
		
		selectionSort();
	}
	
	
	/* This method:
	 * sorts the array using selection sort
	 * if ith element is larger than jth element it calls the swaps method
	 * Calls the end method to display the array
	 */
	private static void selectionSort() 
	{
		for (int i = 0; i < size; i++) 
		{
			if(isSort())
			{
				break;
			}
	
			for (int j = i+1; j < size; j++) 
			{
				if (array[i]>array[j])
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;			
				}
				
				
			}
			
		}
		end();
		
	}
	
	
	/*This method:
	 * checks if the array is sorted and returns appropriate boolean values
	 * 
	 */
	private static boolean isSort() 
	{
		
		for (int i = 0; i < size; i++) 
		{
			if(array[i]>array[i+1])
			{
				return false;
			}
			
		}
		
		return true;
		
	}
	
	
	
	/* This method is used to:
	 * Display the sorted array
	 */
	private static void end() 
	{
		System.out.println("The sorted array is:\n");
		for (int i = 0; i < size; i++) 
		{
			System.out.println(array[i]+" ");
		}
		
	}
	
	
	//Main method

	public static void main(String[] args) 
	{
	   start();
	}

}//By appu13
