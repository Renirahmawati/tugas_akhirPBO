/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerImplementasi;

import ControllerInterfase.InterfaceTransaksi;
import Koneksi.Koneksi;
import com.mysql.jdbc.Statement;
import com.sun.media.sound.ModelTransform;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ModelTransaksi;
import model.Modelmakanan;
import model.Modelminuman;

/**
 *
 * @author acer
 */
public class ImplemantasiTransaksi implements InterfaceTransaksi{

    @Override
    public ModelTransaksi simpan(ModelTransaksi o) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hapus(String kode_transaksi) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(ModelTransaksi o) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Modelmakanan> tampil() throws SQLException {
        //To change body of generated methods, choose Tools | Templates.
         Statement stm = (Statement) Koneksi.KoneksiDatabase().createStatement();
        ResultSet rst = stm.executeQuery("call Tampil");
        List <Modelmakanan> Listmakanan = new ArrayList<>();
        while (rst.next()){
        //Modelmakanan makan = new Modelmakanan();
         Modelmakanan makan= new Modelmakanan();
        Object data = new Object();
        makan.setKode_makanan(rst.getString("kode_makanan"));
        makan.setNama_makanan(rst.getString("nama"));
        makan.setHarga_makanan(rst.getFloat("harga"));
        Listmakanan.add(makan);
        }
        return Listmakanan;
    }

    @Override
    public List<Modelminuman> tampil2() throws SQLException {
          Statement stm = (Statement) Koneksi.KoneksiDatabase().createStatement();
        ResultSet rst = stm.executeQuery("call tampilminuman");
        List <Modelminuman> Listmakanan = new ArrayList<>();
        while (rst.next()){
        Modelminuman minum = new Modelminuman();
        minum.setKode_minuman(rst.getString("kode_minuman"));
        minum.setNama_minuman(rst.getString("nama"));
        minum.setHarga_minuman(rst.getFloat("harga"));
        Listmakanan.add(minum);
        }
        return Listmakanan; //To change body of generated methods, choose Tools | Templates.
    }
    
}
