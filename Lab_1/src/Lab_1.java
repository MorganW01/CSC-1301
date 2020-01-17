public class Lab_1 {


    public static void main (String []args){
        //test for question 1
        int sum = question1();
        System.out.println(sum);

        //test for question 2
        question2();

        //test for question 3
        question3();
    }

    public static int question1(){
        int sum =0;

        for (int i =0; i <=2000; i++){


            if (i %2==0){

                sum = sum +i;
            }
        }
        return sum;
    }

    public static final int numLines = 5;

    public static void question2(){
        for (int n = numLines; n >= 1; n--) {
            for (int j = n; j <= numLines; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void question3(){
        for (int n = numLines; n >= 1; n--) {
            for (int j = n; j <= numLines; j++) {
                System.out.print((int)Math.pow(j,2) + " ");

            }
            System.out.println();
        }

    }


}
