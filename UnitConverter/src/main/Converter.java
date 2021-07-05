package main;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args){
        Converter c = new Converter();
        Scanner input = new Scanner(System.in);

        int menuSelection = 0;

        while(menuSelection != 3){
            System.out.println("1. Miles to Kilometers");
            System.out.println("2. Ounces to grams");
            System.out.println("3. Fahrenheit to Celsius");
            System.out.println("4. Quit");

            System.out.println("Please select an option: ");
            menuSelection = input.nextInt();
            switch(menuSelection){
                case 1:
                    System.out.print("Please enter the miles you wish to convert: ");
                    double milesConvert = input.nextDouble();
                    System.out.println(c.milesToKilometers(milesConvert));
                    break;

                case 2:
                    System.out.print("Please enter the ounces you wish to convert: ");
                    double ouncesConvert = input.nextDouble();
                    System.out.println(c.ouncesToGrams(ouncesConvert));
                    break;

                case 3:
                    System.out.print("Please enter the ounces you wish to convert: ");
                    int fConvert = input.nextInt();
                    System.out.println(c.fahrenheitToCelsius(fConvert));
                    break;
                case 4:
                    System.exit(1);
            }


        }

        

    }

    public double milesToKilometers(double miles){
        double kmConversion = miles * 1.61;

        return kmConversion;
    }

    public double ouncesToGrams(double ounces){
        double gramConversion = ounces * 28.35;

        return gramConversion;
    }

    public int fahrenheitToCelsius(int f){
        int c = (int) ((f - 2)/1.8);

        return c;
    }
}
