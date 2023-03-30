
/*                                     INTERFACE
    # An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class.
    # An interface in Java is a blueprint of a behaviour. A Java interface contains static constants and abstract methods.
    # Interfaces specify what a class must do and not how. It is the blueprint of the behaviour.
    # Interface do not have constructor.
    # A class can implement more than one interface.
    # An interface can extend to another interface or interface (more than one interface).
    # A class that implements the interface must implement all the methods in the interface.
    # All the methods are public and abstract. And all the fields are public, static, and final.
    # It is used to achieve multiple inheritances.
    # It is used to achieve loose coupling.
    # Inside the Interface not possible to declare instance variables because by default variables are public static final.
    # Inside the Interface constructors are not allowed.

    # one interface can inherit other interfaces but one interface cannot implement other interfaces.
    # a class can implement interfaces but cannot extend them.

                          DIFFERENCES B/W CLASS AND INTERFACE
                 class	                                         Interface
1.	In class, you can instantiate                      In an interface, you can’t instantiate
    variables and create an object.	                        variables and create an object.
2.	Class can contain concrete(with                     The interface cannot contain concrete
    implementation) methods	                                (with implementation) methods
3.	The access specifiers used with
classes are private, protected, and public.	            In Interface only one specifier is used- Public.
*/

interface Vehicle {
    void changegear(int a);
    void speedup(int b);
    void applybreaks(int c);
}


class Bicycle implements Vehicle {
    int speed;
    int gear;

    public void changegear(int newgear) {
        gear=newgear;
    }

    public void speedup(int i) {
        speed=speed+i;
    }

    public void applybreaks(int d) {
        speed=speed-d;
    }

    public void display() {
        System.out.println("speed = "+speed+"  gear = "+gear);
    }
}




class Bike implements Vehicle {
    int speed;
    int gear;

    public void changegear(int newgear) {
        gear=newgear;
    }

    public void speedup(int i) {
        speed=speed+i;
    }

    public void applybreaks(int d) {
        speed=speed-d;
    }

    public void display() {
        System.out.println("speed = "+speed+"  gear = "+gear);
    }
}




public class JAVA_15_Interface {
    public static void main(String[] args) {
        Bicycle obj1=new Bicycle();
        obj1.changegear(2);
        obj1.speedup(3);
        obj1.applybreaks(1);
        obj1.speedup(3);

        System.out.println("Bicycles present state");
        obj1.display();



        Bicycle obj2=new Bicycle();
        obj2.changegear(1);
        obj2.speedup(4);
        obj2.applybreaks(3);

        System.out.println("Bikes present state");
        obj2.display();
    }
}
