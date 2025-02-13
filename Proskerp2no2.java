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
public class Proskerp2no2 {
    public static void main(String[] args) {
         
    //membuat variabel dan Scanner
    String lampu;
    Scanner sc= new Scanner(System.in);
    
    //mengambil input
    System.out.print("Inputkan nama warna : ");    
    lampu = sc.nextLine();
    
    switch (lampu){
        case "merah":
            System.out.println("Lampu merah berhenti!");
            break;
        case "kuning":
            System.out.println("Lampu kuning hati-hati!");
            break;
        case "hijau":
            System.out.println("Lampu hijau jalan!");
            break;
        default :
            System.out.println("Warna lampu invalid!");
    }
    }
}
