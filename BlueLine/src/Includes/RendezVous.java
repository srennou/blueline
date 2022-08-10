package Includes;
import Includes.Docteur;


import java.util.*;

public class RendezVous {
   private int r_Id;
   private java.util.Date r_Date;
   private String r_Desc;
   private String r_Statut;
   private Docteur docteur;
   private Patient patient;

   public RendezVous(int r_Id, Date r_Date, String r_Desc, String r_Statut, Docteur docteur, Patient patient) {
      this.r_Id = r_Id;
      this.r_Date = r_Date;
      this.r_Desc = r_Desc;
      this.r_Statut = r_Statut;
      this.docteur = docteur;
      this.patient = patient;
   }

   public int getR_Id() {
      return r_Id;
   }

   public void setR_Id(int r_Id) {
      this.r_Id = r_Id;
   }

   public Date getR_Date() {
      return r_Date;
   }

   public void setR_Date(Date r_Date) {
      this.r_Date = r_Date;
   }

   public String getR_Desc() {
      return r_Desc;
   }

   public void setR_Desc(String r_Desc) {
      this.r_Desc = r_Desc;
   }

   public String getR_Statut() {
      return r_Statut;
   }

   public void setR_Statut(String r_Statut) {
      this.r_Statut = r_Statut;
   }

   public Docteur getDocteur() {
      return docteur;
   }

   public void setDocteur(Docteur docteur) {
      this.docteur = docteur;
   }

   public Patient getPatient() {
      return patient;
   }

   public void setPatient(Patient patient) {
      this.patient = patient;
   }
}