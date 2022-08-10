/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMPL;

import Connexion.Connexion;
import Connexion.SQLMeth;
import DAOS.SpecialiteDAOS;
import Includes.Departement;
import Includes.Specialite;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author MBS
 */
public class SpecialiteDAOSIMPL implements SpecialiteDAOS {

    SQLMeth sqlm = new SQLMeth();

    @Override
    public int Specialiteinsert(Specialite d) {
        int res = sqlm.doInsert("Specialite", "S_Nom", "'" + d.getS_Nom() + "'");
        return res;
    }

    @Override
    public int Specialiteupdate(Specialite d) {
        String gg[] = {"S_Nom"};
        String[] dd = {"'" + d.getS_Nom() + "'"};
        int res = sqlm.doUpdate("Specialite", gg, dd, String.valueOf(d.getS_Id()), "S_Id");
        return res;
    }

    @Override
    public int Specialitedelete(Specialite d) {
        int res = sqlm.doDelete("Specialite", "S_Id", String.valueOf(d.getS_Id()));
        return res;
    }

    @Override
    public void rempGrid(String chsql, JTable tblre, String[] att, JFrame ff) {
        sqlm.rempGrid(chsql, tblre, att, ff);
    }





    @Override
    public List<Specialite> getAll() {
               List<Specialite> gg= new ArrayList<>();

         try{
 
    sqlm.stmt=sqlm.cnx.prepareStatement("select * from specialite");

    ResultSet res =sqlm.stmt.executeQuery();
    while(res.next()){
       Specialite s = new Specialite();
       s.setS_Id(res.getInt("s_id"));
       s.setS_Nom(res.getString("s_nom"));
     gg.add(s);
    }
         }catch(SQLException e){
       
    
   
    }
        return gg;


}
   
     
       public PreparedStatement stmt=null;
    private  int res ;
 
    public Connection cnx =Connexion.getConnection();
         public Specialite  getById(String id,JFrame ff) {
                     Specialite  dep=new Specialite();
                                    
         try{
    
 String chsql="select * from Specialite where s_id="+id;
    stmt=cnx.prepareStatement(chsql);

    ResultSet res =stmt.executeQuery(chsql);
    if(res.next()){
       
     dep.setS_Id(res.getInt("s_id")); 
     dep.setS_Nom(res.getString("s_nom")); 
    }
         }catch(SQLException e){
    JOptionPane.showMessageDialog(ff, "erreur"+e);}
       
    
        return dep;
    }
}