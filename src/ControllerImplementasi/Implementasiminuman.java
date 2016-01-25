/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerImplementasi;

/**
 *
 * @author acer
 */
import ControllerInterfase.Interfaceminuman;
import Koneksi.Koneksi;
import model.Modelminuman;
import view.formminuman;
import java.sql.SQLException;
import java.util.List;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Modelmakanan;

public class Implementasiminuman implements Interfaceminuman{
    @Override
    public Modelminuman simpan(Modelminuman o) throws SQLException {
  
   PreparedStatement st = (PreparedStatement) 
   Koneksi.KoneksiDatabase().prepareStatement("insert into tbl_minuman (kode_minuman,nama,harga) VALUES (?,?,?)");
   st.setString(1,o.getKode_minuman());
   st.setString(2,o.getNama_minuman());
    st.setFloat(3,o.getHarga_minuman());
    st.executeUpdate();
    return o;
    }

    

    @Override
    public void edit(Modelminuman o) throws SQLException {
    PreparedStatement st = (PreparedStatement)
   Koneksi.KoneksiDatabase().prepareStatement("call editminuman(?,?,?)");
    st.setString(1,o.getNama_minuman());
    st.setFloat(2,o.getHarga_minuman());
    st.setString(3,o.getKode_minuman());
    st.executeUpdate();
    
    }

    @Override
    public List<Modelminuman> tampil() throws SQLException {
       Statement stm = (Statement) Koneksi.KoneksiDatabase().createStatement();
        ResultSet rst = stm.executeQuery("call tampilminuman");
        List <Modelminuman> Listpenerbit = new ArrayList<>();
        while (rst.next()){
        Modelminuman minum = new Modelminuman();
        minum.setKode_minuman(rst.getString("kode_minuman"));
        minum.setNama_minuman(rst.getString("nama"));
        minum.setHarga_minuman(rst.getFloat("harga"));
        Listpenerbit.add(minum);
        }
        return Listpenerbit;
    }

    @Override
    public void hapus(String kode_minuman) throws SQLException {
        PreparedStatement st = (PreparedStatement)
   Koneksi.KoneksiDatabase().prepareStatement("delete from tbl_minuman where kode_minuman='"+kode_minuman+"'");
     // st.setString(1, kode_minuman);
    st.executeUpdate();
    }
    
    
}
   
