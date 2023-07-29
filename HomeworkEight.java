package Homeworks_Vladislav_Iahimovici;


import java.util.Scanner;

public class HomeworkEight {

    public static void main(String[] args) {
        // counterOneToHundred();
        // counterOneToFifty();
        // counterOneToThousand();
        //sumOfNumbersLower(1000);
        //System.out.println(characterCounter("Hello Ilias", 'l'));
        romanToDecimal("LXXXVIII");
    }

    public static void romanToDecimal(java.lang.String romanNumber) {
        int decimal = 0;
        int lastNumber = 0;
        String romanNumeral = romanNumber.toUpperCase();
        for (int x = romanNumeral.length() - 1; x >= 0; x--) {
            char convertToDecimal = romanNumeral.charAt(x);

            switch (convertToDecimal) {
                case 'M':
                    decimal = processDecimal(1000, lastNumber, decimal);
                    lastNumber = 1000;
                    break;

                case 'D':
                    decimal = processDecimal(500, lastNumber, decimal);
                    lastNumber = 500;
                    break;

                case 'C':
                    decimal = processDecimal(100, lastNumber, decimal);
                    lastNumber = 100;
                    break;

                case 'L':
                    decimal = processDecimal(50, lastNumber, decimal);
                    lastNumber = 50;
                    break;

                case 'X':
                    decimal = processDecimal(10, lastNumber, decimal);
                    lastNumber = 10;
                    break;

                case 'V':
                    decimal = processDecimal(5, lastNumber, decimal);
                    lastNumber = 5;
                    break;

                case 'I':
                    decimal = processDecimal(1, lastNumber, decimal);
                    lastNumber = 1;
                    break;
            }
        }
        System.out.println(decimal);
    }

    public static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
        if (lastNumber > decimal) {
            return lastDecimal - decimal;
        } else {
            return lastDecimal + decimal;
        }
    }


    public static int characterCounter(String str, char c) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                counter++;
            }
        }
        return counter;
    }


    public static void sumOfNumbersLower(int x) {
        int sum = 0;
        for (int i = 1; i < x; i++) {
            sum = i + sum;
        }
        System.out.println(sum);
    }

    public static void counterOneToThousand() {
        int sum = 0;
        for (int i = 2; i <= 1000; i++) {
            if (i * i <= 1000) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void counterOneToFifty() {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;

            }
        }
        System.out.println(sum);
    }

    public static void counterOneToHundred() {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
