public class Lab8 {

    public static void main (String []args){

        //question1();
        question2();
        //question3();

    }

    public static void question1() {

            for (int i = 1; i <= 4; i++) {

                for (int j = 1; j <= 5; j++) {

                    System.out.print(Math.round(Math.pow(i, j))+" ");
                }
                System.out.println(" ");


            }
    }

    public static void question2(){
        for(int i=1; i<=4;i++){}




    }


    public static final int SEGMENT =2;
    public static final int HEIGHT =6;

    public static void question3() {

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
