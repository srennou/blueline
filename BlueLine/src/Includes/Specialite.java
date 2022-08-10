package Includes;

import java.util.*;

public class Specialite {
   public int s_Id;
   public String s_Nom;

    @Override
    public String toString() {
        return s_Nom;
    }


   public Specialite(int s_Id, String s_Nom) {
      this.s_Id = s_Id;
      this.s_Nom = s_Nom;

   }
   public Specialite() {


   }
   public int getS_Id() {
      return s_Id;
   }

   public void setS_Id(int s_Id) {
      this.s_Id = s_Id;
   }

   public String getS_Nom() {
      return s_Nom;
   }

   public void setS_Nom(String s_Nom) {
      this.s_Nom = s_Nom;
   }
}