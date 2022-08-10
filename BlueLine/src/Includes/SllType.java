package Includes;

import java.util.*;

public class SllType {
   public int ty_Id;
   public String ty_Nom;

   public SllType(int ty_Id, String ty_Nom) {
      this.ty_Id = ty_Id;
      this.ty_Nom = ty_Nom;
   }

    @Override
    public String toString() {
        return  ty_Nom;
    }

    public SllType() {
    }

   public int getTy_Id() {
      return ty_Id;
   }

   public void setTy_Id(int ty_Id) {
      this.ty_Id = ty_Id;
   }

   public String getTy_Nom() {
      return ty_Nom;
   }

   public void setTy_Nom(String ty_Nom) {
      this.ty_Nom = ty_Nom;
   }
}