package Homeworks_Vladislav_Iahimovici;


import basic.homeworks.decisions.hw7switch.Task1;

public class HomeworkSix {

    public enum MothsOfTheYear{
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public static void main(String[] args) {
       MothsOfTheYear month = MothsOfTheYear.FEBRUARY;
       int days = daysInMonth(month);
        System.out.println("Количество дней в " + month + " " + days);
    }

    public static int daysInMonth (MothsOfTheYear currentMonth) {
        switch (currentMonth) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                return 31;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                return 30;
            case FEBRUARY:
            default:
                return 28;
        }

    }


}
