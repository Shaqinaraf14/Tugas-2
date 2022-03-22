// Nim      : 13020200107
// Nama     : Wd. Shaqina Rafa Naura
// Hari/Tgl : Senin, 14 Maret 2022
// Waktu    : 23.40 Wita

package com.project;

import java.util.Scanner;

/* Baca N, */
/* Print i = 1 s/d N dengan while (ringkas) */ 

public class PrintWhile1 {
    /**
    * @param args 
    */

    public static void main(String[] args) {
        // TODO Auto-generated method stub 
        /* Kamus : */  
        int N; 
        int i = 1; 
        Scanner masukan=new Scanner(System.in); 
        
        /* Program */ 
        System.out.print ("Nilai N > 0 = ");  
        N = masukan.nextInt(); 
        System.out.print ("Print i dengan WHILE (ringkas): \n");  
        while (i <= N){ 
            System.out.println (i++);  
        } /* (i > N)*/ 
        
    }
}
