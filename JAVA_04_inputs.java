import java.util.Scanner;
public class JAVA_04_inputs {
    public static void main(String[] args) {
        /*          SCANNER CLASS
            #   It is an advanced version of BufferedReader which was added in later versions of Java. The scanner can read formatted input. It has different functions for different types of data types.
            #   The scanner is much easier to read as we don’t have to write throws as there is no exception thrown by it.
            #   It was added in later versions of Java
            #   It contains predefined functions to read an Integer, Character, and other data types as well.
            #   To use the Scanner we need to import the Scanner class from the util package as
                        import java.util.Scanner;

                   NAME                     USE
                 nextInt()              returns the next integer value
                 nextDouble()           returns the next double value
                 nextFloat()            returns the next float value
                 nextShort()            returns the next short value
                 nextLong()             returns the next long value
                 next()                 return the next one word string value
                 nextLine()             returns the next multiple string value
        */


        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer = ");
        int num = in.nextInt();
        System.out.println(num);

        System.out.print("Enter an string without spaces = ");
        String str = in.next();
        System.out.println(str);

        System.out.print("Enter an string with spaces = ");
        String str2 = in.nextLine();
        System.out.println(str2);


        System.out.print("Enter a float = ");
        float fl = in.nextFloat();
        System.out.println(fl);


        System.out.print("Enter a double = ");
        double db = in.nextDouble();
        System.out.println(db);
    }
}
