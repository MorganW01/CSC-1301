public class NestedForLoops {

    //question 9
    public static final int SEGMENT=3;
    public static final int HEIGHT=4;

    public static void main(String []args){
        //initially line =1
        for (int line = 1; line <= HEIGHT; line++) {
            for (int j = 1; j <= (-1* line + HEIGHT); j++) {
                System.out.print(" ");
            }
            //System.out.print("*");

            for (int i = 2; i <= 2 * line - 1; i++) {
                System.out.print("*");
            }
            System.out.println("*");
        }


    }





}

