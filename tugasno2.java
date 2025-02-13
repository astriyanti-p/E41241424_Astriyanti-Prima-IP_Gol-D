/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sibdm2p2;
/**
 *
 * @author Astrid
 */
import java.util.Scanner;
public class tugasno2 {
    public static void main(String[] args) {
     
     //deklarasi scanner dan variabel
    Scanner ss = new Scanner(System.in);
        System.out.println("     CAFE CERIA");
        System.out.println("   ANEKA MAKANAN");
        System.out.println("---------------------");
        System.out.println("   SPECIAL MENU :");
        System.out.println("  1. Soft Drinks");
        System.out.println("  2. Mix Juice");
        System.out.println("  3. Nescafe");
        System.out.println("  4. Soda Milk");
        System.out.println("  5. Tea");                 
        System.out.println("---------------------");
    //input nama pembeli
        System.out.print("Masukkan Nama Pembeli : ");
        String namaPembeli = ss.nextLine();
    int menu;
   //input pilihan
        System.out.println("");
        System.out.print("Silahkan masukkan pilihan anda : ");
        menu = ss.nextInt();
    switch (menu) {
        case 1 :
            System.out.println("Minuman yang anda pesan adalah Soft Drinks");
            break;
        case 2 :
            System.out.println("Minuman yang anda pesan adalah Mix Juice");
            break;
        case 3 :
            System.out.println("Minuman yang anda pesan adalah Nescafe");
            break;
        case 4 :
            System.out.println("Minuman yang anda pesan adalah Soda Milk");
            break;
        case 5 :
            System.out.println("Minuman yang anda pesan adalah Tea");
            break;}
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terimakasih " +namaPembeli + " telah berkunjung di Cafe Ceria");
                  
        
    }
   
    
    
}

 
