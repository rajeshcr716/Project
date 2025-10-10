package intervew_pgms;

public class bubble_sort_1 {
	private static void sort(int[] a, int n) {

		int i,j;

		for(i=0; i<n; i++)
		{
			//System.out.print( i  );

			for(  j=0; j<n-1-i; j++)
			{

				//System.out.println("a[j]: "+a[j] +" > a[j+1]: "+a[j+1]);
				if(a[j]>a[j+1])
				{
					//System.out.println("true" );
					//System.out.println("a[j]: "+a[j] +"  a[j+1]: "+a[j+1]+'\n');

					int temp = a[j];
					a[j]=a[j+1];

					a[j+1]= temp;

				}
				else
				{
					//System.out.println("false"+'\n');
				}
			}
		}

	}


	private static void printline(int[] a, int n) {



		for(int i=0; i<n; i++)
		{
			//System.out.println("index: "+i);

			System.out.print(a[i]+" ");
		}

	}

public static void main(String[] args) {

	int a[] = {10,30,20,56,45,12,0};
	
	int n = a.length;
	
	 sort(a,n);
	
	printline(a,n);
	 
}
}
// {10,20,30,0} -- here we need to perform swapping (n-1) means 4-1 = 3.  last index value 0 will take 3 iteration to come first place.
// each iteration it moves back one step. this is the simple example to understand.
/* Initial: [10, 30, 20, 56, 45, 12, 0]
		 10 30 ✅ no swap
		 30 20 ❌ swap → [10, 20, 30, 56, 45, 12, 0]
		  int temp = a[j];
		  a[j]=a[j+1];  // [10, 20, 20, 56, 45, 12, 0]
		  a[j+1]= temp  // [10, 20, 30, 56, 45, 12, 0]

 */

/*
		 30 56 ✅ no swap
		 56 45 ❌ swap → [10, 20, 30, 45, 56, 12, 0]
		 56 12 ❌ swap → [10, 20, 30, 45, 12, 56, 0]
		 56 0  ❌ swap → [10, 20, 30, 45, 12, 0, 56]



✅ In short:
		Your code performs Bubble Sort — repeatedly swapping adjacent numbers until the entire array is sorted.

/*
🔹 1. What is Bubble Sort?

		Bubble Sort is a simple sorting algorithm that:

		🔹 2. Your Code Structure

		You’ve correctly split your program into:

		sort() → logic for sorting

		printline() → to display sorted array

		main() → to call everything


		for(i=0; i<n; i++) {           // outer loop → number of passes
		for(j=0; j<n-1-i; j++) {   // inner loop → comparison in each pass
		if(a[j] > a[j+1]) {    // check if out of order
		int temp = a[j];   // swap elements
		a[j] = a[j+1];
		a[j+1] = temp;
		}
		}
		}*/

