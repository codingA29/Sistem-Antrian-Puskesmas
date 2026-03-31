/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_praktikum_bab1;

/**
 * Class Pasien untuk menyimpan data pasien
 */
public class Pasien {

    // Atribut
    String nama;
    int umur;
    String keluhan;

    // Constructor
    public Pasien(String nama, int umur, String keluhan) {
        this.nama = nama;
        this.umur = umur;
        this.keluhan = keluhan;
    }

    // Method untuk menampilkan data
    public void tampilkanData() {
        System.out.println("Nama Pasien : " + nama);
        System.out.println("Umur        : " + umur + " tahun");
        System.out.println("Keluhan     : " + keluhan);
    }
}