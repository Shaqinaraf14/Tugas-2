// Nim      : 13020200107
// Nama     : Wd. Shaqina Rafa Naura
// Hari/Tgl : Senin, 14 Maret 2022
// Waktu    : 00.28 Wita

package com.project;

import java.util.Scanner;

/* contoh memebaca integer menggunakan Class Scanner */
public class BacaData {
    /** 
    * @param args  
    */

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        int a;
        Scanner masukan;
        /* Program */
        System.out.print ("Contoh membaca dan menulis, ketik nilai integer : \n");
        masukan = new Scanner (System.in);
        a = masukan.nextInt(); /* coba ketik masukan.nextInt();; Apa akibatnya ? */
        System.out.print ("Nilai yang dibaca : "+ a);
    }
    
}
