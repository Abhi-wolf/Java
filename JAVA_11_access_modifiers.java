
class Test {
    static int i=0;
    private int roll;
    protected String name;
    public int marks;


    Test() {
        i++;
    }

    /*  methods can also be defined as public private,protected and default */
    void setData(int r,String na,int m) {
        this.roll=r;
        this.name=na;
        this.marks=m;
    }

    void getData() {
        System.out.println(roll+" "+name+" "+marks);
    }

    // int static member function we can only use static data members
    static int get() {
        return i;
    }


    int m1() {
        System.out.println("inside the method m1 by object of test class");
        this.m2();
        return -1;
    }

    void m2() {
        System.out.println("in method m2 came from method m1");
    }
}



public class JAVA_11_access_modifiers {
    public static void main(String[] args) {

        /*          ACCESS MODIFIERS
            1) private (accessible within the class where defined)
                The methods or data members declared as private are accessible only within the class in which
                they are declared. Any other class of the same package will not be able to access these members.

            2) default or package-private (when no access modifier is specified)

            3) protected (accessible only to classes that subclass your class directly within the current or different package)
                accessible within the same package or subclasses in different packages.

            4) public (accessible from any class)
                The public access modifier has the widest scope among all other access modifiers.
                Classes, methods, or data members that are declared as public are accessible from everywhere in the program.
                There is no restriction on the scope of public data members.

            But, the classes and interfaces themselves can have only two access modifiers when declared outside
            any other class.
                1) public
                2) default (when no access modifier is specified)

           * to import a package use import package_name.*;
        */

        student obj1=new student(20,"hello world",78.98f);
        System.out.println(obj1.name + " " + obj1.roll + " " + obj1.marks);

        Test obj2 = new Test();
        obj2.setData(01,"rock",45);
        obj2.getData();

        Test obj4=new Test();
        Test obj5=new Test();
        
        Test obj3=new Test();
        int i = obj3.m1();
        System.out.println("control returned after method m1 = "+i);

        //  static functions are accessed using class name
        int no_of_obj=Test.get();

        System.out.println("no of instances created till now : " + no_of_obj);
    }
}
