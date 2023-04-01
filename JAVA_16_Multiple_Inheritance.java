
class Stu {
    int roll;
    void get_roll(int x) {
        roll=x;
    }

    void put_roll() {
        System.out.println(" Roll No = " + roll);
    }
}

class Tests extends Stu {
    float part1,part2;
    void get_marks(float x,float y) {
        part1=x;
        part2=y;
    }

    void put_marks() {
        System.out.println(" Marks obtained ");
        System.out.println(" Part 1 = " + part1);
        System.out.println(" Part 2 = " + part2);
    }
}


interface Sports {
    float sportwt = 6.0f;
    void put_wt();
}

class Results extends Tests implements Sports {
    float total;
    public void put_wt() {
        System.out.println(" System weight = " + sportwt);
    }

    void display() {
        total = part1 + part2 + sportwt;
        put_roll();
        put_marks();
        put_wt();
        System.out.println(" Total score = " + total);
    }
}
public class JAVA_16_Multiple_Inheritance {
    public static void main(String[] args) {
        Results obj1 = new Results();
        obj1.get_roll(1234);
        obj1.get_marks(27.5f,33.0f);
        obj1.display();
    }
}
