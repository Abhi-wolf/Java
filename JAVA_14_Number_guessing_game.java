
import java.util.Random;
import java.util.Scanner;

class Game {
    int num;
    Game() {
        Random rand=new Random();
        num=rand.nextInt(100);
    }

    void guess() {
        int limit=10,x;
        Scanner in=new Scanner(System.in);
        while(limit>0) {
            System.out.print("Enter number = ");
            x = in.nextInt();

            if (x == num) {
                System.out.println("guessed correct");
                return;
            }
            else if (x > num)
                System.out.println("entered larger number");
            else
                System.out.println("entered smaller number");

            limit--;
        }
        System.out.println("\nyour limit exhausted");
        System.out.println("the correct number is "+num);
    }

}


public class JAVA_14_Number_guessing_game {
    public static void main(String[] args) {
        Game obj=new Game();
        obj.guess();
    }
}
