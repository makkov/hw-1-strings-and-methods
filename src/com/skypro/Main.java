package com.skypro;

public class Main {

    public static void main(String[] args) {

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        //String - 1
        String fullName = String.format("ФИО сотрудника — %s %s %s", lastName, firstName, middleName);
        System.out.println(fullName);

        //String - 2
        String fullNameUpperCase = String.format(
                "ФИО сотрудника — %s %s %s",
                lastName.toUpperCase(),
                firstName.toUpperCase(),
                middleName.toUpperCase()
        );
        System.out.println(fullNameUpperCase);

        //String - 3
        String input = "ёж";
        String replaceSymbol = input.replace('ё', 'e');
        System.out.println(replaceSymbol);


        //Methods - 1
        checkYearIsLeap(2020);

        //Methods - 2
        getOsRecommendation(2018, 0);
        getOsRecommendation(2010, 1);

        //Methods - 3
        task3(2);
        task3(30);
        task3(80);
        task3(130);
    }

    public static void checkYearIsLeap(int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static void getOsRecommendation(int currentYear, int clientOs) {
        int boarderYear = 2015;

        String lightInfo;

        if (currentYear < boarderYear) {
            lightInfo = "облегченную ";
        } else {
            lightInfo = "";
        }

        String osType;

        if (clientOs == 0) {
            osType = "iOS";
        } else {
            osType = "Android";
        }

        String generalInfo = "Установите " + lightInfo + "версию приложения для " + osType + " по ссылке";
        System.out.println(generalInfo);
    }

    public static void task3(int distance) {
        int days = computeDeliveryDays(distance);

        String deliveryInfo = days == -1 ? "Доставки нет" : String.format("Потребуется дней: %s", days);

        System.out.println(deliveryInfo);
    }

    public static int computeDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}
