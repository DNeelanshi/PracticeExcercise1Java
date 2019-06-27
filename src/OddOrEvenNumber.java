import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String [] args){

        int num ;
        System.out.println("Enter the number to check whether it is odd or even:");

        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        check_odd_even(num);

    }

    public static void check_odd_even(int num){

        if(num > 0){
            if(num%2 == 0){
                if((num>20) && (num<30)){
                    System.out.println("Jerry");
                }else{
                    System.out.println("Number is even but doesn't lie between 20-30");
                }
            }else{
                if((num>20) && (num<30)){
                    System.out.println("Tom");
                }else{
                    System.out.println("Number is odd but doesn't lie between 20-30");
                }
            }
        }else{
            System.out.println("Please enter number greater than zero");
        }

    }
}
