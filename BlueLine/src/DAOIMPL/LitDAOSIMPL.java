/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMPL;

import Connexion.Connexion;
import Connexion.SQLMeth;
import DAOS.LitDAOS;
import Includes.Departement;
import Includes.Lit;
import Includes.Salle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author MBS
 */
public class LitDAOSIMPL implements LitDAOS{
SQLMeth sqlm=new SQLMeth();
    @Override
    public int Litinsert(Lit d) {
         String ss=" "+d.getL_Num()+","+d.getL_Statuts()+","+d.getSalle().getSll_Id()+"";
     int res= sqlm.doInsert("Lit","l_Num,l_Statuts,salle",ss);
    return res;
    }

    @Override
    public int Litupdate(Lit d) {
      String gg[]={"l_Num","l_Statuts","salle"};
        String [] dd={""+d.getL_Num()+"","'"+d.getL_Statuts()+"'",""+d.getSalle().getSll_Id()+""};
        int res = sqlm.doUpdate("Lit",gg,dd,String.valueOf(d.getL_Id()),"l_Id");
        return res;
    }

    @Override
    public int Litdelete(Lit d) {
              int res =sqlm.doDelete("Lit","l_Id",String.valueOf(d.getL_Id()));
    return res;
    }

    @Override
    public void rempGrid(String chsql, JTable tblre, String[] att, JFrame ff) {
        sqlm.rempGrid( chsql,  tblre,att, ff);
    }

  
 
           public PreparedStatement stmt=null;
    private  int res ;
 
    public Connection cnx =Connexion.getConnection();
         public Lit  getById(String id,JFrame ff) {
                     Lit  dep=new Lit();
                                    
         try{
    
 String chsql="select * from Lit where l_id="+id;
    stmt=cnx.prepareStatement(chsql);

    ResultSet res =stmt.executeQuery(chsql);
    if(res.next()){
       
     dep.setL_Id(res.getInt("L_ID")); 
     dep.setL_Num(res.getInt("L_NUM")); 
          
           SalleDAOSIMPL depao =new SalleDAOSIMPL();
                Salle depar=depao.getById(String.valueOf(res.getInt("salle")), ff);
                    dep.setSalle(depar); 

          
               dep.setL_Statuts(res.getString("L_STATUTS")); 
    }
         }catch(SQLException e){
    JOptionPane.showMessageDialog(ff, "erreur"+e);}
       
    
        return dep;
    }
     
    
}
