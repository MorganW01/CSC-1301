public class Assignment1 {

    public static void main(String[] args) {

        String space = "\n";
        //prints the heading
        header();
        //prints up facing arrow with line underneath
        drawUpArrow();
        drawALine();
        //prints a new line for separation
        System.out.println(space);

        //prints a line with a downwards facing arrow underneath
        drawALine();
        drawDownArrow();

        //prints a new line for separation
        System.out.println(space);

        //prints both arrows to form an X
        drawDownArrow();
        drawUpArrow();

        //prints a line for separation
        System.out.println(space);

        //prints a box
        drawALine();
        drawBars();
        drawBars();
        drawBars();
        drawALine();

    }


    public static void header() {
        String heading = "Morgan Warren\nCSC 1301 - Fall 2019\nProgramming Assignment 1\nDue 9/27/19";

        System.out.println(heading);
    }

    public static void drawUpArrow() {

        //done
        String firstRow = "  /\\";

        String secondRow = " /\t\\";

        //done
        String thirdRow = "/\t \\";

        System.out.println(firstRow);
        System.out.println(secondRow);
        System.out.println(thirdRow);

    }

    public static void drawDownArrow() {

        String firstRow = "  \\/";

        String secondRow = " \\\t/";

        //done
        String thirdRow = "\\\t /";

        System.out.println(thirdRow);
        System.out.println(secondRow);
        System.out.println(firstRow);


    }


    public static void drawALine() {
        String line = "-------";
        System.out.println(line);


    }

    public static void drawBars() {
        String bars = "|\t  |";
        System.out.println(bars);
    }


}
