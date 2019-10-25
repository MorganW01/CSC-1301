
import java.util.Scanner;
public class Lab9 {
    public static void main (String []args){
        System.out.println("Enter a String!");
        Scanner scanner = new Scanner(System.in);
        String word= scanner.nextLine();
        showPairs(word);
        showThrees(word);
        showFours(word);

    }

    //question 4
    public static void showPairs(String word){
        for (int i =0; i < word.length()-1; i++){
            //print out letters two at a time
            System.out.print(word.charAt(i));
            System.out.print(word.charAt(i+1));
            System.out.println();
        }
    }

    //question 5
    public static void showThrees (String word){
        for (int i =0; i < word.length()-1; i=i+3){
            //print out letters three at a time
            System.out.println(word.substring(i, i+3));
        }
    }


    //question 6
    public static void showFours (String word){
        for (int i =0; i < word.length()-2; i=i+4){
            //print out letters four at a time
            System.out.println(word.substring(i, i+4));
        }
    }
    
}
