package Includes;

import java.util.*;

public class User {
   public int u_Id;
   public String u_Nom;
   public String u_Prenom;
   public String u_Tel;
   public String u_Add;
   public String u_Pass;
   public String u_Role;

   public User(int u_Id, String u_Nom, String u_Prenom, String u_Tel, String u_Add, String u_Pass, String u_Role) {
      this.u_Id = u_Id;
      this.u_Nom = u_Nom;
      this.u_Prenom = u_Prenom;
      this.u_Tel = u_Tel;
      this.u_Add = u_Add;
      this.u_Pass = u_Pass;
      this.u_Role = u_Role;
   }

   public User(){
       
   }

   public int getU_Id() {
      return u_Id;
   }

   public void setU_Id(int u_Id) {
      this.u_Id = u_Id;
   }

   public String getU_Nom() {
      return u_Nom;
   }

   public void setU_Nom(String u_Nom) {
      this.u_Nom = u_Nom;
   }

   public String getU_Prenom() {
      return u_Prenom;
   }

   public void setU_Prenom(String u_Prenom) {
      this.u_Prenom = u_Prenom;
   }

   public String getU_Tel() {
      return u_Tel;
   }

   public void setU_Tel(String u_Tel) {
      this.u_Tel = u_Tel;
   }

   public String getU_Add() {
      return u_Add;
   }

   public void setU_Add(String u_Add) {
      this.u_Add = u_Add;
   }

   public String getU_Pass() {
      return u_Pass;
   }

   public void setU_Pass(String u_Pass) {
      this.u_Pass = u_Pass;
   }

   public String getU_Role() {
      return u_Role;
   }

   public void setU_Role(String u_Role) {
      this.u_Role = u_Role;
   }
}