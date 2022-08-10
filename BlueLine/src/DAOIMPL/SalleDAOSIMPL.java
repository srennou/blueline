/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMPL;

import Connexion.Connexion;
import Connexion.SQLMeth;
import DAOS.SalleDAOS;
import Includes.*;
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
public class SalleDAOSIMPL implements SalleDAOS{
   SQLMeth sqlm=new SQLMeth();
    @Override
    public int Salleinsert(Salle d) {
      String ss=" "+d.getSll_Num()+","+d.getSll_Etage()+","+d.getDepartement().getDep_Id()+","+d.getSllType().getTy_Id()+"";
     int res= sqlm.doInsert("salle","sll_Num,sll_Etage,departement,sllType",ss);
    return res;
    }

    @Override
    public int Salleupdate(Salle d) {
        String gg[]={"sll_Num","sll_Etage","departement","sllType"};
        String [] dd={""+d.getSll_Num()+"",""+d.getSll_Etage()+"",""+d.getDepartement().getDep_Id()+"",""+d.getSllType().getTy_Id()+""};
        int res = sqlm.doUpdate("salle",gg,dd,String.valueOf(d.getSll_Id()),"sll_Id");
        return res;
    }

    @Override
    public int Salledelete(Salle d) {
       int res =sqlm.doDelete("salle","sll_Id",String.valueOf(d.getSll_Id()));
    return res;
    }

    @Override
    public void rempGrid(String chsql, JTable tblre, String[] att, JFrame ff) {
        sqlm.rempGrid( chsql,  tblre,att, ff);
    }


      
      
      
       public PreparedStatement stmt=null;
    private  int res ;
 
    public Connection cnx =Connexion.getConnection();
         public Salle  getById(String id,JFrame ff) {
                     Salle  dep=new Salle();
                                    
         try{
    
 String chsql="select * from salle where sll_id="+id;
    stmt=cnx.prepareStatement(chsql);

    ResultSet res =stmt.executeQuery(chsql);
    if(res.next()){
       
     dep.setSll_Id(res.getInt("sll_Id")); 
        dep.setSll_Num(res.getInt("sll_Num")); 
           dep.setSll_Etage(res.getInt("sll_Etage")); 
           
            DeptDAOIMPL depao =new DeptDAOIMPL();
                Departement depar=depao.getById(String.valueOf(res.getInt("DEPARTEMENT")), ff);
                  SllTypeDAOSIMPL spao =new SllTypeDAOSIMPL();
                SllType spar=spao.getById(String.valueOf(res.getInt("sllType")), ff);
   dep.setDepartement(depar);
                dep.setSllType(spar);
           
           
           
           
              dep.setDepartement(depar); 
    }
         }catch(SQLException e){
    JOptionPane.showMessageDialog(ff, "erreur"+e);}
       
    
        return dep;
    }
     
      
      
      
      
        public List<Salle> getAll(JFrame ff) {
               List<Salle> gg= new ArrayList<>();

         try{
 
    sqlm.stmt=sqlm.cnx.prepareStatement("select * from Salle");

    ResultSet res =sqlm.stmt.executeQuery();
    while(res.next()){
       Salle s = new Salle();
       s.setSll_Id(res.getInt("SLL_ID"));
       
        
          s.setSll_Num(res.getInt("sll_Num"));
       s.setSll_Etage(res.getInt("SLL_ETAGE"));
       
            SllTypeDAOSIMPL depao =new SllTypeDAOSIMPL();
                SllType depar=depao.getById(String.valueOf(res.getInt("sllType")), ff);
                 s.setSllType(depar);
                    DeptDAOIMPL depaos =new DeptDAOIMPL();
                Departement depars=depaos.getById(String.valueOf(res.getInt("DEPARTEMENT")), ff);
                s.setDepartement(depars);
     gg.add(s);
    }
         }catch(SQLException e){
       
    
   
    }
        return gg;


}
}
