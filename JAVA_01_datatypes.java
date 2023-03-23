public class JAVA_01_datatypes  {
    public static void main(String[] args) {

        /*
        Primitive Data Type:    such as boolean, char, int, short, byte, long, float, and double
        Non-Primitive Data Type or Object Data type:    such as String, Array, etc.

        TYPE	    DESCRIPTION	            DEFAULT	    SIZE	    EXAMPLE LITERALS	    RANGE OF VALUES

        boolean	    true or false	        false	    1 bit	    true, false	            true, false
        byte	    twos complement integer	    0	    8 bits	    (none)	                -128 to 127
        char	    unicode character	    \u0000	    16 bits	    'a','\u0041','1101',    character representation of ASCII values 0 to 255
                                                                   'II', 'I','In',' B'

        short	    twos complement integer	    0	    16 bits	    (none)	                -32,768 to 32,767
        int	        twos complement integer	    0	    32 bits	    -2, -1, 0, 1, 2	        -2,147,483,648 to 2,147,483,647
        long	    twos complement integer	    0	    64 bits	    -2L, -1L, 0L, 1L, 2L	-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        float	    IEEE 754 floating point	    0.0	    32 bits	    1.23e100f, -1.23e-100f,
                                                                        .3f, 3.14F	            upto 7 decimal digits

        double	    IEEE 754 floating point	    0.0	    64 bits	    1.23456e300d,
                                                                 -1.23456e-300d,1e1d	        upto 16 decimal digit
         */
        boolean mybool=true;
        byte mybyte=23;
        char mychar='e';
        int myint=12;
        short myshort=847;
        long mylong=2673582;
        float myfloat=234.56f;
        double mydouble=2356.86356;

        System.out.println("boolean = "+mybool);
        System.out.println("byte = "+mybyte);
        System.out.println("char = "+mychar);
        System.out.println("int = "+myint);
        System.out.println("short = "+myshort);
        System.out.println("long = "+mylong);
        System.out.println("float = "+myfloat);
        System.out.println("double = "+mydouble);
    }
}

