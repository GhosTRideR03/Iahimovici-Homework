package Homeworks_Vladislav_Iahimovici;

import java.util.Scanner;

public class HomeworkSeven {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int h = 200;
        int n = 50;
        int m = 1;
        int liftsUp = numberOfLifts(h,n,m);
        System.out.println("Lifts up: " + liftsUp);
// -------------------------------------------------------------------------------------
        System.out.print("Введите кол-во учеников: ");
        int students = scanner.nextInt();
        scanner.nextLine();
        counter(students);

    }

    public static void counter(int n) {
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Введите оценку для ученика " + (i + 1) + ": ");
            String grade = scanner.nextLine();
            switch (grade.toUpperCase()) {
                case "A":
                    countA++;
                    break;
                case "B":
                    countB++;
                    break;
                case "C":
                    countC++;
                    break;
                case "D":
                    countD++;
                    break;
                default:
                    System.out.println("Ошибка, неверная оценка");
                    i--;
                    break;
            }
        }
        System.out.println("Количество оценок:");
        System.out.println("A: " + countA);
        System.out.println("B: " + countB);
        System.out.println("C: " + countC);
        System.out.println("D: " + countD);


    }

    public static int numberOfLifts(int floor, int stepUp, int stepDown) {
        int liftsUp = 0;
        while (floor > 0) {
            floor = floor - stepUp;
            liftsUp++;
            if (floor <= 0)
                break;

            floor = floor + stepDown;

        }
        return liftsUp;
    }
}
