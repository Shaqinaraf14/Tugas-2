// Nim      : 13020200107
// Nama     : Wd. Shaqina Rafa Naura
// Hari/Tgl : Minggu, 13 Maret 2022
// Waktu    : 22.26 Wita


package com.project;
import java.util.Scanner;

public class KonversiWaktu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int detik,totMenit, menit, totJam, jam, konversi;

        System.out.print("Masukkan Total Detik : ");
        konversi = input.nextInt();

        detik = konversi % 60;
        totMenit = konversi / 60;
        menit = totMenit % 60;
        totJam = totMenit / 60;
        jam = totJam % 24;

        System.out.println("Detik Sekarang  = " + detik + " detik");
        System.out.println("Total Menit     = " + totMenit + " Menit");
        System.out.println("Menit Sekarang  = " + menit + " Menit");
        System.out.println("Total Jam       = " + totJam + " Jam");
        System.out.println("Jam Sekarang    = " + jam + " Jam");
        System.out.println("Tampil Waktu    = " + jam + ":" + menit + ":" + detik);
    }
   
}
