/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Includes.Docteur;
import Includes.MaladieCArd;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author MBS
 */
public interface MaladieCardDAOS {
      public int MaladieCArdinsert(MaladieCArd d);
    public int MaladieCArdupdate(MaladieCArd d);
    public int MaladieCArddelete(MaladieCArd d);
     public void rempGrid(String chsql, JTable tblre,String[] att,JFrame ff);

}
