package com.company;

import java.util.Scanner;

public class IFelse4 {
    public static void main(String[] args) {

        int suhu;

        System.out.print("Masukan suhu :");

        Scanner temperatur = new Scanner(System.in);
        suhu = temperatur.nextInt();

        if (suhu == 29) {
            System.out.print("suhu " + suhu + " Celcius, Normal");
        }else if (suhu <= 20){
            System.out.print("suhu " + suhu + " Celcius, Dingin bro");
        }else if (suhu >= 32 && suhu <= 100) {
            System.out.print("suhu " + suhu + " Celcius, panas coy");
        }else if (suhu == 31){
            System.out.print("suhu " + suhu + " Celcius, hangat coy");
        }else {
            System.out.print("suhu tidak terdeteksi");
        }
    }
}
/**
 * buat else if
 * suhu 40 panas*/
