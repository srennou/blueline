/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;
import Includes.Departement;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTable;
/**
 *
 * @author MBS
 */
public interface DeptDAO {
    public int Deptinsert(Departement d);
    public int Deptupdate(Departement d);
    public int Deptdelete(Departement d);
     public void rempGrid(String chsql, JTable tblre,String[] att,JFrame ff);
     public   List<Departement> getAll();
     public Departement getById(String chsql,JFrame ff);
    
}
