/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_pertemuan5;

import java.util.Scanner;

/**
 *
 * @author Rayin
 */
public class Nomor3 {
    
    static void segitiga(int N){
        for(int i=0;i<N;i++){
            for(int j = 0 ; j < i ;j++ ){
              System.out.printf("*");  
                }
            System.out.println("*");
            }
    }
    
         public static void main(String[] args) {
    int N;
    System.out.printf("Masukan Nilai N: ");
    Scanner n = new Scanner(System.in);
    N = n.nextInt();
    segitiga(N);
    }
}
