public class StarFigures {

    public static void main (String[] args){
        twoRows();
        crossOfStars();
        twoRows();
        crossOfStars();
        twoRows();
        crossOfStars();
        twoRows();


    }

    // draws a row of 5 stars
    public static void fiveStars (){
        System.out.println("*\t*\t*\t*\t*");
    }

    //draws a row of two stars
    public static void twoStars(){
        System.out.println("\t*\t\t*");
    }

    //draws one star
    public static void oneStar(){
        System.out.println("\t\t*");
    }
    // draws two rows of five stars
    public static void twoRows(){
        fiveStars();
        fiveStars();
    }

    //draws stars in the form of an x
    public static void crossOfStars(){
        twoStars();
        oneStar();
        twoStars();
    }

}
