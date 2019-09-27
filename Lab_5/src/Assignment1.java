public class Assignment1 {

    public static void main (String [] args){

        String space="\n";
        header();
        drawUpArrow();
        drawALine();
        System.out.println(space);;
        drawALine();
        drawDownArrow();
        System.out.println(space);;
        drawDownArrow();
        drawUpArrow();
        System.out.println(space);;
        drawALine();
        drawBars();
        drawBars();
        drawBars();
        drawALine();

    }


    public static void header (){
        String heading = "Morgan Warren\nCSC 1301 - Fall 2019\nProgramming Assignment 1\nDue 9/27/19";

        System.out.println(heading);
    }

    public static void drawUpArrow(){

        //done
        String firstRow="  /\\";

        String secondRow = " /\t\\";

        //done
        String thirdRow = "/\t \\";

        System.out.println(firstRow);
        System.out.println(secondRow);
        System.out.println(thirdRow);

    }

    public static void drawDownArrow(){

        String firstRow="  \\/";

        String secondRow = " \\\t/";

        //done
        String thirdRow = "\\\t /";

        System.out.println(thirdRow);
        System.out.println(secondRow);
        System.out.println(firstRow);







    }

    // this method may not be needed
    /*public static void drawX (){


    }*/

    public static void drawALine () {
        String line = "- - - -";
        System.out.println(line);


    }

    public static void drawBars (){
        String bars = "|\t  |";
        System.out.println(bars);
    }






}
