import java.util.Scanner;
public class Lab10_Q2 {
    public static void main (String []args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter next person's information: ");
        System.out.println("height (in inches)? : ");
        double height = scanner.nextDouble();
        System.out.println("weight(in pounds)? : ");
        double weight = scanner.nextDouble();
        System.out.println(bmiCalculator(weight, height));


    }
    //height in inches
    public static String bmiCalculator (double weight, double height){
        double bmi = (weight/(height*height))*(703);
        String weightClass= " ";
        if (bmi<=18.5){
            weightClass = "Underweight";

        }
        else if (bmi ==18.5 || bmi <=24.9){

            weightClass = "Normal";
        }
        else if(bmi ==25.0 || bmi <=29.9 ){
            weightClass = "Overweight";

        }
        else if (bmi<=30.0){
            weightClass = "Obese";
        }
        System.out.println("BMI: "+ bmi);
        return weightClass;


    }
}
