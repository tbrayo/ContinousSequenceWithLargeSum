
import java.util.*;
public class ContinousSequenceWithLargeSum{

	public static void maxSubArraySum(int[] input)
	{
		int max_so_far = Integer.MIN_VALUE,
		max_ending_here = 0,start = 0,
		end = 0, s = 0;

		for (int i = 0; i < input.length - 1; i++)
		{
			max_ending_here += input[i];

			if (max_so_far < max_ending_here)
			{
				max_so_far = max_ending_here;
				start = s;
				end = i;
			}

			if (max_ending_here < 0)
			{
				max_ending_here = 0;
				s = i + 1;
			}
		}
		System.out.println("Maximum contiguous sum is "
						+ max_so_far);
	
		System.out.println("Continous Sequence with Large Sum is:" );
		for (int i=start; i< end+1; i++){
		    System.out.println (input[i]);
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		// allocate new array to store our integers
         	int n;
         	int[] InputArray = new int[10]; // create a memory of ana array of length 10
         
         	Scanner input = new Scanner(System.in); // initialize scanner class
         	System.out.println("Enter the number of elements in the array you want to create");
         	n = input.nextInt(); // reading the number of elements, that we what to enter 
         	System.out.println ("Enter the elements of the array:....");
		
         for (int i=0; i<n ; i++){
             InputArray[i] = input.nextInt(); // read array elements from the user
         }
		
         System.out.println ("Array elements are:");
		
         for (int i=0; i<n ; i++){
             System.out.println (InputArray[i]);
         };

		
		maxSubArraySum(InputArray);
	}
}


