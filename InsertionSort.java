import java.util.Scanner;

public class InsertionSort 
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
				
			insertationSort();
		}
			
			
		/* This method:
    	 * calls the bubble method
		 * if returned value is true it breaks the array and calls the end function
		 * if false it continues the loop
		 */
		private static void insertationSort() 
		{
		  for (int i = 0; i < size; i++) 
			{  
			   if(isSort())
				 {
					 break;
				 }
			  
			   for (int j = 1; j < size; j++) 
			    {
				  
				   if(array[i] > array[j])
				   {
					  shift(i,j);
				   }
				   
		        }
			  
			 } 
			
			end();
				
			}
		
	/*This method:
	 * shifts elements of the array to make spaces
	 * and inserts the  element
	 */
		
	private static void shift(int i, int j) 
	{
		int temp = array[j],k; 
		for ( k = j;  k > i; k--) 
		{
			 array[k] = array[k-1];
		}
		array[k] = temp;
		
	}
	
	/*This method:
	 * checks if the array is sorted and returns appropriate boolean values
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
					System.out.print(array[i]+" ");
				}
				
			}
			
			
			//Main method

			public static void main(String[] args) 
			{
			   start();
			}


}
