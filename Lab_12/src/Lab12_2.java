import java.util.Random;
public class Lab12_2{

    public static void main (String []args){
        Random rand = new Random();
        //(max - min +1 )+ min (creates range)
        int a = rand.nextInt(128-16+1)+16;
        showTwos(a);
    }

    public static void showTwos(int a){
        // variable used to store the amount of two's in the number
        int count = 0;
        if (a % 2 == 0){
            System.out.print(a + " = ");
            while (a % 2 == 0){
                a = a/2;
                count++;

            }
            for (int i = 1; i<=count; i++){
                System.out.print("2 * ");

            }
            System.out.print(a);

        }
        else {

            System.out.println(a + " = "+a);

        }
    }

}
