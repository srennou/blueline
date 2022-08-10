/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMPL;

import Connexion.Connexion;
import Connexion.SQLMeth;
import DAOS.UserDAOS;
import Includes.Departement;
import Includes.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author MBS
 */
public class UserDAOSIMPL implements UserDAOS{
   SQLMeth sqlm=new SQLMeth();
    @Override
    public int Userinsert(User d) {
        String ss=" '"+d.getU_Nom()+"','"+d.getU_Prenom()+"','"+d.getU_Tel()+"','"+d.getU_Add()+"','"+d.getU_Pass()+"','"+d.getU_Role()+"'";
     int res= sqlm.doInsert("User","u_Nom,u_Prenom,u_Tel,u_Add,u_Pass,u_Role",ss);
    return res;
    }

    @Override
    public int Userupdate(User d) {
                       String gg[]={"u_Nom","u_Prenom","u_Tel","u_Add","u_Pass","u_Role"};
        String [] dd={"'"+d.getU_Nom()+"'","'"+d.getU_Prenom()+"'","'"+d.getU_Tel()+"'","'"+d.getU_Add()+"'","'"+d.getU_Pass()+"'","'"+d.getU_Role()+"'"};
        int res = sqlm.doUpdate("User",gg,dd,String.valueOf(d.getU_Id()),"u_Id");
        return res;
    }

    @Override
    public int Userdelete(User d) {
          int res =sqlm.doDelete("User","u_Id",String.valueOf(d.getU_Id()));
    return res;
    }

    @Override
    public void rempGrid(String chsql, JTable tblre, String[] att, JFrame ff) {
     sqlm.rempGrid( chsql,  tblre,att, ff);
    }


      
      
           public PreparedStatement stmt=null;
    private  int res ;
 
    public Connection cnx =Connexion.getConnection();
         public User  getById(String id,JFrame ff) {
                     User  dep=new User();
                                    
         try{
    
 String chsql="select * from user where u_id="+id;
    stmt=cnx.prepareStatement(chsql);

    ResultSet res =stmt.executeQuery(chsql);
    if(res.next()){
     dep.setU_Id(res.getInt("u_Id")); 
     dep.setU_Nom(res.getString("u_Nom")); 
     dep.setU_Prenom(res.getString("u_Prenom")); 
          dep.setU_Tel(res.getString("u_Tel")); 
               dep.setU_Add(res.getString("u_Add")); 
                    dep.setU_Pass(res.getString("u_Pass")); 
                        dep.setU_Role(res.getString("u_Role")); 
    }
         }catch(SQLException e){
    JOptionPane.showMessageDialog(ff, "erreur"+e);}
       
    
        return dep;
    }
     

    
}
