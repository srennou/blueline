/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMPL;

import Connexion.SQLMeth;
import DAOS.PcardDAOS;
import Includes.PCard;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author MBS
 */
public class PcardDAOSIMPL implements PcardDAOS{
SQLMeth sqlm=new SQLMeth();
    @Override
    public int PCardinsert(PCard d) {
         String ss=" '"+d.getPc_Desc()+"'";
     int res= sqlm.doInsert("Pcard","pc_Desc",ss);
    return res;
    }

    @Override
    public int PCardupdate(PCard d) {
            String gg[]={"pc_Desc"};
        String [] dd={"'"+d.getPc_Desc()+"'"};
        int res = sqlm.doUpdate("Pcard",gg,dd,String.valueOf(d.getPc_Id()),"pc_Id");
        return res;
    }

    @Override
    public int PCarddelete(PCard d) {
              int res =sqlm.doDelete("Pcard","pc_Id",String.valueOf(d.getPc_Id()));
    return res;
    }

    @Override
    public void rempGrid(String chsql, JTable tblre, String[] att, JFrame ff) {
            sqlm.rempGrid( chsql,  tblre,att, ff);
    }

    @Override
    public PCard getById(String chsql, JFrame ff) {
              String gg[]={"pc_Id","pc_Desc"};
      ArrayList<String> tab = sqlm.getById(chsql,gg,ff) ;
      PCard d = new PCard(Integer.parseInt(tab.get(0)),tab.get(1));
      return d;
    }
    
}
