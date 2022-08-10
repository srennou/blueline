/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
/**
 *
 * @author User
 */
public class Connexion {
    
    public static Connection getConnection(){
        String driver="com.mysql.cj.jdbc.Driver";
        String user="root";
        String password="root";
        String url="jdbc:mysql://localhost/blueline?serverTimezone=UTC";
        Connection cnx=null;
        try{
            Class.forName(driver);
            cnx =  DriverManager.getConnection(url, user, password);
        }
        catch(ClassNotFoundException ex){
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex){
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnx;
    }
//    public static void RempCombos(JComboBox cbo,String chsql,String champ){
//         try{
//  cbo.removeAllItems();
//          Statement instr = getConnection().createStatement();
//            ResultSet res = instr.executeQuery(chsql);
//            while(res.next()){
//                cbo.addItem(res.getString(""+champ+""));
//            }
//            
//
// }catch(SQLException ex){
//            cbo.addItem("aucun element");
//            }
//         }
      
                public static String Retouridstring(JComboBox cbo,String chsql,String champ){
         String id =null;
         try{
          Statement instr = getConnection().createStatement();
            ResultSet res = instr.executeQuery(chsql);
            if(res.next()){
                id=res.getString(""+champ+"");
            }
         return id;
         
         
         }catch(SQLException ex){
            return null;
         }
         
         }
}
