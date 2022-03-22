// Nim      : 13020200107
// Nama     : Wd. Shaqina Rafa Naura
// Hari/Tgl : Senin, 14 Maret 2022
// Waktu    : 00.02 Wita

package com.project;

import java.util.Scanner;

/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan ITERATE */

public class PrintXinterasi {
    /**
    * @param args 
    */

    public static void main(String[] args) {
        // TODO Auto-generated method stub 
        /* Kamus : */  
        int Sum=0; 
        int x; 
        Scanner masukan=new Scanner(System.in); 
        
        /* Program */ 
        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); /* First Elmt */ 
        if (x == 999){  
            System.out.print ("Kasus kosong \n"); 
        }else{ /* MInimal ada satu data yang dijumlahkan */
            Sum = x; /* Inisialisasi; invariant !! */ 
            for (;;){ 
                System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
                x = masukan.nextInt(); /* Next Elmt */ 
            if(x==999)  
                break; 
            else{ 
                Sum = Sum + x; /* Proses */ 
            } 
        } 
    }  
    System.out.println("Hasil penjumlahan = "+ Sum);
    /* Terminasi */
    
 
    }
}
