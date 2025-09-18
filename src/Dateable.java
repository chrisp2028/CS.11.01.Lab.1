import java.util.Scanner;

public class Dateable {
/*
    There is a folk rule stating you should only date someone who is at least
    seven years older than half your age. For example, an 18-year-old needs to
    date somebody at least 16 years old

    ( 7 + ( age / 2 ) ).


    A sample program run could be :

    Prompt + input: Enter your age: 19

    Output: 19-year olds should date somebody who is at least 16 years old.

 */
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int result = ( 7 + ( age / 2 ) );
        System.out.println(age+"-year olds should date somebody who is at least "
                + result + " years old.");
    }
}
