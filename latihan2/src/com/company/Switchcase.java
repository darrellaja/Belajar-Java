package com.company;

public class Switchcase {
    public static void main(String[] args) {

        int suhu = 20;

        switch (suhu) {

            case 20 :
                System.out.println("Dingin");
                break;
            case 30 :
                System.out.println("Hangat");
                break;

                default:
                    System.out.println("Suhu tidak terdeteksi");
        }
    }
}
