/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Includes.User;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author MBS
 */
public interface UserDAOS {
      public int Userinsert(User d);
    public int Userupdate(User d);
    public int Userdelete(User d);
     public void rempGrid(String chsql, JTable tblre,String[] att,JFrame ff);
     public User  getById(String chsql,JFrame ff);
}
