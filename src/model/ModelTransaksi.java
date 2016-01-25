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
public class ModelTransaksi {
    private String nama_makanan,kode_makanan,kode_transaksi,nama,tanggal;
    private float harga_makanan,total;

    public String getNama_makanan() {
        return nama_makanan;
    }

    public void setNama_makanan(String nama_makanan) {
        this.nama_makanan = nama_makanan;
    }

    public String getKode_makanan() {
        return kode_makanan;
    }

    public void setKode_makanan(String kode_makanan) {
        this.kode_makanan = kode_makanan;
    }

    public String getKode_transaksi() {
        return kode_transaksi;
    }

    public void setKode_transaksi(String kode_transaksi) {
        this.kode_transaksi = kode_transaksi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public float getHarga_makanan() {
        return harga_makanan;
    }

    public void setHarga_makanan(float harga_makanan) {
        this.harga_makanan = harga_makanan;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
}
