public class NestedForLoops {

    //question 9
    public static final int SEGMENT = 2;
    public static final int HEIGHT = 6;

    public static void main(String []args) {

        for (int i = 1; i <= SEGMENT; i++) {
            for (int line = 1; line <= HEIGHT; line++) {
                for (int j = 1; j <= (-1 * line + HEIGHT); j++) {
                    System.out.print(" ");
                }
                //System.out.print("*");

                for (int k = 2; k <= 2 * line - 1; k++) {
                    System.out.print("*");
                }
                System.out.println("*");
            }


        }
    }




}

