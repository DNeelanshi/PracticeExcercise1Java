import java.util.Scanner;

public class CheckPallindrome {

    public static void main(String[] args){

    int number;
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check pallindrome:");
    number =input.nextInt();

    checkpallindrome(number); // Calling method to check pallindrome

          }

        public static void checkpallindrome ( int number){

            int rem, sum = 0, temp;

            temp = number;

            while (number > 0) {

                rem = number % 10;
                sum = (sum * 10) + rem;
                number = number / 10;
            }

            //checking if number is pallindrome or not

            if (temp == sum) {
                int sumOdd = 0, sumEven = 0, c = 1;

                while (sum != 0) {

                    if (c % 2 == 0)
                        sumEven += sum % 10;
                    else
                        sumOdd += sum % 10;
                    sum /= 10;
                    c++;
                }

                //checking if sum of even position digits is greater than 25 or not

                if (sumEven > 25) {
                    System.out.println(temp + " is pallindrome and the sum of even numbers is greater than 25");
                } else {
                    System.out.println(temp + " is pallindrome and sum of even numbers is less than 25");
                }

            } else {
                System.out.println(temp + " is not pallindrome");
            }
        }

}
