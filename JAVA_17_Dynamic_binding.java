
/*                             Dynamic Method Dispatch or Runtime Polymorphism in Java
    #  Method overriding is one of the ways in which Java supports Runtime Polymorphism. Dynamic method dispatch is the
            mechanism by which a call to an overridden method is resolved at run time, rather than compile time.
    #  When an overridden method is called through a superclass reference, Java determines which version(superclass/
            subclasses) of that method is to be executed based upon the type of the object being referred to at the
            time the call occurs. Thus, this determination is made at run time.
    #  At run-time, it depends on the type of the object being referred to (not the type of the reference variable)
            that determines which version of an overridden method will be executed

                                    Advantages of Dynamic Method Dispatch
    #   Dynamic method dispatch allow Java to support overriding of methods which is central for run-time polymorphism.
    #   It allows a class to specify methods that will be common to all of its derivatives, while allowing subclasses
            to define the specific implementation of some or all of those methods.
    #   It also allows subclasses to add its specific methods subclasses to define the specific implementation of some.


                                    Static vs Dynamic binding
    #   Static binding is done during compile-time while dynamic binding is done during run-time.
    #   private, final and static methods and variables uses static binding and bonded by compiler while overridden
                methods are bonded during runtime based upon type of runtime object.
*/
class Class_1 {
    void fun() {
        System.out.println("Inside class 1's fun method");
    }
}

class Class_2 extends Class_1 {
    void fun() {
        System.out.println("Inside class 2's fun method");
    }
}

class Class_3 extends Class_1 {
    void fun() {
        System.out.println("Inside class 3's fun method");
    }
}




public class JAVA_17_Dynamic_binding {
    public static void main(String[] args) {
        //  created objects of all three classes
        Class_1 obj1 = new Class_1();
        Class_2 obj2 = new Class_2();
        Class_3 obj3 = new Class_3();

        //  declared reference of type Class_1
        Class_1 ref;

        ref = obj1;
        ref.fun();

        ref = obj2;
        ref.fun();

        ref = obj3;
        ref.fun();
    }
}
