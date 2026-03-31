/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_praktikum_bab1;

/**
 * Class Pasien tanpa constructor
 * Data diisi menggunakan method setter
 */
public class Pasien {

    // Atribut
    String nama;
    int umur;
    String keluhan;
    int nomorAntrian;

    // Static untuk nomor antrian otomatis
    static int counter = 1;

    /**
     * Method untuk mengisi data pasien
     */
    public void isiData(String nama, int umur, String keluhan) {
        this.nama = nama;
        this.umur = umur;
        this.keluhan = keluhan;

        // Nomor antrian otomatis
        this.nomorAntrian = counter;
        counter++;
    }

    /**
     * Method untuk menampilkan data pasien
     */
    public void tampilkanData() {
        System.out.println("Nomor Antrian : " + nomorAntrian);
        System.out.println("Nama Pasien   : " + nama);
        System.out.println("Umur          : " + umur + " tahun");
        System.out.println("Keluhan       : " + keluhan);
    }
}