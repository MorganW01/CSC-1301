public class CompareArrays {

    public static void main (String []args){
        int []a= {10,20,30,40,50};
        int []b= {35,30,60,73,55};

        boolean compareArray = allLess(a,b);
        System.out.println(compareArray);

    }

    public static boolean allLess(int [] a, int[] b){
        boolean test = false;
        //if test works
        if (a.length != b.length){
            test=false;
        }

        else {
            for (int i =0; i <= a.length-1; i++){
                if (a[i]<b[i]){

                    test = true;
                }

                else {
                    test=false;
                }

            }

        }

       return test;


    }
}
