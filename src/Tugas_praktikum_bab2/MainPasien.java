/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_praktikum_bab2;

/**
 * Driver class untuk menjalankan program
 * menggunakan constructor
 */
public class MainPasien {

    public static void main(String[] args) {

        // Membuat object + langsung isi data lewat constructor
        Pasien pasien1 = new Pasien("Andi", 20, "Demam");
        Pasien pasien2 = new Pasien("Budi", 25, "Batuk");

        // Menampilkan data
        System.out.println("=== Sistem Antrian Puskesmas ===");
        pasien1.tampilkanData();

        System.out.println("--------------------------");

        pasien2.tampilkanData();
    }
}