package Includes;
import java.util.*;


public class Departement {

   public int dep_Id;

   public String dep_Nom;

   public int getDep_Id() {
      return dep_Id;
   }

    @Override
    public String toString() {
        return dep_Nom ;
    }
   
   public Departement( ) {


   }
 public Departement(String dep_Nom) {

      this.dep_Nom = dep_Nom;
   }
   public Departement(int dep_Id, String dep_Nom) {
      this.dep_Id = dep_Id;
      this.dep_Nom = dep_Nom;
   }

   public void setDep_Id(int dep_Id) {
      this.dep_Id = dep_Id;
   }

   public String getDep_Nom() {
      return dep_Nom;
   }

   public void setDep_Nom(String dep_Nom) {
      this.dep_Nom = dep_Nom;
   }
}