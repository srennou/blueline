/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMPL;

import Connexion.Connexion;
import Connexion.SQLMeth;
import DAOS.SllTypeDAOS;
import Includes.Departement;
import Includes.SllType;
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
public class SllTypeDAOSIMPL implements SllTypeDAOS{
SQLMeth sqlm=new SQLMeth();
    @Override
    public int SllTypeinsert(SllType d) {
    int res= sqlm.doInsert("SllType","ty_Nom","'"+d.getTy_Nom()+"'");
    return res;
    }

    @Override
    public int SllTypeupdate(SllType d) {
          String gg[]={"ty_Nom"};
        String [] dd={"'"+d.getTy_Nom()+"'"};
        int res = sqlm.doUpdate("SllType",gg,dd,String.valueOf(d.getTy_Id()),"Ty_Id");
        return res;
    }

    @Override
    public int SllTypedelete(SllType d) {
             int res =sqlm.doDelete("SllType","Ty_Id",String.valueOf(d.getTy_Id()));
    return res;
    }

    @Override
    public void rempGrid(String chsql, JTable tblre, String[] att, JFrame ff) {
       sqlm.rempGrid( chsql,  tblre,att, ff);
    }

         public PreparedStatement stmt=null;
    private  int res ;
 
    public Connection cnx =Connexion.getConnection();
         public SllType  getById(String id,JFrame ff) {
                     SllType  dep=new SllType();
                                    
         try{
    
 String chsql="select * from slltype where ty_id="+id;
    stmt=cnx.prepareStatement(chsql);

    ResultSet res =stmt.executeQuery(chsql);
    if(res.next()){
       
     dep.setTy_Id(res.getInt("ty_id")); 
     dep.setTy_Nom(res.getString("ty_nom")); 
    }
         }catch(SQLException e){
    JOptionPane.showMessageDialog(ff, "erreur"+e);}
       
    
        return dep;
    }
         
   
    public List<SllType> getAll() {
               List<SllType> gg= new ArrayList<>();

         try{
 
    sqlm.stmt=sqlm.cnx.prepareStatement("select * from slltype");

    ResultSet res =sqlm.stmt.executeQuery();
    while(res.next()){
       SllType s = new SllType();
       s.setTy_Id(res.getInt("ty_id"));
       s.setTy_Nom(res.getString("ty_nom"));
     gg.add(s);
    }
         }catch(SQLException e){
       
    
   
    }
        return gg;


}
    
}
