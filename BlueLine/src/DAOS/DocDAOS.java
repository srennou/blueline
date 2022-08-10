/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Includes.Departement;
import Includes.Docteur;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author MBS
 */
public interface DocDAOS {
     public int Docinsert(Docteur d);
    public int Docupdate(Docteur d);
    public int Docdelete(Docteur d);
     public void rempGrid(String chsql, JTable tblre,String[] att,JFrame ff);

     public Docteur getById(String chsql,JFrame ff);
}
