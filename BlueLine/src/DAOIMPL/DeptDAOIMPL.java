/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMPL;

import Connexion.Connexion;
import Connexion.SQLMeth;
import DAOS.DeptDAO;
import Includes.Departement;
import Includes.Specialite;
import static java.lang.String.valueOf;
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
public class DeptDAOIMPL implements DeptDAO{
SQLMeth sqlm=new SQLMeth();
    @Override
    public int Deptinsert(Departement d) {
       int res= sqlm.doInsert("Departement","dep_Nom","'"+d.getDep_Nom()+"'");
    return res;
    }

    @Override
    public int Deptupdate(Departement d) {
        String gg[]={"dep_Nom"};
        String [] dd={"'"+d.getDep_Nom()+"'"};
        int res = sqlm.doUpdate("Departement",gg,dd,String.valueOf(d.getDep_Id()),"Dep_Id");
        return res;
    }

    @Override
    public int Deptdelete(Departement d) {
        int res =sqlm.doDelete("Departement","Dep_Id",String.valueOf(d.getDep_Id()));
    return res;
    }

    @Override
    public void rempGrid(String chsql, JTable tblre, String[] att, JFrame ff) {
       sqlm.rempGrid( chsql,  tblre,att, ff);
    }


  
    
    public List<Departement> getAll() {
               List<Departement> gg= new ArrayList<>();

         try{
 
    sqlm.stmt=sqlm.cnx.prepareStatement("select * from Departement");

    ResultSet res =sqlm.stmt.executeQuery();
    while(res.next()){
       Departement s = new Departement();
       s.setDep_Id(res.getInt("dep_Id"));
       s.setDep_Nom(res.getString("dep_nom"));
     gg.add(s);
    }
         }catch(SQLException e){
       
    
   
    }
        return gg;


}
    
       public PreparedStatement stmt=null;
    private  int res ;
 
    public Connection cnx =Connexion.getConnection();
         public Departement  getById(String id,JFrame ff) {
                     Departement  dep=new Departement();
                                    
         try{
    
 String chsql="select * from departement where dep_id="+id;
    stmt=cnx.prepareStatement(chsql);

    ResultSet res =stmt.executeQuery(chsql);
    if(res.next()){
       
     dep.setDep_Id(res.getInt("dep_id")); 
     dep.setDep_Nom(res.getString("dep_nom")); 
    }
         }catch(SQLException e){
    JOptionPane.showMessageDialog(ff, "erreur"+e);}
       
    
        return dep;
    }
     
    
}
