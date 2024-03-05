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
public class Nomor1 {
    
    static boolean ribuan(int x){
          return (x >= 1000);
    }
    
    public static void main(String[] args) {
    int i;
    for(i = 1;i<=3;i++){
    System.out.printf("Masukan bilangan ke-"+i+": ");
    Scanner bilangan = new Scanner(System.in);
    int bilanganx = bilangan.nextInt();
    
    if(ribuan(bilanganx)){
    System.out.println("Bilangan tersebut merupakan ribuan");
    }else{System.out.println("Bilangan tersebut bukan merupakan ribuan");}
    }
    }
    
}
