
//          MULTILEVEL INHERITANCE
/*
        OVERRIDING METHODS -- when base class and child class have identical methods having same signature
            then the method of base class gets overridden by the method of child  when called.
* */
class A {
    int a;

    A(int x) {
        a=x;
    }

    void get_a() {
        System.out.println("a = "+a);
    }
}


class B extends A {
    int b;

    B(int x,int y) {
        super(x);
        b=y;
    }

    void get_b() {
        System.out.println("b = "+b);
    }

    void display() {                    //      method overriding
        System.out.println("class B is called");
    }
}


class C extends B {
    int c;

    C(int x,int y,int z) {
        super(x,y);
        c=z;
    }

    void get_c() {
        System.out.println("c = "+c);
    }
    void display() {
        System.out.println("class C is called");
    }
}




public class JAVA_13_Multilevel_Inheritance {
    public static void main(String[] args) {
        C obj=new C(100,20,30);
        obj.get_a();
        obj.get_b();
        obj.get_c();
        obj.display();
    }
}
