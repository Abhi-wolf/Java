import java.util.Scanner;
import java.util.Arrays;

public class JAVA_09_arrayMul {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int r1,c1,r2,c2,x;
        System.out.print("Enter the rows and columns of first matrix = ");
        r1=in.nextInt();
        c1=in.nextInt();

        System.out.print("Enter the rows and columns of second matrix = ");
        r2=in.nextInt();
        c2=in.nextInt();

        if(c1==r2) {
            int [][] arr1 = new int[r1][c1];
            int [][] arr2 = new int[r2][c2];

            System.out.println("\nenter the values in first matrix");
            for(int i=0;i<r1;i++) {
                for(int j=0;j<c1;j++) {
                    System.out.print("arr1["+i+"]["+j+"] = ");
                    arr1[i][j] = in.nextInt();
                }
            }


            System.out.println("\nenter the values in second matrix");
            for(int i=0;i<r2;i++) {
                for(int j=0;j<c2;j++) {
                    System.out.print("arr2["+i+"]["+j+"] = ");
                    arr2[i][j] = in.nextInt();
                }
            }

            int [][] arr3 =new int[r1][c2];


            for(int i=0;i<r1;i++) {
                for(int j=0;j<c2;j++) {
                    x=0;
                    for(int k=0;k<r2;k++) {
                        x += arr1[i][k] * arr2[k][j];
                    }
                    arr3[i][j]=x;
                }
            }


            System.out.println("\nfirst matrix");
            for(int i=0;i<r1;i++) {
                for(int j=0;j<c1;j++) {
                    System.out.print(arr1[i][j] + "  ");
                }
                System.out.print("\n");
            }


            System.out.println("\nsecond matrix");
            for(int i=0;i<r2;i++) {
                for(int j=0;j<c2;j++) {
                    System.out.print(arr2[i][j] + "  ");
                }
                System.out.print("\n");
            }

            System.out.println("\nthird matrix");
            for(int i=0;i<r1;i++) {
                for(int j=0;j<c2;j++) {
                    System.out.print(arr3[i][j] + "  ");
                }
                System.out.print("\n");
            }







        }

        else {
            System.out.println("Matrix multiplication not possible");
        }




         /*      COMPARE TWO ARRAYS
                A simple way is to run a loop and compare elements one by one. Java provides a direct method
                Arrays.equals() to compare two arrays.
         */
        int [] A1 = {1,2,3,4};
        int [] A2 = {1,2,3,4};

        if(Arrays.equals(A1,A2))
            System.out.println("Same");
        else
            System.out.println("Not same");




        /*      ARRAYS TO STRINGS    */

        boolean[] boolArr
                = new boolean[] { true, true, false, true };
        char[] charArr
                = new char[] { 'g', 'e', 'e', 'k', 's' };
        double[] dblArr
                = new double[] { 1, 2, 3, 4 };
        int[] intArr
                = new int[] { 1, 2, 3, 4 };
        Object[] objArr
                = new Object[] { 1, 2, 3, 4 };

        System.out.println("Boolean Array: " + Arrays.toString(boolArr));
        System.out.println("Character Array: " + Arrays.toString(charArr));
        System.out.println("Double Array: " + Arrays.toString(dblArr));
        System.out.println("Integer Array: " + Arrays.toString(intArr));
        System.out.println("Object Array: " + Arrays.toString(objArr));

    }




}
