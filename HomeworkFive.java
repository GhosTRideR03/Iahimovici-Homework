package Homeworks_Vladislav_Iahimovici;

import java.util.Scanner;


public class HomeworkFive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int numberSolution = scanner.nextInt();
        numbersCheck(numberSolution);


        System.out.println("Введите число:");
        int evenOdd = scanner.nextInt();
        isEven(evenOdd);


        System.out.println("Введите год:");
        int year = scanner.nextInt();
        boolean leapYear = isYearLeap(year);
        if (leapYear) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }


        System.out.println("Введите оценку");
        int grade = scanner.nextInt();
        System.out.println(gradeCheck(grade));

        scanner.nextLine();
        System.out.println("Введите месяц:");
        String month = scanner.nextLine();
        System.out.println(whatSeason(month));


        System.out.println("Введите длинну первой стороны");
        double side1 = scanner.nextDouble();
        System.out.println("Введите длинну второй стороны");
        double side2 = scanner.nextDouble();
        System.out.println("Введите длинну третей стороны");
        double side3 = scanner.nextDouble();
        System.out.println(triangleType(side1, side2, side3));


        System.out.println("Введите число:");
        int number = scanner.nextInt();
        System.out.println(isMultiple(number));
    }

    public static String isMultiple(int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return "Число кратно и 3 и 5";
        } else if (x % 5 == 0) {
            return "Число кратно 5";
        } else if (x % 3 == 0) {
            return "Число кратно 3";
        } else {
            return "Число не кратно ни 3 ни 5";
        }
    }

    public static String triangleType(double a, double b, double c) {
        if (a == b && b == c) {
            return "Треугольник равносторонний";
        } else if (a == b || b == c) {
            return "Треугольник равнобедренный";
        } else {
            return "Треугольник разносторонний";
        }
    }

    public static String whatSeason(String month) {
        if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") ||
                month.equalsIgnoreCase("February")) {
            return "Is Winter";
        } else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") ||
                month.equalsIgnoreCase("May")) {
            return "Is Spring";
        } else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") ||
                month.equalsIgnoreCase("August")) {
            return "Is Summer";
        } else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") ||
                month.equalsIgnoreCase("November")) {
            return "Is Autumn";
        } else {
            return "Incorrect Data";
        }
    }

    public static String gradeCheck(int x) {
        if (90 <= x && x <= 100) {
            return "A";
        } else if (80 <= x && x <= 89) {
            return "B";
        } else if (70 <= x && x <= 79) {
            return "C";
        } else if (60 <= x && x <= 69) {
            return "D";
        } else if (x > 100) {
            return "Incorrect data";
        } else {
            return "F";
        }
    }


    public static boolean isYearLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static void isEven(int x) {
        int num = x % 2;
        boolean isEven = num == 0;
        if (isEven) {
            System.out.println("Введенное число четное");
        } else {
            System.out.println("Введенное число нечетное");
        }
    }


    public static void numbersCheck(int num) {
        boolean positiveNum = num > 0;
        boolean negativeNum = num < 0;
        if (positiveNum) {
            System.out.println("Введенное число положительно");
        } else if (negativeNum) {
            System.out.println("Введенное число отрицательно");
        } else {
            System.out.println("Введенное число равно нулю (0)");

        }
    }

}
