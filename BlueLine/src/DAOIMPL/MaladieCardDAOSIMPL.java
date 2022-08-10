/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMPL;

import Connexion.SQLMeth;
import DAOS.MaladieCardDAOS;
import Includes.Maladie;
import Includes.MaladieCArd;
import Includes.PCard;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author MBS
 */
public class MaladieCardDAOSIMPL implements MaladieCardDAOS{
  SQLMeth sqlm=new SQLMeth();
    @Override
    public int MaladieCArdinsert(MaladieCArd d) {
            String ss=" "+d.getpCard().getPc_Id()+","+d.getMaladie().getM_Id()+"";
     int res= sqlm.doInsert("MaladieCard"," pCard,maladie",ss);
    return res;
    }

    @Override
    public int MaladieCArdupdate(MaladieCArd d) {
        return 0;
    }

    @Override
    public int MaladieCArddelete(MaladieCArd d) {
      int res =sqlm.doDelete("MaladieCard","pCard",String.valueOf(d.getpCard().getPc_Id())+" and maladie = "+String.valueOf(d.getMaladie().getM_Id()));
    return res;
    }

    @Override
    public void rempGrid(String chsql, JTable tblre, String[] att, JFrame ff) {
        sqlm.rempGrid( chsql,  tblre,att, ff);
    }

}
