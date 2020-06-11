import java.util.Scanner;

public class BubbleSort 
{
 //Fields used in the in the class
 private static int[] array = new int[20];
 private static int size;
 private static Scanner in= new Scanner(System.in);
 //Methods
		
 /*This method is used to:
  *input the array
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
			
   bubbleSort();
 }
		
		
 /* This method:
  * calls the bubble method
  * if returned value is true it breaks the array and calls the end function
  * if false it continues the loop
  */
 private static void bubbleSort() 
  {
    for (int i = 0; i < size; i++) 
		{  
			if(bubble())
			{
				break;
			}
		}
				
			
	end();
			
   }
		
		
 /* This method:
  * Checks if array is sorted and returns true 
  * If false it checks and swaps adjacent elements appropriately
  */
 private static boolean bubble() 
 {
   if(isSort())
    {
    	return true;
     }
			
	for (int i = 0; i < size-1; i++) 
		{
		  if(array[i] > array[i+1])
			{
			  int temp= array[i];
			  array[i] = array[i+1];
			  array[i+1] = temp;
			}							
	}
			
	return false;
			
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


}// By appu13
