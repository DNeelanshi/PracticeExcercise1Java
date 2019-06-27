import java.util.Scanner;


public class NumberLoopRepeat {

    public static void main (String [] args){

        int number ;

        System.out.println("Enter any number");

        Scanner input = new Scanner(System.in);
        number= input.nextInt();
        getpattern(number);  //calling method for number pattern
    }

    public static void  getpattern(int number){

        for (int i = 1; i <= number; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
        }

    }
}
