import java.util.Scanner;
public class Lab10_Q1 {

    public static void main (String []args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int first = scanner.nextInt();
        System.out.println("Enter a second number: ");
        int second = scanner.nextInt();
        System.out.println("Enter a third number: ");
        int third = scanner.nextInt();
        System.out.println("The sum of the three numbers is: "+calcSum(first,second, third));
        System.out.println("The average of the three numbers is: "+ calcAvg(first, second, third) );



    }

    public static int calcSum (int first, int second, int third){
        if (first < second){

            first = first +second;
        }
        if (second < third){
            third = third-second;
        }
        else{

            return first + second + third;
        }
        return first + second + third;
    }

    public static double calcAvg (int first, int second , int third){
        return (first+second+third)/(3.0);

    }


}
