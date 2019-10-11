public class ForLoops {


    public static void main(String []args){
        question1();
        question2();
        question3();
    }

    //question 1
    public static void question1() {

        for (int i=2; i <=129; i=i*2){
            System.out.println(i+1);

        }
    }

    //question 2
    public static void question2(){

        for (int i=2; i <=2049; i=i*4){
            System.out.println(i+1);

        }
    }

    //question 3
    public static void question3(){

        for (int i=1881; i>=3; i=i/3){
            System.out.println(i);

        }
    }
}
