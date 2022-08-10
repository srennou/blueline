/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Includes.Patient;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author MBS
 */
public interface PatientDAOS {
       public int Patientinsert(Patient d);
    public int Patientupdate(Patient d);
    public int Patientdelete(Patient d);
     public void rempGrid(String chsql, JTable tblre,String[] att,JFrame ff);

     public Patient getById(String chsql,JFrame ff);
          public Patient getByCIN(String id,JFrame ff);

}
