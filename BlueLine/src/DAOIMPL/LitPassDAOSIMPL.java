/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMPL;

import Connexion.SQLMeth;
import DAOS.LitPassDAOS;
import Includes.Docteur;
import Includes.Lit;
import Includes.LitPass;
import Includes.Patient;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author MBS
 */
public class LitPassDAOSIMPL implements LitPassDAOS{
SQLMeth sqlm=new SQLMeth();
 public int lp_Id,lp_Dated,lp_Datef,lp_Statut,lit,patient, docteur;
    @Override
    public int LitPassinsert(LitPass d) {
 String ss=" '"+d.getLp_Dated()+"','"+d.getLp_Datef()+"','"+d.getLp_Statut()+"',"+d.getPatient().getP_Id()+","+d.getDocteur().getD_Id()+"";
     int res= sqlm.doInsert("LitPass","lp_Dated,lp_Datef,lp_Statut,lit,patient, docteur",ss);
    return res;
    }

    @Override
    public int LitPassupdate(LitPass d) {
      String gg[]={"lp_Dated","lp_Datef","lp_Statut","lit","patient", "docteur"};
        String [] dd={"'"+d.getLp_Dated()+"'","'"+d.getLp_Datef()+"'","'"+d.getLp_Statut()+"'",""+d.getPatient().getP_Id()+"",""+d.getDocteur().getD_Id()+""};
        int res = sqlm.doUpdate("LitPass",gg,dd,String.valueOf(d.getLp_Id()),"lp_Id");
        return res;
    }

    @Override
    public int LitPassdelete(LitPass d) {
        int res =sqlm.doDelete("LitPass","lp_Id",String.valueOf(d.getLp_Id()));
    return res;
    }

    @Override
    public void rempGrid(String chsql, JTable tblre, String[] att, JFrame ff) {
         sqlm.rempGrid( chsql,  tblre,att, ff);
    }

    @Override
    public LitPass getById(String chsql, JFrame ff) {
      String gg[]={"lp_Id","lp_Dated","lp_Datef","lp_Statut","lit","patient", "docteur"};
      ArrayList<String> tab = sqlm.getById(chsql,gg,ff) ;
      //
      LitDAOSIMPL st=new LitDAOSIMPL();
      Lit li=st.getById("select * from lit where l_id="+Integer.parseInt(tab.get(4)), ff);
       PatientDAOSIMPL stt=new PatientDAOSIMPL();
      Patient pt=stt.getById("select * from patient where p_id="+Integer.parseInt(tab.get(5)), ff);
          DocDAOSIMPL sttt=new DocDAOSIMPL();
      Docteur ddt=sttt.getById("select * from docteur where d_id="+Integer.parseInt(tab.get(6)), ff);
      //
      LitPass d = new LitPass(Integer.parseInt(tab.get(0)),Date.valueOf(tab.get(1)),Date.valueOf(tab.get(2)),tab.get(3),li,pt,ddt);
      return d;
    }

}
