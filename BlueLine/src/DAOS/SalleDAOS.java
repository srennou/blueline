/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Includes.Salle;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author MBS
 */
public interface SalleDAOS {
     public int Salleinsert(Salle d);
    public int Salleupdate(Salle d);
    public int Salledelete(Salle d);
     public void rempGrid(String chsql, JTable tblre,String[] att,JFrame ff);

     public Salle getById(String chsql,JFrame ff);
}
