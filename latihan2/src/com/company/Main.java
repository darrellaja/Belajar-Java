package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner otong = new Scanner(System.in);

        int pilihan;
        String NamaSiswa;
        System.out.println("Daftar siswa : ");
        System.out.println("1. Fadlan");
        System.out.println("2. Awan");
        System.out.println("3. Fikri");
        System.out.println("4. darrell");
        System.out.print("Masukkan nomor pilihan anda :");
        pilihan = otong.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("anda memilih fadlam"); break;
            case 2:
                System.out.println("anda memilih awan"); break;
            case 3:
                System.out.println("anda memilih fikri"); break;
            case 4:
                System.out.println("anda memilih darrell"); break;
            default:
                System.out.println("pilihan anda tidak anda tidak tersedia");
       }



    }
}
