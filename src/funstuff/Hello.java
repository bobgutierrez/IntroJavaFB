package funstuff;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        System.out.println("Hello World!");

        long valueOne = 3 + 4;
        System.out.println(valueOne);
        System.out.println("valueOne");

        // System.out.println(valueTwo);
        // System.out.println("valueTwo");
        int twelve = 12;

        valueOne = (valueOne + 12) - (3 * twelve);
        System.out.println(valueOne);
        valueOne = 7 * 6;
        System.out.println(valueOne); // + - * / %
        valueOne = 7 / 3;
        System.out.println(valueOne);

        double tenDividedByThree = 10.0 / 3.0;
        System.out.println(tenDividedByThree);
        System.out.printf("The value is %6.2f, do you like that?\nBecause I think it's cool", tenDividedByThree);

        boolean isBigger = 7 > 3;
        System.out.println(isBigger); // < > <= >= == !=

        System.out.println(7 == 3);
        System.out.println(7 != 3);

        System.out.println("Still here!");

        int fahrenheit = 80;
        double celcius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println(celcius);
        celcius = celcius + 10;
        boolean isFrench = true;
        String message;
        // System.out.println(message);
        if (isFrench)
        {
            message = "Quand il est plus chaud ca sera";
            System.out.println("uh oh!!!");
        } else
        {
            message = "When it's warmer it will be ";
        }
        System.out.println(message + celcius + " and I will be more comfortable!");
        
        String language = "Spanish";
        if (language.equals("French")) {
            System.out.println("Bonjour");
        } else if (language.equals("English")) {
            System.out.println("Hello");
        } else if (language.equals("Spanish")) {
            System.out.println("Hola");
        } else {
            System.out.println("Shout loudly and gesticulate wildly while smiling");
        }

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        while(!line.equals("Quit")) {
            System.out.println("You typed: " + line);
            int value = Integer.parseInt(line);
            int biggerValue = value + 10;
            System.out.println("Bigger number is " + biggerValue);
            line = sc.nextLine();
        }
        System.out.println("OK, all done looping now...");
    }
}