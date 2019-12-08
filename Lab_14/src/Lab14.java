import java.util.Arrays;
public class Lab14 {

    public static void main (String[] args){

        // QUESTION 1 tests
        int [] list = {1,2,3,4,5,6};
        //returns 50.0
        int [] list2 = {2,4,5,7,10,46};
        //returns 66.66666666666667
        System.out.println(percentEven(list));
        System.out.println(percentEven(list2));

        //QUESTION 2 test
        append(list,list2);
    }

    //QUESTION 1 METHOD
    public static double percentEven (int []list){
        double count = 0.0;
        double result = 0.0;
        for (int i =0; i <list.length; i++){
            if (list[i] % 2==0){
                count ++;

            }
            result = (count *100)/list.length;

        }
        return result;


    }

    //QUESTION 2 METHOD
    public static int [] append (int []first, int []second){
        int[]result = new int[first.length+second.length];
        int count = 0;

        for(int i = 0; i < first.length; i++) {
            result[i] = first[i];
            count++;
        }
        for(int j = 0; j < second.length;j++) {
            result[count++] = second[j];
        }
        for(int i = 0;i < result.length;i++) System.out.print(result[i]+" ");

        return result;
    }





}










