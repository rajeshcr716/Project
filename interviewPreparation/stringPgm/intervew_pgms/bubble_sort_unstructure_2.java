package intervew_pgms;

public class bubble_sort_unstructure_2 {
/*     //test
      static void printline(int[] a) {
          for(int value: a){
              System.out.println(" "+ value);
          }
      }*/
    public static void main(String[] args) {
        int a[] = {10, 30, 20, 56, 45, 12, 0};

        int n = a.length;

        int i, j;

        for (i = 0; i < n; i++) {
            //System.out.print( i  );

            for (j = 0; j < n - 1 - i; j++) {

                //System.out.println("a[j]: "+a[j] +" > a[j+1]: "+a[j+1]);
                if (a[j] > a[j + 1]) {
                    //System.out.println("true" );
                    //System.out.println("a[j]: "+a[j] +"  a[j+1]: "+a[j+1]+'\n');

                    int temp = a[j];
                    a[j] = a[j + 1];

                    a[j + 1] = temp;

                } else {
                    //System.out.println("false"+'\n');
                }
            }
        }

        System.out.println("After soring:");
        //printline(a);  // test
        for(int  value: a){
            System.out.print( " "+value);

        }
    }
}

// In this program I merged all section into a single class and for-each loop I used to print array of integer.
// here Data type is given as "int" inside for loop becuase it will fecting one by one value from array 'a' so need to mentioned it as 'int'.

// {10,20,30,0} -- here we need to perform swapping (n-1) means 4-1 = 3.  last index value 0 will take 3 iteration to come first place.
// each iteration it moves back one step. this is the simple example to understand.
// for(  j=0; j<n-1-i; j++)  -> (n-1-i) each time iteration we need to reduce the condition otherwise after sorting it will iterate
// infinate amount of time.