/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minggu2;

import java.util.Scanner;

/**
 *
 * @author Astrid
 */
public class Proskerp1no4 {
    public static void main(String[] args) {
   
//Buat Scanner
        Scanner s1 = new Scanner(System.in);
        
//Ambil nilai dari keyboard
        System.out.print("Maukkan nilai1 = ");
        int nilai1 = s1.nextInt();
        System.out.print("Masukkan nilai2 = ");
        int nilai2 = s1.nextInt();
        
//Hitung dan Print
        int jumlah = nilai1 + nilai2;
        System.out.println("Jumlah = " +jumlah);
    }
}
