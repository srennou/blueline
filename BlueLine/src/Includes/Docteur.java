package Includes;


import Includes.Patient;
import java.util.*;

public class Docteur {
   private int d_Id;
   private String d_Nom;
   private String d_Prenom;
   private String d_Add;
   private String d_Tel;
   private String d_Cin;
   private String d_Sex;

   private Specialite specialite;
   private Departement departement;

   public Docteur(int d_Id, String d_Nom, String d_Prenom, String d_Add, String d_Tel, String d_Cin, String d_Sex, Specialite specialite, Departement departement) {
      this.d_Id = d_Id;
      this.d_Nom = d_Nom;
      this.d_Prenom = d_Prenom;
      this.d_Add = d_Add;
      this.d_Tel = d_Tel;
      this.d_Cin = d_Cin;
      this.d_Sex = d_Sex;
      this.specialite = specialite;
      this.departement = departement;
   } public Docteur() {

   }

   public int getD_Id() {
      return d_Id;
   }

   public void setD_Id(int d_Id) {
      this.d_Id = d_Id;
   }

   public String getD_Nom() {
      return d_Nom;
   }

   public void setD_Nom(String d_Nom) {
      this.d_Nom = d_Nom;
   }

   public String getD_Prenom() {
      return d_Prenom;
   }

   public void setD_Prenom(String d_Prenom) {
      this.d_Prenom = d_Prenom;
   }

   public String getD_Add() {
      return d_Add;
   }

   public void setD_Add(String d_Add) {
      this.d_Add = d_Add;
   }

   public String getD_Tel() {
      return d_Tel;
   }

   public void setD_Tel(String d_Tel) {
      this.d_Tel = d_Tel;
   }

   public String getD_Cin() {
      return d_Cin;
   }

   public void setD_Cin(String d_Cin) {
      this.d_Cin = d_Cin;
   }

   public String getD_Sex() {
      return d_Sex;
   }

   public void setD_Sex(String d_Sex) {
      this.d_Sex = d_Sex;
   }

   public Specialite getSpecialite() {
      return specialite;
   }

   public void setSpecialite(Specialite specialite) {
      this.specialite = specialite;
   }

   public Departement getDepartement() {
      return departement;
   }

   public void setDepartement(Departement departement) {
      this.departement = departement;
   }
}