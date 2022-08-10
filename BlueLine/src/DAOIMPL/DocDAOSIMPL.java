/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMPL;

import Connexion.Connexion;
import Connexion.SQLMeth;
import DAOS.DocDAOS;
import Includes.Departement;
import Includes.Docteur;
import Includes.Specialite;
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
public class DocDAOSIMPL implements DocDAOS {

    SQLMeth sqlm = new SQLMeth();
    private int d_Id, d_Nom, d_Prenom, d_Add, d_Tel, d_Cin, d_Sex, specialite, departement;

    @Override
    public int Docinsert(Docteur d) {
        String ss = " '" + d.getD_Nom() + "','" + d.getD_Prenom() + "','" + d.getD_Add() + "','" + d.getD_Tel() + "','" + d.getD_Cin() + "','" + d.getD_Sex() + "',"
                + "" + d.getSpecialite().getS_Id() + "," + d.getDepartement().getDep_Id() + "";
        int res = sqlm.doInsert("docteur", "d_Nom, d_Prenom,d_Add,d_Tel,d_Cin,d_Sex,specialite, departement", ss);
        return res;
    }

    @Override
    public int Docupdate(Docteur d) {
        String gg[] = {"d_Nom", "d_Prenom", "d_Add", "d_Tel", "d_Cin", "d_Sex", "specialite", "departement"};
        String[] dd = {"'" + d.getD_Nom() + "'", "'" + d.getD_Prenom() + "'", "'" + d.getD_Add() + "'", "'" + d.getD_Tel() + "'", "'" + d.getD_Cin() + "'", "'" + d.getD_Sex() + "'",
            "" + d.getSpecialite().getS_Id() + "", "" + d.getDepartement().getDep_Id() + ""};
        int res = sqlm.doUpdate("docteur", gg, dd, String.valueOf(d.getD_Id()), "d_Id");
        return res;
    }

    @Override
    public int Docdelete(Docteur d) {
        int res = sqlm.doDelete("docteur", "d_Id", String.valueOf(d.getD_Id()));
        return res;
    }

    @Override
    public void rempGrid(String chsql, JTable tblre, String[] att, JFrame ff) {
        sqlm.rempGrid(chsql, tblre, att, ff);
    }


    public PreparedStatement stmt = null;
    private int res;

    public Connection cnx = Connexion.getConnection();

    public Docteur getById(String id, JFrame ff) {
        Docteur dep = new Docteur();

        try {

            String chsql = "select * from  docteur where d_Id=" + id;
            stmt = cnx.prepareStatement(chsql);

            ResultSet res = stmt.executeQuery(chsql);
            if (res.next()) {

                dep.setD_Id(res.getInt("d_Id"));
             
                dep.setD_Nom(res.getString("D_NOM"));
                dep.setD_Prenom(res.getString("D_PRENOM"));
                dep.setD_Add(res.getString("D_ADD"));
                dep.setD_Tel(res.getString("D_TEL"));
                dep.setD_Cin(res.getString("D_CIN"));
                dep.setD_Sex(res.getString("D_SEX"));
                
                
                DeptDAOIMPL depao =new DeptDAOIMPL();
                Departement depar=depao.getById(String.valueOf(res.getInt("DEPARTEMENT")), ff);
                  SpecialiteDAOSIMPL spao =new SpecialiteDAOSIMPL();
                Specialite spar=spao.getById(String.valueOf(res.getInt("SPECIALITE")), ff);
   dep.setDepartement(depar);
                dep.setSpecialite(spar);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(ff, "erreur" + e);
        }

        return dep;
    }
}
