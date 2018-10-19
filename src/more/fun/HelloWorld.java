package more.fun;

public class HelloWorld {

    public static int convertFahrenheitToCelcius(int fahreneit) {
        int celc = 5 * (fahreneit - 32) / 9;
        return celc;
    }
    
    public static void main(String[] args){
        // TODO Auto-generated method stub
        System.out.println("Hello World!");
        
        int a = 4; // int long float double 
        int b = 12;
        int c;
        c = a + b;
        System.out.println(c);

        double d = 3.1415926;
        
        double fahrenheit = 80;
        double celc = (fahrenheit - 32) * (5.0 / 9) ;
        System.out.println(celc);
        
        
        int big = 2_000_000_000;
        big = big + 1;
        System.out.println(big);
        big = big * 40;
        big = big / 40;
        System.out.println(big);
        
        int boiling = convertFahrenheitToCelcius(212);
        int fahr = 80;
        int nearlyBoiling;
        nearlyBoiling = convertFahrenheitToCelcius(fahr + 120);
    }
}
