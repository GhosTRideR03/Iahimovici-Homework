package Homeworks_Vladislav_Iahimovici;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово с четным кол-вом букв:");
        String letterCount = scanner.nextLine();
        System.out.println("Введите слово с четным кол-вом букв:");
        String letterCount2 = scanner.nextLine();
        System.out.println(letterCount.length());
        System.out.println(letterCount2.length());
        System.out.print("Ваше новое слово: ");
        System.out.println(returnNewWord(letterCount, letterCount2));

//     ------------------------------------------------------------------------------------------------
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double val1 = scanner1.nextDouble();
        System.out.println("Введите второе число:");
        double val2 = scanner1.nextDouble();
        System.out.println(summary(val1, val2));
        System.out.println(substract(val1, val2));
        System.out.println(multiply(val1, val2));
        System.out.println(divide(val1, val2));

// -----------------------------------------------------------------------------------------------
        System.out.println("Сколько евро желаете поменять в доллары?:");
        double eur = scanner1.nextDouble();
        System.out.println("Введите курс евро к доллару: ");
        double courseOfDollar = scanner.nextDouble();
        converter(eur, courseOfDollar);
//-----------------------------------------------------------------------------------------------
        System.out.println("Введите диаметр малой пиццы: ");
        int smallDiameter = scanner1.nextInt();
        System.out.println("Ведите диаметр большой пиццы: ");
        int bigDiameter = scanner1.nextInt();
        int caloriesPerSquare = 40;
        System.out.println("Вы потребили на " + caloriesCalculator(smallDiameter, bigDiameter, caloriesPerSquare) +
                " каллорий больше");

// ---------------------------------------------------------------------------------------------------------
        System.out.println("Введите длинну стороны квадрата:");
        double squareSide = scanner1.nextDouble();
        System.out.println("Площадь квадрата = " + squareArea(squareSide));
        System.out.println("Введите длиину стороны один прямоугольника:");
        double rectangleSideOne = scanner1.nextDouble();
        System.out.println("Введите длинну стороны два прямоугольника:");
        double rectangleSideTwo = scanner1.nextDouble();
        System.out.println("Площадь прямоугольника = " + rectangleArea(rectangleSideOne, rectangleSideTwo));
        System.out.println("Введите полупериметр треугольника: ");
        double semiPer = scanner1.nextDouble();
        System.out.println("Введите радиус вписаной окружности: ");
        double radiusOfCircle = scanner1.nextDouble();
        System.out.println("Площадь треугольника = " + triangleAreaByGeron(semiPer, radiusOfCircle));

//  -------------------------------------------------------------------------------------------------

        System.out.println("Введите строку:");
        Scanner str1 = new Scanner(System.in);
        String str = str1.nextLine();
        System.out.println("Введите первый индекс символа который хотите отобразить: ");
        int charIndexOne = scanner1.nextInt();
        System.out.println("Введите второй индекс символа который хотите отобразить: ");
        int charIndexTwo = scanner1.nextInt();
        System.out.println("Ваши символы вместе: ");
        System.out.println(getChars(str, charIndexOne, charIndexTwo));

    }

    public static double triangleAreaByGeron(double p, double r) {
        double result = p * r;
        return result;

    }

    public static double squareArea(double x) {
        double result = Math.pow(x, 2);
        return result;

    }

    public static double rectangleArea(double x, double y) {
        double result = x * y;
        return result;

    }


    public static int caloriesCalculator(int smallDiameter, int bigDiameter, int caloriesPerSquare) {
        double smallArea = Math.PI * Math.pow(smallDiameter / 2.0, 2);
        double bigArea = Math.PI * Math.pow(bigDiameter / 2.0, 2);

        int smallCalories = (int) smallArea * caloriesPerSquare;
        int bigCalories = (int) bigArea * caloriesPerSquare;

        int difference = bigCalories - smallCalories;
        return difference;
    }


    public static void converter(double summ, double course) {
        double convertation = summ * course;
        System.out.println("При курсе: " + course + " USD за EUR, при обмене: " + summ + " EUR, вы получите " +
                convertation + " USD");


    }


    public static double summary(double x, double y) {
        double result = x + y;
        return result;
    }

    public static double substract(double x, double y) {
        double result = x - y;
        return result;
    }

    public static double multiply(double x, double y) {
        double result = x * y;
        return result;
    }

    public static double divide(double x, double y) {
        double result = x / y;
        return result;
    }


    public static String returnNewWord(String str1, String str2) {

        str1 = str1.substring(0, str1.length() / 2);
        str2 = str2.substring(str2.length() / 2, str2.length());
        String str3 = str1 + str2;
        return str3;


    }

    public static String getChars(String str, int x, int y) {

        String result = "";
        result = result + str.charAt(x);
        result = result + str.charAt(y);
        return result;


    }
}



