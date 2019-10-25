
import java.util.Scanner;
public class Lab9 {
    public static void main (String []args){
        System.out.println("Enter a String!");
        Scanner scanner = new Scanner(System.in);
        String word= scanner.nextLine();
        showPairs(word);

    }

    public static void showPairs(String word){
        for (int i =0; i < word.length()-1; i++){
            //print out letters two at a time
            System.out.print(word.charAt(i));
            System.out.print(word.charAt(i+1));
            System.out.println();

        }




    }









}
