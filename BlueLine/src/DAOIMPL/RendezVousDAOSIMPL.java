/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMPL;

import Connexion.SQLMeth;
import DAOS.RendezVousDAOS;
import Includes.Docteur;
import Includes.Patient;
import Includes.RendezVous;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author MBS
 */
public class RendezVousDAOSIMPL implements RendezVousDAOS{
      SQLMeth sqlm=new SQLMeth();
   private int r_Id,r_Date,r_Desc,r_Statut,docteur,patient;

    @Override
    public int RendezVousinsert(RendezVous d) {
                 String ss=" '"+d.getR_Date()+"','"+d.getR_Desc()+"','"+d.getR_Statut()+"',"+d.getDocteur().getD_Id()+","+d.getPatient().getP_Id()+"";
     int res= sqlm.doInsert("RendezVous","r_Date,r_Desc,r_Statut,docteur,patient",ss);
    return res;
    }

    @Override
    public int RendezVousupdate(RendezVous d) {
            String gg[]={"r_Date","r_Desc","r_Statut","docteur","patient"};
        String [] dd={"'"+d.getR_Date()+"'","'"+d.getR_Desc()+"'","'"+d.getR_Statut()+"'",""+d.getDocteur().getD_Id()+"",""+d.getPatient().getP_Id()+""};
        int res = sqlm.doUpdate("RendezVous",gg,dd,String.valueOf(d.getR_Id()),"r_Id");
        return res;
    }

    @Override
    public int RendezVousdelete(RendezVous d) {
     int res =sqlm.doDelete("RendezVous","r_Id",String.valueOf(d.getR_Id()));
    return res;    }

    @Override
    public void rempGrid(String chsql, JTable tblre, String[] att, JFrame ff) {
        sqlm.rempGrid( chsql,  tblre,att, ff);
    }

    @Override
    public RendezVous getById(String chsql, JFrame ff) {
            String gg[]={"r_Id","r_Date","r_Desc","r_Statut","docteur","patient"};
      ArrayList<String> tab = sqlm.getById(chsql,gg,ff) ;
      //

       PatientDAOSIMPL stt=new PatientDAOSIMPL();
      Patient pt=stt.getById("select * from patient where p_id="+Integer.parseInt(tab.get(5)), ff);
          DocDAOSIMPL sttt=new DocDAOSIMPL();
      Docteur ddt=sttt.getById("select * from docteur where d_id="+Integer.parseInt(tab.get(6)), ff);
      //
      RendezVous d = new RendezVous(Integer.parseInt(tab.get(0)),Date.valueOf(tab.get(1)),tab.get(2),tab.get(3),ddt,pt);
      return d;
    }
    
}
