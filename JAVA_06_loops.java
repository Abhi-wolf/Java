import java.util.Scanner;
public class JAVA_06_loops {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);


        //           IF ELSE
        int a=10;
        if(a%2==0)
            System.out.println(a + " is even");
        else
            System.out.println(a+" is odd");



        //          MULTIPLE IF ELSE
        int salary=25000;
        if(salary < 10000)
            salary+=1000;
        else if(salary >10000 && salary<20000)
            salary+=2000;
        else
            salary+=3000;

        System.out.println("Salary = "+salary);




        //              WHILE LOOP
        int b=1;
        while(b!=11)
        {
            System.out.print(18*b + "  ");
            b++;
        }



        //              FOR LOOP
        System.out.print("\n");
        for(int i=1;i<=10;i++)
        {
            System.out.print(19*i + "  ");
        }

        for(int j=5;j>0;j--)
        {
            System.out.print("Hello world       ");
        }

        System.out.print("\nEnter a number = ");
        int n=in.nextInt();
        for(int i=n;i>0;i--){
            System.out.print(i+"  ");
        }



        //          DO WHILE            (executes at least once even if conditions are false)
        int c=10;
        do{
            System.out.print("\nc = "+c);
            c--;
        }while(c>0);


        System.out.print("\nEnter temperature in degree = ");
        float deg=in.nextFloat();
        float fah =  (deg * 9/5) + 32;
        System.out.println("temperature in fahrenheit = "+fah);

        System.out.print("Enter three numbers = ");
         a = in.nextInt();
         b = in.nextInt();
         c = in.nextInt();

        //                   Q.      largest of three numbers
        int max=a;
        if(b>max)
            max=b;
        if(c>max)
            max=c;
        //  or
        max = Math.max(c , Math.max(a , b));
        System.out.println("Maximum of all three is "+max);





        //      Q.      UPPER CASE OR LOWER CASE CHARACTER
        System.out.print("\nEnter a character = ");
        char ch = in.next().trim().charAt(0);           //  trim is used to remove the whitespaces before ch and after ch
                                                        //  charAt(0) is used to take 0th index value of char
        if(ch >= 'a' && ch <= 'z')
            System.out.println("Lower case");
        else
            System.out.println("Upper case");






        //      Q.      FIBONACCI NUMBERS
        n=10;
        int d = 0, e = 1;
        System.out.print("\n FIBONACCI NUMBERS :  0   1   ");
        for(int i=2;i<=n;i++) {
            int temp=d+e;
            System.out.print(temp + "   ");
            d=e;
            e=temp;
        }

        //                  Nth  FIBONACCI NUMBER
        System.out.print("\n Enter the value of n = ");
        n=in.nextInt();
        int count=2;
        d=0;     e=1;
        while(count<=n)
        {
            int temp= d+e;
            d=e;
            e=temp;
            count++;
        }
        System.out.println(n + "th fibonacci number is "+ e);




        //  Q.          COUNT THE NUMBER OF TIMES A PARTICULAR DIGIT IS PRESENT IN A NUMBER

        n=123333234;
        count=0;

        while(n > 0)
        {
            int rem = n%10;
            if(rem == 3)
                count++;
            n = n/10;
        }
        System.out.println("\n Number of times 3 present is " + count);



        //  Q.          REVERSE A NUMBER
        n=123456;
        count=0;
        while(n>0)
        {
            count = count*10 + n%10;
            n = n/10;
        }
        System.out.println("reverse of the number is "+count);
    }
}
