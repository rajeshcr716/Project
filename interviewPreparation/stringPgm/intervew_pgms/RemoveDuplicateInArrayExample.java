package intervew_pgms;
import java.util.Arrays;

public class RemoveDuplicateInArrayExample{  
public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
        	System.out.println("debugg i = "+i+" arr[i] = "+arr[i]);
            if (arr[i] != arr[i+1])
            {  
                temp[j++] = arr[i];  
                
                System.out.println("temp[j++] = arr[i]  ");
                System.out.println("j = "+j+ '\n');
             // only j means every it adding value to 0 index
             //++j means first index it jump-->[0,10,20,30,40,50]
             //j++ means add value from beg index. 
             // temp[] is array we can use any loop index variable like i,j;
            
            }  
         }  
        temp[j++] = arr[n-1];
       
        //10 10 20 30 30  -->last condition failer 30,30 ..so we using above line.
        // temp[j++] = arr[5-1]-->30.
        // so 30 is added to the last index of temp[++j]
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
            System.out.println("temp j  " +temp[i]);
        }  
        
        System.out.println( " "+"\n"); 
        return j;  
    }  
       
    public static void main (String[] args) {  
        int arr[] = {10,20,30,10,30}; 
        Arrays.sort(arr); // sort the array--->otherwist not remove some duplicate.
       
        int size = arr.length;  
        for (int i=0; i<size; i++)  
        {
        	System.out.print(arr[i]+" ");  
        }
        System.out.println( " "+"\n");  
        int newarray = removeDuplicateElements(arr, size);  
        System.out.println("new array size: "+newarray);
         
        //printing array elements  
        for (int i=0; i<newarray; i++)  
           System.out.print(arr[i]+" ");  
    }  
}  