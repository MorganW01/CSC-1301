public class NestedForLoops {

    public static void main(String[] args) {
        question7();
        question8();
        question9();
        question10();

    }

    // Same variable for questions 7 & 8. LINE can be set to either 4 or 8
    public static final int LINE = 8;

    public static void question7() {

        if (LINE == 8) {
            System.out.println("+----------------+");

            // UPPER HALF
            for (int i = 1; i <= LINE; i++) { // i controls the #of lines
                System.out.print("|");
                for (int j = LINE; j > i; j--) { // j controls the # of spaces before / in every line.
                    System.out.print(" ");
                }
                System.out.print("/");
                for (int k = 0; k < i - 1; k++) { // k is to control how many dots we have in every line.
                    System.out.print("..");
                }
                System.out.print("\\");
                for (int j = LINE; j > i; j--) { // j is to control how many spaces we have after \ in every line.
                    System.out.print(" ");
                }
                System.out.println("|");
            }


            //BOTTOM HALF

            for (int i = 1; i <= LINE; i++) {
                System.out.print("|");
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("\\");
                for (int k = LINE - 1; k > i - 1; k--) {
                    System.out.print("..");
                }
                System.out.print("/");
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }
            System.out.println("+----------------+");

        } else if (LINE == 4) {
            System.out.println("+--------+");

            // UPPER HALF
            for (int i = 1; i <= LINE; i++) { // i controls the #of lines
                System.out.print("|");
                for (int j = LINE; j > i; j--) { // j controls the # of spaces before / in every line.
                    System.out.print(" ");
                }
                System.out.print("/");
                for (int k = 0; k < i - 1; k++) { // k is to control how many dots we have in every line.
                    System.out.print("..");
                }
                System.out.print("\\");
                for (int j = LINE; j > i; j--) { // j is to control how many spaces we have after \ in every line.
                    System.out.print(" ");
                }
                System.out.println("|");
            }

            //BOTTOM HALF

            for (int i = 1; i <= LINE; i++) {
                System.out.print("|");
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("\\");
                for (int k = LINE - 1; k > i - 1; k--) {
                    System.out.print("..");
                }
                System.out.print("/");
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }
            System.out.println("+--------+");

        } else {
            System.out.println("+----------------+");

            // UPPER HALF
            for (int i = 1; i <= LINE; i++) { // i controls the # of lines
                System.out.print("|");
                for (int j = LINE; j > i; j--) { // j controls the # of spaces before / in every line.
                    System.out.print(" ");
                }
                System.out.print("/");
                for (int k = 0; k < i - 1; k++) { // k is to control how many dots we have in every line.
                    System.out.print("..");
                }
                System.out.print("\\");
                for (int j = LINE; j > i; j--) { // j is to control how many spaces we have after \ in every line.
                    System.out.print(" ");
                }
                System.out.println("|");
            }


            //BOTTOM HALF

            for (int i = 1; i <= LINE; i++) {
                System.out.print("|");
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("\\");
                for (int k = LINE - 1; k > i - 1; k--) {
                    System.out.print("..");
                }
                System.out.print("/");
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }
            System.out.println("+----------------+");


        }

    }

    public static void question8() {

        if (LINE == 8) {
            System.out.println("+----------------+");

            // UPPER HALF
            for (int i = 1; i <= LINE; i++) {
                System.out.print("|");
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("\\");
                for (int k = LINE - 1; k > i - 1; k--) {
                    System.out.print("..");
                }
                System.out.print("/");
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }
            //BOTTOM HALF
            for (int i = 1; i <= LINE; i++) { // i controls the # of lines
                System.out.print("|");
                for (int j = LINE; j > i; j--) { // j controls the # of spaces before / in every line.
                    System.out.print(" ");
                }
                System.out.print("/");
                for (int k = 0; k < i - 1; k++) { // k is to control how many dots we have in every line.
                    System.out.print("..");
                }
                System.out.print("\\");
                for (int j = LINE; j > i; j--) { // j is to control how many spaces we have after \ in every line.
                    System.out.print(" ");
                }
                System.out.println("|");
            }

            System.out.println("+----------------+");
        } else if (LINE == 4) {

            System.out.println("+--------+");

            // UPPER HALF
            for (int i = 1; i <= LINE; i++) {
                System.out.print("|");
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("\\");
                for (int k = LINE - 1; k > i - 1; k--) {
                    System.out.print("..");
                }
                System.out.print("/");
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }
            //BOTTOM HALF
            for (int i = 1; i <= LINE; i++) { // i controls the # of lines
                System.out.print("|");
                for (int j = LINE; j > i; j--) { // j controls the # of spaces before / in every line.
                    System.out.print(" ");
                }
                System.out.print("/");
                for (int k = 0; k < i - 1; k++) { // k is to control how many dots we have in every line.
                    System.out.print("..");
                }
                System.out.print("\\");
                for (int j = LINE; j > i; j--) { // j is to control how many spaces we have after \ in every line.
                    System.out.print(" ");
                }
                System.out.println("|");
            }

            System.out.println("+--------+");
        } else {
            System.out.println("+----------------+");

            // UPPER HALF
            for (int i = 1; i <= LINE; i++) {
                System.out.print("|");
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("\\");
                for (int k = LINE - 1; k > i - 1; k--) {
                    System.out.print("..");
                }
                System.out.print("/");
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }
            //BOTTOM HALF
            for (int i = 1; i <= LINE; i++) { // i controls the # of lines
                System.out.print("|");
                for (int j = LINE; j > i; j--) { // j controls the # of spaces before / in every line.
                    System.out.print(" ");
                }
                System.out.print("/");
                for (int k = 0; k < i - 1; k++) { // k is to control how many dots we have in every line.
                    System.out.print("..");
                }
                System.out.print("\\");
                for (int j = LINE; j > i; j--) { // j is to control how many spaces we have after \ in every line.
                    System.out.print(" ");
                }
                System.out.println("|");
            }

            System.out.println("+----------------+");


        }

    }


    //same variables for questions 9 & 10. Can be adjusted to SEGMENT = 3 HEIGHT = 4 and SEGMENT = 2 HEIGHT = 6 respectively.
    public static final int SEGMENT = 2;
    public static final int HEIGHT = 6;

    //question 9
    public static void question9() {

        for (int i = 1; i <= SEGMENT; i++) {
            for (int line = 1; line <= HEIGHT; line++) {
                for (int j = 1; j <= (-1 * line + HEIGHT); j++) {
                    System.out.print(" ");
                }

                for (int k = 2; k <= 2 * line - 1; k++) {
                    System.out.print("*");
                }
                System.out.println("*");
            }


        }
    }

    //question 10

    public static void question10() {

        for (int i = 1; i <= SEGMENT; i++) {
            for (int line = HEIGHT; line >= 1; line--) {
                for (int j = 1; j <= (-1 * line + HEIGHT); j++) {
                    System.out.print(" ");
                }
                for (int k = 2; k <= 2 * line - 1; k++) {
                    System.out.print("*");
                }
                System.out.println("*");
            }


        }

    }

}

