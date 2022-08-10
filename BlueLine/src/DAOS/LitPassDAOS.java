/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Includes.Docteur;
import Includes.LitPass;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author MBS
 */
public interface LitPassDAOS {
         public int LitPassinsert(LitPass d);
    public int LitPassupdate(LitPass d);
    public int LitPassdelete(LitPass d);
     public void rempGrid(String chsql, JTable tblre,String[] att,JFrame ff);
     public LitPass getById(String chsql,JFrame ff);
    
}
