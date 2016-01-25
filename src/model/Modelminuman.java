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
public class Modelminuman {
    private String nama_minuman,kode_minuman;

    public String getKode_minuman() {
        return kode_minuman;
    }

    public void setKode_minuman(String kode_minuman) {
        this.kode_minuman = kode_minuman;
    }
    private float harga_minuman; 

    public String getNama_minuman() {
        return nama_minuman;
    }

    public void setNama_minuman(String nama_minuman) {
        this.nama_minuman = nama_minuman;
    }

    public float getHarga_minuman() {
        return harga_minuman;
    }

    public void setHarga_minuman(float harga_minuman) {
        this.harga_minuman = harga_minuman;
    }
            
}

