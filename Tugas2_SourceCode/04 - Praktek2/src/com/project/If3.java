// Nim      : 13020200107
// Nama     : Wd. Shaqina Rafa Naura
// Hari/Tgl : Senin, 14 Maret 2022
// Waktu    : 20.55 Wita

package com.project;

import java.util.Scanner;

/* contoh pemakaian IF tiga kasus */ /* Membaca sebuah nilai, */
/* menuliskan 'Nilai a positif , nilai a', jika a >0 */
/* 'Nilai Nol , nilai a', jika a = 0 */
/* 'Nilai a negatif , nilai a', jika a <0 */

public class If3 {
    /**
    * @param args 
    */

    public static void main(String[] args) {
        // TODO Auto-generated method stub 
        /* Kamus */ 
        int a; 
        Scanner masukan = new Scanner(System.in); 
        
        /* Program */ 
        System.out.print ("Contoh IF tiga kasus \n");  
        System.out.print ("Ketikkan suatu nilai integer :"); 
        a = masukan.nextInt(); 
        if (a > 0){
            System.out.println ("Nilai a positif "+ a); 
        }else if (a == 0){ 
            System.out.println ("Nilai Nol "+ a); 
        }else /* a > 0 */ { 
            System.out.println ("Nilai a negatif "+ a); 
        } 


    }
}
