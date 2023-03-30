/*
                                    INHERITANCE
    #   inheritance allows subclasses to inherit all the variables and methods of their parent clases.
    #   types of inheritance
            single inheritance
            multiple  "       (jave does not directly implement multiple inheritance,it is implemented using interfaces.
            hierarchical "      (one super class,many subclasses)
            multilevel  "

                              SUBCLASS CONSTRUCTOR
    #   used to construct the instance variable of both the subclass and the superclass
    #   uses keyword super to invoke the constructor method of the superclass
    #   super may only be used within a subclass constructor method
    #   the call to superclass constructor must appear as the first statement within the subclass constructor
    #   the parameter int the super call must match the order ans typeof the instance variable declared in the
                superclass
 */


//      BASE CLASS OR SUPER CLASS OR PARENT CLASS
class Room {
    int length;
    int breadth;
    Room(int x,int y) {
        length=x;
        breadth=y;
    }
    int area() {
        return (length*breadth);
    }
}

//      SUBCLASS OR DERIVED CLASS OR CHILD CLASS
class Bedroom extends Room {
    int height;
    Bedroom(int x,int y,int z) {
        super(x,y);                 //  super class constructor called
        height=z;
    }

    int volume() {
        return (length*breadth*height);
    }
}
public class JAVA_12_Single_Inheritance {
    public static void main(String[] args) {
        Bedroom obj1=new Bedroom(14,12,10);
        int area= obj1.area();
        int vol=obj1.volume();
        System.out.println("Area = "+area);
        System.out.println("Volume = "+vol);
    }
}
