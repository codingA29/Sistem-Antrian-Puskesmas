/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_praktikum_bab1;

/**
 * Class MainPasien sebagai driver class
 * Digunakan untuk menjalankan program
 * dan membuat object dari class Pasien
 * 
 * @author USER
 */
public class MainPasien {

    public static void main(String[] args) {
        
        // Membuat object dari class Pasien
        Pasien pasien1 = new Pasien("Andi", 20, "Demam");
        Pasien pasien2 = new Pasien("Budi", 25, "Batuk");

        // Menampilkan data pasien
        System.out.println("=== Data Pasien Puskesmas ===");
        pasien1.tampilkanData();

        System.out.println("--------------------------");

        pasien2.tampilkanData();
    }
}