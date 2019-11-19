import java.util.Random;
import java.util.Scanner;
public class Lab12 {

    public static void main(String[]args){
        Random rand = new Random();
        //(max - min +1 )+ min (creates range)
        int a = rand.nextInt(9999-800+1)+800;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer between 0 and 9");
        int b = scanner.nextInt();

        if (b>9||b<0){
            System.out.println("Your number is invalid! Enter another one: ");
            b=scanner.nextInt();
        }

        boolean flag = containDigits(a,b);
        System.out.println("My name is Morgan, and "+a+ " contains "+b+": "+flag);

    }
    public static boolean containDigits (int a, int b){

        while (a > 0){

            if (a % 10 == b)
                return true;
            else
                a = a/10;

        }
        return false;
    }
}
