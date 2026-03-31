/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_praktikum_bab2;

/**
 * Class Pasien untuk menyimpan data pasien
 */
public class Pasien {

    String nama;
    int umur;
    String penyakit;

    // Constructor
    public Pasien(String nama, int umur, String penyakit) {
        this.nama = nama;
        this.umur = umur;
        this.penyakit = penyakit;
    }

    // Method tampilkan data
    void tampilkanData() {
        System.out.println("Nama     : " + nama);
        System.out.println("Umur     : " + umur);
        System.out.println("Penyakit : " + penyakit);
    }
}
