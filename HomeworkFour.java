package Homeworks_Vladislav_Iahimovici;

import java.util.Random;
import java.util.Scanner;

public class HomeworkFour {
    public static void main(String[] args) {
        boolean isWeekEnd = true;
        boolean isRain = false;
        boolean canWalk = isWeekEnd && !isRain;
        boolean canWalkTwo = isWeekEnd || isRain;
        System.out.println(canWalk);
        System.out.println(canWalkTwo);
// --------------------------------------------------
            boolean isEdekaOpen = true;
            boolean isReweOpen = true;
        System.out.println("Я могу купить еду это " + canBuy(isEdekaOpen, isReweOpen));
// --------------------------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру первой колбы:");
        int temperature1 = scanner.nextInt();
        System.out.println("Введите температуру второй колбы:");
        int temperature2 = scanner.nextInt();
        System.out.println(deviceTemperature(temperature1, temperature2));
//-----------------------------------------------------------------------------
        Random random = new Random();
        int seconds = random.nextInt(28800);
        System.out.println(seconds + " Seconds Left");
        System.out.println(hoursLeft(seconds) + " Hours Left");

    }
    public static int hoursLeft (int secs){
        int hours = secs / 3600;
        return hours;
    }

    public static boolean deviceTemperature (int colb1, int colb2){
        boolean hotColb = colb1 > 100;
        boolean coldColb = colb2 < 100;
        boolean isWorks = hotColb && coldColb;
        return isWorks;
    }

    public static boolean canBuy(boolean shop, boolean shopTwo){
        boolean canBuy = shop || shopTwo;
        return  canBuy;
    }
}
