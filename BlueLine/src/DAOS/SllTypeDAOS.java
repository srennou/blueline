/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Includes.SllType;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author MBS
 */
public interface SllTypeDAOS {
    public int SllTypeinsert(SllType d);
    public int SllTypeupdate(SllType d);
    public int SllTypedelete(SllType d);
     public void rempGrid(String chsql, JTable tblre,String[] att,JFrame ff);

     public SllType getById(String chsql,JFrame ff);

}
