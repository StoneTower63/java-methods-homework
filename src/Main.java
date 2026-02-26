import java.time.LocalDate;

public class Main {
    //Метод к задаче 1
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    //--------------------------------------
    //Метод к задаче 2
    public static void suggestAppVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Вам нужна облегченная версия для ios");
            } else {
                System.out.println("Вам нужна обычная версия для ios");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Вам нужна облегченная версия для android");
            } else {
                System.out.println("Вам нужна обычная версия для android");
            }
        }
    }

    //--------------------------------------
    //Метод к задаче 3
    public static int calculateDeliveryDays(int distance) {
        int deliveryDays = 1;
        if (distance > 100) {
            return -1;
        }
        if (distance > 20) {
            deliveryDays += 1;
        }
        if (distance > 60) {
            deliveryDays += 1;
        }
        return deliveryDays;
    }

    //--------------------------------------
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int year = 2021;
        checkLeapYear(year);
        //--------------------------------------
        System.out.println();
        //Задание 2
        System.out.println("Задание 2");
        int os = 0;
        int clientDeviceYear = 2015;
        suggestAppVersion(os, clientDeviceYear);
        //--------------------------------------
        System.out.println();
        //Задание 3
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        int days = calculateDeliveryDays(deliveryDistance);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет");
        }
        //---------------------------------------
        //Конец дз
    }
}