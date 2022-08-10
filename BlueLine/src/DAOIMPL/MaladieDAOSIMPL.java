/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMPL;

import Connexion.SQLMeth;
import DAOS.MaladieDAOS;
import Includes.Maladie;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author MBS
 */
public class MaladieDAOSIMPL implements MaladieDAOS{
SQLMeth sqlm=new SQLMeth();
    @Override
    public int Maladieinsert(Maladie d) {
             int res= sqlm.doInsert("Maladie","M_Nom","'"+d.getM_Nom()+"'");
    return res;
    }

    @Override
    public int Maladieupdate(Maladie d) {
           String gg[]={"M_Nom"};
        String [] dd={"'"+d.getM_Nom()+"'"};
        int res = sqlm.doUpdate("SllType",gg,dd,String.valueOf(d.getM_Id()),"M_Id");
        return res;
    }

    @Override
    public int Maladiedelete(Maladie d) {
         int res =sqlm.doDelete("SllType","M_Id",String.valueOf(d.getM_Id()));
    return res;
    }

    @Override
    public void rempGrid(String chsql, JTable tblre, String[] att, JFrame ff) {
        sqlm.rempGrid( chsql,  tblre,att, ff);
    }

    @Override
    public Maladie getById(String chsql, JFrame ff) {
          String gg[]={"M_Id","M_Nom"};
      ArrayList<String> tab= sqlm.getById(chsql,gg,ff) ;
      Maladie d = new Maladie(Integer.parseInt(tab.get(0)),tab.get(1));
      return d;
    }
    
}
