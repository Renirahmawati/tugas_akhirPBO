/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author acer
 */
public class Modelmakanan {
    private String nama_makanan,kode_makanan;
    private float harga_makanan; 

   

   

    public String getKode_makanan() {
        return kode_makanan;
    }

    public void setKode_makanan(String kode_makanan) {
        this.kode_makanan = kode_makanan;
    }

    public String getNama_makanan() {
        return nama_makanan;
    }

    public void setNama_makanan(String nama_makanan) {
        this.nama_makanan = nama_makanan;
    }

    public float getHarga_makanan() {
        return harga_makanan;
    }

    public void setHarga_makanan(float harga_makanan) {
        this.harga_makanan = harga_makanan;
    }
           
}
