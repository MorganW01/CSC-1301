public class NestedForLoops {

    public static void main(String []args) {
        question9();
        question10();

    }

   // public static final int
    public static void question7(){


    }

    public static void question8(){


    }


    //same variables for questions 9 & 10. Can be adjusted to SEGMENT = 3 HEIGHT = 4 and SEGMENT = 2 HEIGHT = 6 respectively.
    public static final int SEGMENT = 2;
    public static final int HEIGHT = 6;

    //question 9
    public static void question9(){

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

    public static void question10(){

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

