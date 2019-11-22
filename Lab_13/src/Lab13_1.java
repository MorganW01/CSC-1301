import java.util.Scanner;
public class Lab13_1 {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word1 = scanner.nextLine();
        System.out.println("Enter another word: ");
        String word2= scanner.nextLine();
        wordRelationship(word1,word2);
    }
    public static boolean wordRelationship(String word1, String word2){
        boolean rhyme = word1.charAt(word1.length()-1) == word2.charAt(word2.length()-1);

        boolean alliterate = word1.charAt(0) == word2.charAt(0);

        boolean condition = false;

        //checks for alliterate only
        if (alliterate){
            System.out.println("The words alliterate!");
            condition = alliterate;

        }
        //checks for rhyme only
        if (rhyme){
            System.out.println("The words rhyme!");
            condition = rhyme;
        }
        //runs if neither rhyme nor alliterate
        else {
            System.out.println("The words neither rhyme nor alliterate!");
        }

        return condition;
    }

}
