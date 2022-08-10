/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Includes.*;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author MBS
 */
public interface LitDAOS {
         public int Litinsert(Lit d);
    public int Litupdate(Lit d);
    public int Litdelete(Lit d);
     public void rempGrid(String chsql, JTable tblre,String[] att,JFrame ff);

     public Lit getById(String chsql,JFrame ff);
}
