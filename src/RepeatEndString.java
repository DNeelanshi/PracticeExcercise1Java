import java.util.Scanner;

public class RepeatEndString {

    public static void main(String [] args){

        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = input1.next();

        System.out.println("Enter the number : ");
        int num = input2.nextInt();

        Repeat_Last2alphabets(str,num);

    }

    public static void Repeat_Last2alphabets(String str,int num){


        String s = " ";
        int count = 0;
        System.out.print(str);
        for (int i = 0; i < num; i++)
        {
            for(int j=str.length()-num;j<str.length();j++)
                System.out.print(str.charAt(j));
        }

    }
}
