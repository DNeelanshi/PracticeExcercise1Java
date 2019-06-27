import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class VowelOrConsonant {

    public static void main(String args[]){


        System.out.print("Input the string: ");

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*"); //regex pattern to check if string has any special character or not
        Matcher matcher = pattern.matcher(str);
        var check= str.matches(".*\\d.*"); //regex pattern to check if string has any digit or not

        if(check = true){

            System.out.print("Error number: Please enter only alphabets"); //error message

        }else if(!matcher.matches()){
            System.out.print("Error special character: Please enter only alphabets"); //error message

        }else{

            String res = count_Vowels_consonant(str); // calling method to check vowel and consonant
            System.out.print("Result is: " + res+"\n");
        }

    }

    public static String count_Vowels_consonant(String str) {

        String summ = " ";

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u'|| str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                    || str.charAt(i) == 'O' || str.charAt(i) == 'U')
            {
                summ = summ+" vowel  ";
            }

            else
            {
                summ = summ +" consonent  ";
            }
        }
        return summ;
    }

}