/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerInterfase;

import java.sql.SQLException;
import java.util.List;
import model.ModelTransaksi;
import model.Modelmakanan;
import model.Modelminuman;

/**
 *
 * @author acer
 */
public interface InterfaceTransaksi {
    ModelTransaksi simpan(ModelTransaksi o) throws SQLException;
    void hapus(String kode_transaksi) throws SQLException;
    void edit (ModelTransaksi o) throws SQLException;
    List<Modelmakanan> tampil() throws SQLException;
    List<Modelminuman> tampil2() throws SQLException;
}
