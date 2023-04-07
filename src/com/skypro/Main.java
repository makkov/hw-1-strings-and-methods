package com.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        //1
        int year = 2021;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }


        //2
        int clientDeviceYear = 2016;
        int clientOS = 0;
        int boarderYear = 2015;

        String lightInfo;

        if (clientDeviceYear < boarderYear) {
            lightInfo = "облегченную ";
        } else {
            lightInfo = "";
        }

        String osType;

        if (clientOS == 0) {
            osType = "iOS";
        } else {
            osType = "Android";
        }

        String generalInfo = "Установите " + lightInfo + "версию приложения для " + osType + " по ссылке";
        System.out.println(generalInfo);


        //3
        int days;
        int distance = 25;

        if (distance <= 20) {
            days = 1;
        } else if (distance > 20 && distance <= 60) {
            days = 2;
        } else if (distance > 60 && distance <= 100) {
            days = 3;
        } else {
            days = -1;
        }
    }
}
