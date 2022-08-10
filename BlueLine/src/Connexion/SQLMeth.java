/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MBS
 */
public class SQLMeth {
    public PreparedStatement stmt=null;
    private  int res ;
    String chsql;
    public Connection cnx =Connexion.getConnection();

    public int doInsert(String table,String att,String values){
 
         try{
     chsql="insert into "+table+"("+att+") values("+values+")";
    stmt=cnx.prepareStatement(chsql);
       res =stmt.executeUpdate();
        return res;    
         }catch(SQLException e){
    return 0;}
    }
    
    public int doDelete(String table,String champ,String id){
 
         try{
     chsql="delete from "+table+" where "+champ+"= "+id+"";
    stmt=cnx.prepareStatement(chsql);
       res =stmt.executeUpdate();
        return res;    
         }catch(SQLException e){
    return 0;}
    }
     public int doUpdate(String table,String[] att,String[] values,String id,String champ){
 
                try{
     Connection cnx =Connexion.getConnection();
     

     chsql="update "+table+" set ";
    for(int i=0;i<att.length;i++){
        if(i+1==att.length){
            chsql+=" "+att[i]+" = "+values[i]+"  ";
        }else{
        chsql+=" "+att[i]+" = "+values[i]+" , ";
    }}
            chsql+= " where "+champ+" ="+id+"";
    stmt=cnx.prepareStatement(chsql);
       res =stmt.executeUpdate();
     return res;    
         }catch(SQLException e){
    return 0;}
        
    }
     public void rempGrid(String chsql, JTable tblre,String[] att,JFrame ff){
    try{
   
    stmt=cnx.prepareStatement(chsql);
   
        ResultSet res= stmt.executeQuery(chsql);
        DefaultTableModel d=(DefaultTableModel) tblre.getModel();
        while(d.getRowCount()>0){
                 d.removeRow(0);
            
        }
         while(res.next()){
                                 ArrayList<String> tbData=new ArrayList<String>() ;

             for(int i=0;i<att.length;i++){

                 tbData.add(res.getString(att[i]));
             }
          
            DefaultTableModel tbmodel=(DefaultTableModel) tblre.getModel();
            tbmodel.addRow(tbData.toArray());
            }

    }catch(SQLException e){
        JOptionPane.showMessageDialog(ff, "error"+e.getMessage());
    }
     }
     public ArrayList<String>  getById(String chsql,String[] champs,JFrame ff) {
                                                       
                ArrayList<String> tbData=new ArrayList<String>() ;
         try{
    
 
    stmt=cnx.prepareStatement(chsql);

    ResultSet res =stmt.executeQuery(chsql);
    
    if(res.next()){
       
       for(int i=1;i>=champs.length;i++){
            tbData.add(res.getString(i));
       }
    }
         }catch(SQLException e){
    JOptionPane.showMessageDialog(ff, "erreur"+e);}
       
    
        return tbData;
    }
     
     
//       public List<Object> getAll(String table,JFrame ff) {
//                                                       
//     
//
//         try{
// 
//    stmt=cnx.prepareStatement("select * from "+table+"");
//
//    ResultSet res =stmt.executeQuery();
//     List<Object> gg;
//    while(res.next()){
//       
//     //  gg.add(res.)
//    }
//         }catch(SQLException e){
//    JOptionPane.showMessageDialog(ff, "erreur"+e);}
//       
//    
//        return gg;
//    }
//     
            
  
}
