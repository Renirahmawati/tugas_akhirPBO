/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerInterfase;

import model.Modelminuman;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author acer
 */
public interface Interfaceminuman {
    Modelminuman simpan(Modelminuman o) throws SQLException;
    void hapus(String kode_makanana) throws SQLException;
    void edit (Modelminuman o) throws SQLException;
    List<Modelminuman> tampil() throws SQLException;
}
