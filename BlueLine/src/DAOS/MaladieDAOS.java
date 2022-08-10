/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Includes.Maladie;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author MBS
 */
public interface MaladieDAOS {
         public int Maladieinsert(Maladie d);
    public int Maladieupdate(Maladie d);
    public int Maladiedelete(Maladie d);
     public void rempGrid(String chsql, JTable tblre,String[] att,JFrame ff);
     public Maladie getById(String chsql,JFrame ff);
}
