package com.company;

/**
 * Created by VAIO on 3/25/2015.
 */
public class Tugas9 {
    public static void main(String[] args) {
        int awal = 1;
        int akhir = 110;
        for(awal=1; awal<=110; awal++){
            if(awal % 5 == 0){
                System.out.print("JONI SI KOBOI!");
            }else {
                System.out.print(awal + " ");
            }
            if (awal%11==0){
                System.out.print("\n");
            }
        }
    }
}

