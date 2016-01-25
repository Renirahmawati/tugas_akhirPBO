/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerInterfase;

import model.Modelmakanan;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author acer
 */
public interface InterfaceMakanan {
    Modelmakanan simpan(Modelmakanan o) throws SQLException;
    void hapus(String kode_makanan) throws SQLException;
    void edit (Modelmakanan o) throws SQLException;
    List<Modelmakanan> tampil() throws SQLException;
    
}

