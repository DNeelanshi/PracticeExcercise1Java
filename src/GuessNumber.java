import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String [] args){

        int user_number,res=0;

        while(res!=1){

            System.out.println("Enter a number between 1 and 50:");

            try{
                Scanner sc = new Scanner(System.in);
                user_number = sc.nextInt();
                Random r = new Random(); //generate random number
                int low = 1;
                int high = 50;
                int randomnumber = r.nextInt(high-low) + low;
                System.out.println(randomnumber);

                res = matchnumbers(user_number,randomnumber); //method to compare numbers

                // switch case to display results
                switch (res){
                    case 0: System.out.println("Number guessed is less than original number");
                        break;
                    case 1:  System.out.println("Number guessed matches the original number");
                        break;
                    case 2 : System.out.println("Number guessed is greater than original number");
                        break;
                }

            }catch (InputMismatchException e){
                System.out.println(e+" Please enter valid number");
            }

        }

    }

    public static int matchnumbers(int user_num, int random_num){

        int flag = 0;

        if(user_num == random_num){
            flag = 1;                  // user number matches the random number
        }else if(user_num < random_num){
            flag = 0;                 // user number is smaller than random number
        }else{
            flag = 2;                 // user number is greater than random nunmber
        }

        return flag;
    }
}
