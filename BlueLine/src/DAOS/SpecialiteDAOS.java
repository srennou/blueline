/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Includes.Specialite;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author MBS
 */
public interface SpecialiteDAOS {
       public int Specialiteinsert(Specialite d);
    public int Specialiteupdate(Specialite d);
    public int Specialitedelete(Specialite d);
     public void rempGrid(String chsql, JTable tblre,String[] att,JFrame ff);
public   List<Specialite> getAll();
     public Specialite getById(String chsql,JFrame ff);

}
