package com.company;

/**
 * Created by VAIO on 3/25/2015.
 */
public class Tugas12 {
    public static void main(String[] args) {
        int panjang=7;
        int lebar=8;
        for (int i=1;i<=lebar;i++){
            if (i%2==0){
                System.out.print(" ");
            }
            for (int j=1;j<=panjang;j++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}

