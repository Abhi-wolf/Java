import java.util.Scanner;
import java.util.Arrays;
public class JAVA_07_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        /*
            #   In Java, all arrays are dynamically allocated.
            #   Since arrays are objects in Java, we can find their length using the object property length.
                        This is different from C/C++, where we find length using sizeof.
            #   The size of an array must be specified by int or short value and not long.
            #   The size of the array cannot be altered(once initialized).
            #   int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

         */


        int[] arr = new int[10];
        for(int i=0;i<10;i++) {
            arr[i] = i+1;
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + "  ");
        }

        int[] arr2 = {1000,2000,3000,4000};
        for (int j : arr2) {                            //  enhanced for loop
            System.out.print(j + "  ");
        }

        String[] str = new String[3];
        for(int i=0;i<str.length;i++) {
            System.out.print(str[i] + "  ");
        }

        fun(arr2);
        System.out.println(Arrays.toString(arr2));







        //          MULTIDIMENSIONAL ARRAY (2-D ARRAY)
        //   #   it is mandatory to initialize the 2-d array with no of rows but not
        //          necessary to initialize no of columns

        int[][] arr3 = {
                {1,2,3},
                {4,5},
                {6,7,8,9} };

        System.out.println("\n Two dimensional arrays");
        for(int i=0;i<arr3.length;i++) {
            for(int j=0;j<arr3[i].length;j++) {
                System.out.print(arr3[i][j] + "  ");
            }
            System.out.print("\n");
        }







        int[][] arr4 = new int[3][4];
        //  input
        for(int i=0;i<arr4.length;i++) {
            for(int j=0;j<arr4[i].length;j++) {
                arr4[i][j] = i + j;
            }
        }
        //  output
        for(int i=0;i<arr4.length;i++) {
            for(int j=0;j<arr4[i].length;j++) {
                System.out.print(arr4[i][j] + "  ");
            }
            System.out.print("\n");
        }
        //  output (another method)
        for(int j=0;j<arr4.length;j++) {
            System.out.print(Arrays.toString(arr4[j])+"\n");
        }
        //  enhanced for loop
        for (int[] value : arr4) {
            System.out.print(Arrays.toString(value) + "\n");
        }






        int[][] arr5 = new int[2][2];
        System.out.println("\n");
        //      input
        for(int i=0;i<arr5.length;i++) {
            for(int j=0;j<arr5[i].length;j++) {
                System.out.print("Enter arr["+ i + "]["+j+"] = ");
                arr5[i][j]= in.nextInt();
            }
        }
        //      output
        for(int i=0;i<arr5.length;i++) {
            for(int j=0;j<arr5[i].length;j++) {
                System.out.print(arr5[i][j] + "  ");
            }
            System.out.print("\n");
        }
        //      output (another method)
        for(int j=0;j<arr5.length;j++) {
            System.out.print(Arrays.toString(arr5[j])+"\n");
        }
        //  enhanced for loop
        for (int[] ints : arr5) {
            System.out.print(Arrays.toString(ints) + "\n");
        }



        int[] arr1 = {1,3,23,8,678};
        System.out.println(Arrays.toString(arr1));

        /*      swapping of elements in indexes    -->  In JAVA array is passed to function by value,
                so swapping done on the function is not reflected in the main fun   */
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr1));

        //  to find maximum item in the array
        System.out.println("maximum item : "+max(arr1));

        //  to find maximum item in the given range
        System.out.println("maximum item in range : "+max(arr1,1,3));


        //  reverse array  -->  In JAVA array is passed to function by value,
        //                so reversing done on the function is not reflected in the main fun
        reverse_array(arr1);
        System.out.println("Array after reversing  " + Arrays.toString(arr1));
    }




    //          FUNCTIONS

    static void swap(int[] a,int index1,int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }


    static int max(int[] a) {
        int max = a[0];
        for(int i=1;i<a.length;i++) {
            if(max < a[i])
                max = a[i];
        }
        return max;
    }

    //          to find maximum item in the given range
    static int max(int[] a,int start,int end) {
        int max = a[start];
        for(int i=start+1;i<end;i++) {
            if(max < a[i])
                max = a[i];
        }
        return max;
    }



    static void reverse_array(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            swap(arr,start,end);
            start += 1;
            end -= 1;
        }

    }


    static void fun(int[] arr) {
        arr[1] = 99999;
    }
}
