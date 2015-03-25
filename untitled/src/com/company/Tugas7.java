package com.company;

/**
 * Created by VAIO on 3/25/2015.
 */
public class Tugas7 {
    public static void main(String[] args) {
        float jumlah=0, i=1;
        double hasil;
        while (i<=10){
            jumlah = jumlah + i;
            i++;
        }

        jumlah = jumlah / (i-1);
        System.out.println("Hasilnya adalah.... " +jumlah);
    }
}

