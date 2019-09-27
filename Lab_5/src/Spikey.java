public class Spikey {

    public static void main(String[] args){

        String space = "\n";

        firstFigure();
        //System.out.println(space);
        secondFigure();
        //System.out.println(space);
        firstFigure();

    }


    public static void firstFigure (){
        // prints this "\/"
        String twoSpikesDown="  \\/";
        //prints this "\\//"
        String fourSpikesDown=" \\\\//";
        // prints this "\\\///"
        String sixSpikesDown="\\\\\\///";
        //prints this "/\"
        String twoSpikesUp="  /\\";
        //prints this "//\\"
        String fourSpikesUp=" //\\\\";
        //prints this "///\\\"
        String sixSpikesUp="///\\\\\\";



        System.out.println(twoSpikesDown);
        System.out.println(fourSpikesDown);
        System.out.println(sixSpikesDown);
        System.out.println(sixSpikesUp);
        System.out.println(fourSpikesUp);
        System.out.println(twoSpikesUp);



    }

    public static void secondFigure (){

        // prints this "\/"
        String twoSpikesDown="  \\/";
        //prints this "\\//"
        String fourSpikesDown=" \\\\//";
        // prints this "\\\///"
        String sixSpikesDown="\\\\\\///";
        //prints this "/\"
        String twoSpikesUp="  /\\";
        //prints this "//\\"
        String fourSpikesUp=" //\\\\";
        //prints this "///\\\"
        String sixSpikesUp="///\\\\\\";


        System.out.println(sixSpikesUp);
        System.out.println(fourSpikesUp);
        System.out.println(twoSpikesUp);
        System.out.println(twoSpikesDown);
        System.out.println(fourSpikesDown);
        System.out.println(sixSpikesDown);




    }




}
