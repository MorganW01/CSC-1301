import java.util.Scanner;
public class Lab10_Q3 {
    public static void main (String []args){
        Scanner scanner = new Scanner (System.in);
        //System.out.println("Enter a string, or enter \"done\" to quit");
        boolean done = false;

        while (!done){
            System.out.println("Enter a string, or enter \"done\" to quit");
            String input = scanner.nextLine();



            if (input.equalsIgnoreCase("done")){
                System.out.println("Goodbye!");
                done=true;
                scanner.close();
            }
            else {
                System.out.println(swapPairs(input));


            }


        }



    }

    public static String swapPairs(String input) {
        char[] array = input.toCharArray();
        for (int i = 1; i < array.length; i += 2) {
            char swap = array[i];
            array[i] = array[i - 1];
            array[i - 1] = swap;
        }
        return new String(array);
    }







}

