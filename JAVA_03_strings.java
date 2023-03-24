import java.sql.SQLOutput;
import java.util.Scanner;
public class JAVA_03_strings {
    public static void main(String[] args) {
        /*
                                 STRINGS IN JAVA ARE IMMUTABLE.
            # strings are treated as objects.
            # the term "immutable string" in java refers to string object that cannot be altered,
                but the reference to the object can be changed
            # every time we make a modification, a new instance of that string is created and the
                prevoius value is copied to the new string with the change
         */

        


        //  string can be declared by two methods
        /*  (1)  using string literals
             # The Strings in Java are stored in a special place in heap called "String Constant Pool" or "String Pool".
             # It is a pool or storage area in Java heap memory that is dedicated for storing string literals in Java.
             # Whenever we create a string, JVM (Java Virtual Machine) looks into the "string constant pool" to see if
                        the same value is already present there or not.
             # If it is present, then the address (or reference) of existing string object is stored in the reference
                        variable and if it is not present there, a new String object is created and stored inside the
                        string pool. Then the reference of this newly-created string object is returned.
              # String str1 = "Scaler";
                    // New String is not created.
                    // str2 is pointing to the old string value only.
                String str2 = "Scaler";
         */
        String str = "Hello World";
        System.out.println(str);
        str = "asdutnb";
        System.out.println(str);
        str = "My name is Tony Strak.";
        System.out.println(str);




        /* (2)      using new keyword
            # whenever the string is created with the new keyword a new object of String is created in the heap
                    memory outside the string constant pool.
            # All string objects created using the new keyword are allocated space in the heap memory (outside the
                    string constant pool) irrespective of whether the same valued strings are already present in the
                     heap memory or not.
        */
        str = new String("C++ is the king.");
        System.out.println(str);

        String firstname, secondname;
        firstname = "tony";
        secondname = "stark";

        //               METHODS OF JAVA STRINGS
        //  concatenate strings   --> using + or str1=str1.concat(str2) or str3=str1.concat(str2)
        String fullname = firstname + " " + secondname;
        fullname = firstname.concat(secondname);
        System.out.println(fullname);



        //  length()    --> StringName.length()      -- gives length of String
        System.out.println("length of string = " + fullname.length());


        Scanner input = new Scanner(System.in);
        //firstname=input.next();             //  to take single word input without space
        System.out.println(firstname);


        //secondname=input.nextLine();        //  to take string input with spaces
        System.out.println(secondname);


        //  charAt()     --> StringName.charAt(index)   -->  gives character stored at the given location
        for (int i = 0; i < fullname.length(); i++) {
            System.out.print(fullname.charAt(i) + " ");
        }


        //  compare
        /*      (compares only first character of both the strings to return -ve or +ve value)
            if s1 > s2  returns +ve value
            if s1 = s2  returns 0
            if s1 < s2  returns -ve value
         */
        System.out.println(firstname.compareTo(secondname));
        if (firstname.compareTo(secondname) == 0) {
            System.out.println("strings are equal.");
        } else {
            System.out.println("strings are not equal.");
        }
        //  DO NOT USE == method to compare strings because in some cases it gives wrong answer
        //  here == gives correct answer
        secondname="tony";
        if (firstname == secondname) {
            System.out.println("strings are equal.");
        } else {
            System.out.println("strings are not equal.");
        }
        //  here it gives wrong answer
        if (new String("tony") == new String("tony")) {
            System.out.println("strings are equal.");
        } else {
            System.out.println("strings are not equal.");
        }



        //  substring   -->  str.substring(startIndex,endIndex) --> returns substring from startIndex to endIndex-1
        System.out.println(fullname.substring(1,5));                //  0 based indexing
        System.out.println(fullname.substring(3));      //  from 3rd index to last index


        //  equals    --> str1.equals(str2)     -->  returns true or false
        System.out.println(secondname.equals(firstname));


        /*  contains()  -->     str1.contains(str2)  or str1.contains("string")
                used to verify if the string contains the specified part of the string or not
                returns true or false    */
        str = "follow my channel in youtube";
        System.out.println(str.contains("my"));
        System.out.println(str.contains("hello"));


        /*  toUpperCase()  -->  str.toUpperCase()    -->  does not changes permanently
                used to convert the lowercase characters of the string to the uppercase */
        System.out.println(str.toUpperCase());


        /*  toLowerCase()  -->  str.toLowerCase()
                used to convert the uppercase characters of the string to the lowercase */
        System.out.println(str.toLowerCase());


        /*  trim()   -->    str.trim()
              used to trim (or remove) the extra white spaces from the specified string from both the ends.*/
        str = "         coding is       ";
        System.out.println(str + "awesome");
        str = str.trim();
        System.out.println(str + " awesome");

        /*  replace()  -->    str.replace(oldChar,newChar)
                used to replace all the specified character of the string with another character.*/
        str = "Hi, i will be replaced with a";
        str=str.replace('i','a');
        System.out.println(str);
    }
}
