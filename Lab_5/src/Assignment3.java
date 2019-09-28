public class Assignment3 {

    public static void main (String [] args){

        drawUpArrow();
        drawALine();
        drawBars();
        drawALine();
        drawTextBars();
        drawALine();
        drawBars();
        drawALine();
        drawUpArrow();


    }

    public static void drawUpArrow() {

        //done
        String firstRow = "   /\\" + "        /\\";

        String secondRow = "  /\t \\" + "      /  \\";

        //done
        String thirdRow = " /\t  \\" + "    /\t\\";

        System.out.println(firstRow);
        System.out.println(secondRow);
        System.out.println(thirdRow);

    }

    public static void drawALine(){
        String line = "+------+  +------+";
        System.out.println(line);

    }

    public static void drawBars() {
        String bars = "|      |  |      |\n|      |  |      |";
        System.out.println(bars);

        //may need to add just six spaces

    }

    public static void drawTextBars() {
        /*String textBars = "|United|\n|States|";
        System.out.println(textBars);*/

        String textLineOne = "|United|  |United|";
        String textLineTwo = "|States|  |States|";
        System.out.println(textLineOne);
        System.out.println(textLineTwo);



    }
}
