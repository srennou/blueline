package Includes;

import java.util.*;

public class Patient {
   public int p_Id;
   public String p_Nom;
   public String p_Prenom;
   public String p_Cin;
   public String d_Add;
   public String p_Tel;
   public String p_Sex;

   public Patient(int p_Id, String p_Nom, String p_Prenom, String p_Cin, String d_Add, String p_Tel, String p_Sex) {
      this.p_Id = p_Id;
      this.p_Nom = p_Nom;
      this.p_Prenom = p_Prenom;
      this.p_Cin = p_Cin;
      this.d_Add = d_Add;
      this.p_Tel = p_Tel;
      this.p_Sex = p_Sex;
   }

    public Patient() {
    }

   public int getP_Id() {
      return p_Id;
   }

   public void setP_Id(int p_Id) {
      this.p_Id = p_Id;
   }

   public String getP_Nom() {
      return p_Nom;
   }

   public void setP_Nom(String p_Nom) {
      this.p_Nom = p_Nom;
   }

   public String getP_Prenom() {
      return p_Prenom;
   }

   public void setP_Prenom(String p_Prenom) {
      this.p_Prenom = p_Prenom;
   }

   public String getP_Cin() {
      return p_Cin;
   }

   public void setP_Cin(String p_Cin) {
      this.p_Cin = p_Cin;
   }

   public String getD_Add() {
      return d_Add;
   }

   public void setD_Add(String d_Add) {
      this.d_Add = d_Add;
   }

   public String getP_Tel() {
      return p_Tel;
   }

   public void setP_Tel(String p_Tel) {
      this.p_Tel = p_Tel;
   }

   public String getP_Sex() {
      return p_Sex;
   }

   public void setP_Sex(String p_Sex) {
      this.p_Sex = p_Sex;
   }
}