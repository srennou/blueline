package Includes;

import java.util.*;

public class Salle {
   public int sll_Id;
   public int sll_Num;
   public int sll_Etage;
   public Departement departement;
   public SllType sllType;

   public Salle(int sll_Id, int sll_Num, int sll_Etage, Departement departement, SllType sllType) {
      this.sll_Id = sll_Id;
      this.sll_Num = sll_Num;
      this.sll_Etage = sll_Etage;
      this.departement = departement;
      this.sllType = sllType;
   }

    @Override
    public String toString() {
        return ""+sll_Num ;
    }

    public Salle() {
    }

   public int getSll_Id() {
      return sll_Id;
   }

   public void setSll_Id(int sll_Id) {
      this.sll_Id = sll_Id;
   }

   public int getSll_Num() {
      return sll_Num;
   }

   public void setSll_Num(int sll_Num) {
      this.sll_Num = sll_Num;
   }

   public int getSll_Etage() {
      return sll_Etage;
   }

   public void setSll_Etage(int sll_Etage) {
      this.sll_Etage = sll_Etage;
   }

   public Departement getDepartement() {
      return departement;
   }

   public void setDepartement(Departement departement) {
      this.departement = departement;
   }

   public SllType getSllType() {
      return sllType;
   }

   public void setSllType(SllType sllType) {
      this.sllType = sllType;
   }
}