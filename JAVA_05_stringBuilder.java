public class JAVA_05_stringBuilder {
    public static void main(String[] args) {
         /*                  STRINGBUILDERS
        #   StringBuilder in Java represents a mutable sequence of characters. Since the String Class in Java creates
                    an immutable sequence of characters, the StringBuilder class provides an alternative to String
                    Class,as it creates a mutable sequence of characters.

        #   String str = new String("Scaler");
            When we manipulate this string object in any way, instead of performing modifications in the same string
                    object pointed to by str, a new String object with the new value is created in the heap memory.
                    This not only causes memory wastage but also delays string manipulations.
            To solve these problems, we use StringBuilder class to represent a sequence of characters.
                    `Stringbuilder in Java holds mutable strings which means string manipulations are performed on
                    the same sequence instead of creating new string objects every time the string is manipulated.
        */


        //  declaration
        StringBuilder sb1 = new StringBuilder("hello world");
        System.out.println(sb1);
        StringBuilder sb2 = new StringBuilder(10);
        //          sb2 = "string builder";                 cannot be initialized in this fashion


        //          METHODS OF STRINGBUILDER
        //  (1)     append    -->  str.append(string)       -->    append the specified string to the provided string.
        sb1.append("!");
        sb2.append(1);
        System.out.println(sb1);
        System.out.println(sb2);
        sb2.append(" hello");
        System.out.println(sb2);





        /*  (2)     capacity   -->  str.capacity()
             #  used for finding the initial capacity of the StringBuilder object. The default capacity
                    of StringBuilder class is 16 bytes.
             #  The default capacity of the StringBuilder is 16 bytes. When the capacity of StringBuilder
                    gets full the new capacity of StringBuilder will be (previouscapacity+1)X2.
        */
        StringBuilder sb3 = new StringBuilder();
        System.out.println("Initial capacity = " + sb3.capacity());
        sb3.append("12345678901234567890");
        System.out.println("New capacity = " + sb3.capacity());




        /*  (3)     charAt      -->     sb.charAt(index)
            #   used for getting character value present at the index of the StringBuilder sequence.
            #   deleteCharAt() method: This method is used for deleting the particular character at the given
                    index from the StringBuilder sequence.
            #   setCharAt() method: This method is used for inserting the character at the particular index of
                    the StringBuilder sequence.
                    sb.setCharAt(index,
        */
        System.out.println(sb3.charAt(5));
        System.out.println(sb3);
        System.out.println(sb3.deleteCharAt(5));        //  returns the modified string
        sb3.setCharAt(5,'6');             //    removes 7 and 6 is put on that index
        System.out.println(sb3);




        //  (4)     reverse     -->  sb.reverse()       --> used for reversing the StringBuilder sequence.
        sb3.reverse();
        System.out.println(sb3);




        /*  (5)     length      --> sb.length()     --> used for finding the length of the StringBuilder sequence.
                      Length is the number of elements of the StringBuilder sequence.   */
        System.out.println(sb3.length());
        System.out.println(sb2.length());
        System.out.println(sb1.length());



        /*  (6)     indexof     -->  sb.indexof("chararcter")
            used for finding the first index of the given String in the sequence of the StringBuilder.
            If the String is not present in the sequence of the StringBuilder this method will return -1.   */
        System.out.println(sb1.indexOf("h"));
        System.out.println(sb1.indexOf("z"));




        /*  (7)     lastIndexof     --> sb.lastIndexof("string")
            used for finding the last index of the particular sequence in the StringBuilder sequence. If the
            sequence is not present in the StringBuilder sequence. This method returns -1, otherwise will return
            the starting index value of the sequence.   */
        sb2.append("hello");
        sb2.append("hello");
        sb2.append("hell");
        System.out.println(sb2);                                //  1 hellohellohellohell
        System.out.println(sb2.lastIndexOf("hello"));       //   12




        /*  (8)     isEmpty     --> sb.isEmpty()
            used to check whether the StringBuilder object contains any sequence or not.    */
        System.out.println(sb3.isEmpty());



        /*  (9)     substring       --> sb.substring(startIndex,endIndex)
            used for getting the substring from the StringBuilder sequence. */
        System.out.println(sb1.substring(2,4));


        /*  (10)    delete      --> sb.delete(startIndex,endIndex)
            used for deleting the particular sequence from the StringBuilder.
            returns the modified string */
        System.out.println(sb1.delete(2,4));

    }
}
