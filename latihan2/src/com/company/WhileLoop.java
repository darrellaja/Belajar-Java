package com.company;

public class WhileLoop {
    public static void main(String[] args) {

        int angka = 1;

        while (angka <= 10) {
            if (angka <= 5) {
                System.out.println("angkot " + angka + " siap berangkat");
                angka++;
            } else {
                System.out.println("angkot " + angka + " rusak");
                angka++;
            }

        }

    }
}
