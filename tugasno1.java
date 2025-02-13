/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sibdm2p2;

import java.util.Scanner;

/**
 *
 * @author Astrid
 */
public class tugasno1 {
     public static void main(String[] args) {
        //deklarasikan variabel dan buat scanner
        Scanner ss = new Scanner(System.in); 
        int hargaBarang = 0;
        int totalHarga = 0;
            System.out.println("---------------------------------------");
            System.out.println("      Kharisma Agung Plaza < KAP >");
            System.out.println("        Promo Belanja Berhadiah");
            System.out.println("  Khusus Pembelian 5 Barang Pertama !");
            System.out.println("   Dengan harga minimum Rp 10000,00" );
            System.out.println("---------------------------------------");
        //input nama pembeli
            System.out.print("Masukkan nama pembeli : ");
        String namaPembeli = ss.nextLine();
            System.out.println("");  
        for(int i = 1; i <= 5; i++){
            System.out.print("Masukkan harga barang ke-" + i +" : ");
            //input barang
            hargaBarang  = ss.nextInt();
            //jumlah totalHarga
            totalHarga += hargaBarang; }
            System.out.println("Total harga pembelian atas nama " + namaPembeli + " adalah Rp " +totalHarga);
            System.out.println("");
        if(totalHarga >= 10000){
            System.out.println("SELAMATTTT...");
            System.out.println("Anda mendapatkan 1 buah mug cantik");
            System.out.println("");
            System.out.println("---------------------------------------");
            System.out.println("             TERIMA KASIH        ");
            System.out.println("  Anda sudah belanja di Kharisma Agung Plaza ");
        }
        
    }
}

    
 