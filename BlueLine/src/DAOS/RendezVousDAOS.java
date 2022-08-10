/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Includes.RendezVous;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author MBS
 */
public interface RendezVousDAOS {
     public int RendezVousinsert(RendezVous d);
    public int RendezVousupdate(RendezVous d);
    public int RendezVousdelete(RendezVous d);
     public void rempGrid(String chsql, JTable tblre,String[] att,JFrame ff);

     public RendezVous getById(String chsql,JFrame ff);
}
