/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMPL;

import Connexion.Connexion;
import Connexion.SQLMeth;
import DAOS.PatientDAOS;
import Includes.Departement;
import Includes.Patient;
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
public class PatientDAOSIMPL implements PatientDAOS{
  
  SQLMeth sqlm=new SQLMeth();
    @Override
    public int Patientinsert(Patient d) {
        String ss=" '"+d.getP_Nom()+"','"+d.getP_Prenom()+"','"+d.getP_Cin()+"','"+d.getD_Add()+"','"+d.getP_Tel()+"','"+d.getP_Sex()+"'";
     int res= sqlm.doInsert("Patient","p_Nom,p_Prenom,p_Cin,d_Add,p_Tel,p_Sex",ss);
    return res;
    }

    @Override
    public int Patientupdate(Patient d) {
                 String gg[]={"p_Nom","p_Prenom","p_Cin","d_Add","p_Tel","p_Sex"};
        String [] dd={"'"+d.getP_Nom()+"'","'"+d.getP_Prenom()+"'","'"+d.getP_Cin()+"'","'"+d.getD_Add()+"'","'"+d.getP_Tel()+"'","'"+d.getP_Sex()+"'"};
        int res = sqlm.doUpdate("Patient",gg,dd,String.valueOf(d.getP_Id()),"p_Id");
        return res;
    }

    @Override
    public int Patientdelete(Patient d) {
      int res =sqlm.doDelete("Patient","p_Id",String.valueOf(d.getP_Id()));
    return res;
    }

    @Override
    public void rempGrid(String chsql, JTable tblre, String[] att, JFrame ff) {
         sqlm.rempGrid( chsql,  tblre,att, ff);
    }

   
      public PreparedStatement stmt=null;
    private  int res ;
 
    public Connection cnx =Connexion.getConnection();
         public Patient  getById(String id,JFrame ff) {
                     Patient  dep=new Patient();
                                    
         try{
    
 String chsql="select * from patient where p_Id="+id;
    stmt=cnx.prepareStatement(chsql);

    ResultSet res =stmt.executeQuery(chsql);
    if(res.next()){
       
     dep.setP_Id(res.getInt("p_Id")); 
     dep.setP_Nom(res.getString("p_Nom")); 
      dep.setP_Prenom(res.getString("p_Prenom")); 
       dep.setP_Cin(res.getString("p_Cin")); 
        dep.setD_Add(res.getString("d_Add")); 
         dep.setP_Tel(res.getString("p_Tel")); 
          dep.setP_Sex(res.getString("p_Sex")); 
    }
         }catch(SQLException e){
    JOptionPane.showMessageDialog(ff, "erreur"+e);}
       
    
        return dep;
    }   
        

    @Override
    public Patient getByCIN(String id, JFrame ff) {
        Patient  dep=new Patient();
                                    
         try{
    
 String chsql="select * from patient where p_cin='"+id+"'";
    stmt=cnx.prepareStatement(chsql);

    ResultSet res =stmt.executeQuery(chsql);
    if(res.next()){
       
     dep.setP_Id(res.getInt("p_Id")); 
     dep.setP_Nom(res.getString("p_Nom")); 
      dep.setP_Prenom(res.getString("p_Prenom")); 
       dep.setP_Cin(res.getString("p_Cin")); 
        dep.setD_Add(res.getString("d_Add")); 
         dep.setP_Tel(res.getString("p_Tel")); 
          dep.setP_Sex(res.getString("p_Sex")); 
    }
         }catch(SQLException e){
    JOptionPane.showMessageDialog(ff, "erreur"+e);}
       
    
        return dep;    }
}
