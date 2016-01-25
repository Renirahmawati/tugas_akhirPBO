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

import ControllerInterfase.InterfaceMakanan;
import Koneksi.Koneksi;
import model.Modelmakanan;
import view.forminputanmakanan;
import java.sql.SQLException;
import java.util.List;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Implementasimakanan implements InterfaceMakanan{

    
     @Override
    public Modelmakanan simpan(Modelmakanan o) throws SQLException {
  
   PreparedStatement st = (PreparedStatement) 
   Koneksi.KoneksiDatabase().prepareStatement("insert into tbl_makanan (kode_makanan,nama,harga) VALUES (?,?,?)");
   st.setString(1,o.getKode_makanan());
   st.setString(2,o.getNama_makanan());
    st.setFloat(3,o.getHarga_makanan());
    st.executeUpdate();
    return o;
    }

    

    @Override
    public void edit(Modelmakanan o) throws SQLException {
    PreparedStatement st = (PreparedStatement)
   Koneksi.KoneksiDatabase().prepareStatement("call editmakanan(?,?,?)");
    //JOptionPane.showMessageDialog(null,getKode_Makana);
    st.setString(1,o.getNama_makanan());
    st.setFloat(2,o.getHarga_makanan());
    st.setString(3,o.getKode_makanan());
    st.executeUpdate();
    
    }

    @Override
    public List<Modelmakanan> tampil() throws SQLException {
       Statement stm = (Statement) Koneksi.KoneksiDatabase().createStatement();
        ResultSet rst = stm.executeQuery("call Tampil");
        List <Modelmakanan> Listpenerbit = new ArrayList<>();
        while (rst.next()){
        //Modelmakanan makan = new Modelmakanan();
         Modelmakanan makan= new Modelmakanan();
        Object data = new Object();
        makan.setKode_makanan(rst.getString("kode_makanan"));
        makan.setNama_makanan(rst.getString("nama"));
        makan.setHarga_makanan(rst.getFloat("harga"));
        Listpenerbit.add(makan);
        }
        return Listpenerbit;
    }

    @Override
    public void hapus(String kode_makanan) throws SQLException {
        PreparedStatement st = (PreparedStatement)
                
               
   Koneksi.KoneksiDatabase().prepareStatement("delete from tbl_makanan where kode_makanan='"+kode_makanan+"' ");
      //st.setString(1, kode_makanan);
        // JOptionPane.showMessageDialog(null, kode_makanan);
    st.executeUpdate();
    }
    
    
}
