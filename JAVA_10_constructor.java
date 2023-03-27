/*
                    CONSTRUCTOR
     #  Each time an object is created using a new() keyword, at least one constructor (it could be the
            default constructor) is invoked to assign initial values to the data members of the same class.
     #  Rules for writing constructors are as follows:
     #  The constructor(s) of a class must have the same name as the class name in which it resides.
     #  A constructor in Java can not be abstract, final, static, or Synchronized.
     #  Access modifiers can be used in constructor declaration to control its access i.e which other class can call the constructor.
     #  Constructor calling must be the first statement of constructor in Java.
     #  If we have defined any parameterized constructor, then compiler will not create default constructor. and vice versa if we don’t define any constructor, the compiler creates the default constructor(also known as no-arg constructor) by default during compilation
     #  Recursive constructor calling is invalid in java.

     #  There are various scenarios where we can use private constructors. The major ones are
            Internal Constructor chaining
            Singleton class design pattern
*/
class student {
    //      Default data types
    int roll;
    String name;
    float marks;

    student() {
        this.roll=0;
        this.name="";
        this.marks=0.0f;
    }
    //      parameterized constructor
    student(int r,String str,float mar) {
        this.roll=r;
        this.name=str;
        this.marks=mar;
    }


    //      copy constructor
    student(student obj) {
        this.roll=obj.roll;
        this.name=obj.name;
        this.marks=obj.marks;
    }

    void display() {
        System.out.println(roll+"  "+name+"  "+marks);
    }
}
public class JAVA_10_constructor {
    public static void main(String[] args) {
        student obj1 = new student();
        student obj2 = new student(10,"Raj",85.6f);
        student obj3 = new student(11,"Hello",69.6f);
        student obj4 = new student(12,"world",98.8f);
        student obj5 = new student(obj3);

        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
        obj5.display();
    }
}
