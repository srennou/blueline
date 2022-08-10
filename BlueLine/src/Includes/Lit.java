package Includes;

import java.util.*;

public class Lit {
   public int l_Id;
   public int l_Num;
   public String l_Statuts;
   public Salle salle;

   public Lit(int l_Id, int l_Num, String l_Statuts, Salle salle) {
      this.l_Id = l_Id;
      this.l_Num = l_Num;
      this.l_Statuts = l_Statuts;
      this.salle = salle;
   }

    public Lit() {
      
    }

   public int getL_Id() {
      return l_Id;
   }

   public void setL_Id(int l_Id) {
      this.l_Id = l_Id;
   }

   public int getL_Num() {
      return l_Num;
   }

   public void setL_Num(int l_Num) {
      this.l_Num = l_Num;
   }

   public String getL_Statuts() {
      return l_Statuts;
   }

   public void setL_Statuts(String l_Statuts) {
      this.l_Statuts = l_Statuts;
   }

   public Salle getSalle() {
      return salle;
   }

   public void setSalle(Salle salle) {
      this.salle = salle;
   }
}