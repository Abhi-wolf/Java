public class JAVA_02_variables {
    public String geek;
    public int i;
    public Integer I;
    //  initializing instance variable using constructor
    public JAVA_02_variables() {
        this.geek="Instance variable";
    }

    //  declaration of static variable
    public static String var="hello";



    public static void main(String[] args) {
        /*
            there are three types of variables in java
        (1) Local variables
                A variable defined within a block or method or constructor is called a local variable.
                These variables are created when the block is entered, or the function is called and destroyed after
                        exiting from the block or when the call returns from the function.
                The scope of these variables exists only within the block in which the variables are declared, i.e.,
                            we can access these variables only within that block.
                Initialization of the local variable is mandatory before using it in the defined scope.
         */

        // declared a local variable
        int num1=1000;
        // this variable is local to this main method
        System.out.println("local variable : "+num1);




        /*
        (2) Instance variable
                Instance variables are non-static variables and are declared in a class outside any method, constructor,
                            or block.
                As instance variables are declared in a class, these variables are created when an object of the class
                        is created and destroyed when the object is destroyed.
                Unlike local variables, we may use access specifiers for instance variables. If we do not specify any
                        access specifier,then the default access specifier will be used.
                Initialization of an instance variable is not mandatory. Its default value is dependent on the data
                        type of variable.
                For String, it is null, for float it is 0.0f, for int it is 0, for Wrapper classes like Integer it is null, etc.
                Instance variables can be accessed only by creating objects.
                We initialize instance variables using constructors while creating an object. We can also use instance
                        blocks to initialize the instance variables.
         */

        JAVA_02_variables obj=new JAVA_02_variables();
        System.out.println("geek name is "+obj.geek);
        System.out.println("default value of i is "+obj.i);
        System.out.println("default value of I is "+obj.I);






        /*
        (3) Static variables
                Static variables are also known as class variables.
                These variables are declared similarly to instance variables. The difference is that static variables
                      are declared using the static keyword within a class outside of any method, constructor, or block.
                Unlike instance variables, we can only have one copy of a static variable per class, irrespective of
                        how many objects we create.
                Static variables are created at the start of program execution and destroyed automatically when execution ends.
                Initialization of a static variable is not mandatory. Its default value is dependent on the data type
                        of variable. For String it is null, for float it is 0.0f, for int it is 0, for Wrapper classes
                        like Integer it is null, etc.
                If we access a static variable like an instance variable (through an object), the compiler will show
                        a warning message, which won’t halt the program. The compiler will replace the object name
                        with the class name automatically.
                If we access a static variable without the class name, the compiler will automatically append the
                        class name. But for accessing the static variable of a different class, we must mention the
                         class name as 2 different classes might have a static variable with the same name.
                Static variables cannot be declared locally inside an instance method.
                Static blocks can be used to initialize static variables.
         */

        System.out.println("static variable can be accessed without objects.    var = "+JAVA_02_variables.var);




        /*
                        DIFFERENCE BETWEEN STATIC AND INSTANCE VARIABLE
            Each object will have its own copy of an instance variable, whereas we can only have one copy of a static
                            variable per class, irrespective of how many objects we create. Thus, static variables are
                             good for memory management.
            Changes made in an instance variable using one object will not be reflected in other objects as each object
                            has its own copy of the instance variable. In the case of a static variable, changes will
                            be reflected in other objects as static variables are common to all objects of a class.
            We can access instance variables through object references, and static variables can be accessed directly
                            using the class name.
            Instance variables are created when an object is created with the use of the keyword ‘new’ and destroyed
                            when the object is destroyed. Static variables are created when the program starts and
                            destroyed when the program stops.
         */
    }
}
