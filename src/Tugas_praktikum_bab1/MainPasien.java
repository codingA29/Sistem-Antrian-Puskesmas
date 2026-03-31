/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_praktikum_bab1;

/**
 * Driver class untuk menjalankan program tanpa constructor
 */
public class MainPasien {

    public static void main(String[] args) {

        // Membuat object tanpa constructor
        Pasien pasien1 = new Pasien();
        Pasien pasien2 = new Pasien();

        // Mengisi data menggunakan method
        pasien1.isiData("Andi", 20, "Demam");
        pasien2.isiData("Budi", 25, "Batuk");

        // Menampilkan data
        System.out.println("=== Sistem Antrian Puskesmas ===");
        pasien1.tampilkanData();

        System.out.println("--------------------------");

        pasien2.tampilkanData();
    }
}