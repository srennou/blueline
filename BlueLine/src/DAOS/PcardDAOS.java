/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Includes.PCard;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author MBS
 */
public interface PcardDAOS {
      public int PCardinsert(PCard d);
    public int PCardupdate(PCard d);
    public int PCarddelete(PCard d);
     public void rempGrid(String chsql, JTable tblre,String[] att,JFrame ff);
    
     public PCard getById(String chsql,JFrame ff);
}
