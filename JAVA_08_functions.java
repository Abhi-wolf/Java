import java.util.Scanner;
import java.util.Arrays;
public class JAVA_08_functions {
    static int x=100;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //  sum();
        sum1(10,-1);

        int res = sum2(10,-20);
        System.out.println("result = "+res);

        String greet= fun1();
        System.out.println(greet);

        greet = fun2("Abhijeet kr");
        System.out.println(greet);


        System.out.print("Enter your name = ");
        String name = in.nextLine();
        greet = fun2(name);
        System.out.println(greet);

        //  static variable
        System.out.println(" x = "+x);

        int x=10;           //  local variable
        System.out.println(" x = "+x);


        fun(2,4,5,8,1,9,10);
        fun(1,2,3);
        fun(10);

        fun2("awsd","wygfr","tuehn","plnegc");
        fun2("asdfghjkl");
        fun2("mango banana orange");


        fun3(10);
        fun3('p');
        fun3(10,30);
        fun3("asdfghjkl");


        System.out.println(isPrime(2));

        for(int i=100;i<1000;i++) {
            if(isArmstrong(i)) {
                System.out.println(i + "   ");
            }
        }
    }







    /*  VARIABLE ARGUMENTS (VARARGS) -- The variable length argument or varrags allows the method
                          to accept zero or multiple arguments of the same type.
        #   it is used where we do not know how many variables will be passed.
        #   A variable-length argument is specified by three periods or dots(…).
        #   This syntax tells the compiler that fun( ) can be called with zero or more arguments.
        #   varargs must be in the last in the arguments
                eg:-    static void fun(int a,int b, String ...c)
     */
    static void fun(int ...v) {
        System.out.println("Number of arguments = "+v.length);
        System.out.println(Arrays.toString(v));
    }

    static void fun2(String ...a) {
        System.out.println("\nNumber of arguments = "+a.length);
        for(String i :a)
            System.out.print(i + " , ");
    }



    static void sum() {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter first number = ");
        int a = input.nextInt();
        System.out.print("Enter second number = ");
        int b = input.nextInt();

        int sum = a+b;
        System.out.println("sum of " + a + " and " + b + " is " + sum);
    }




    //              FUNCTION RETURNS VOID AND ACCEPTS TWO INTEGER VALUES
    static void sum1(int a , int b) {
        int sum = a + b;
        System.out.println("sum of " + a + " and " + b + " is " + sum);
    }



    //              FUNCTION RETURNS INTEGER AND ACCEPTS TWO INTEGER VALUES
    static int sum2(int a , int b) {
        int sum = a + b;
        return sum;
    }



    //              FUNCTION RETURNS STRING AND ACCEPTS VOID
    static String fun1() {
        String mess = "hello how are you";
        return mess;
    }


    //              FUNCTION ACCEPTS STRING AND RETURNS STRING
    static String fun2(String str) {
        String mess= "hello " + str + " how are you!";
        return mess;
    }


    //      FUNCTION OVERLOADING
    static void fun3(int a) {
        System.out.println("\na = "+a);
    }

    static void fun3(int a,int b) {
        System.out.println("\na = "+a);
        System.out.println("b = "+b);
    }

    static void fun3(String str) {
        System.out.println("\na = "+str);
    }

    static void fun3(char a) {
        System.out.println("\na = "+a);
    }



    //  PRIME NUMBER
    static boolean isPrime(int n) {
        if(n<=1)
            return false;

        int c=2;
        while (c*c <= n) {
            if(n % c == 0)
                return false;
            c++;
        }

        if(c*c > n)
            return true;

        return false;
    }




    //  ARMSTRONG NUMBER -- number whose sum of cube of its digits is the number itself
    //      eg:- 153 == (1*1*1) + (5*5*5) + (3*3*3)
    static boolean isArmstrong(int n) {
        int original = n;
        int sum=0;

        while(n>0) {
            int rem = n%10;
            sum += (rem*rem*rem);
            n=n/10;
        }
        if(sum == original)
            return true;

        return false;
    }


    //      JAVA DO NOT SUPPORT PASS BY REFERENCE, IT ONLY SUPPORTS PASS BY VALUE
}
