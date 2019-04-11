package com.company;

import java.util.Scanner;

public class IFelse3 {

    public static void main(String[] args) {
        Scanner otong = new Scanner(System.in);

        System.out.print("latihan matematika\n");

        int pilihan;
        System.out.print("2+2 :");
        pilihan = otong.nextInt();

        if (pilihan == 4) {
        } else {
            System.out.println("salah");
        }

        int pertanyaan2;
        System.out.print("5x5 :");
        pertanyaan2 = otong.nextInt();

        if (pertanyaan2 == 25) {
            System.out.println("benar");
        } else {
            System.out.println("salah");
        }
    }
}
