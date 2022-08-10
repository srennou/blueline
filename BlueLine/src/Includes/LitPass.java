package Includes;

import Includes.Docteur;
import Includes.*;
import java.util.*;

public class LitPass {
   public int lp_Id;
   public java.util.Date lp_Dated;
   public java.util.Date lp_Datef;
   public String lp_Statut;
   public Lit lit;
   public Patient patient;
   public Docteur docteur;

   public LitPass(int lp_Id, Date lp_Dated, Date lp_Datef, String lp_Statut, Lit lit, Patient patient, Docteur docteur) {
      this.lp_Id = lp_Id;
      this.lp_Dated = lp_Dated;
      this.lp_Datef = lp_Datef;
      this.lp_Statut = lp_Statut;
      this.lit = lit;
      this.patient = patient;
      this.docteur = docteur;
   }

   public int getLp_Id() {
      return lp_Id;
   }

   public void setLp_Id(int lp_Id) {
      this.lp_Id = lp_Id;
   }

   public Date getLp_Dated() {
      return lp_Dated;
   }

   public void setLp_Dated(Date lp_Dated) {
      this.lp_Dated = lp_Dated;
   }

   public Date getLp_Datef() {
      return lp_Datef;
   }

   public void setLp_Datef(Date lp_Datef) {
      this.lp_Datef = lp_Datef;
   }

   public String getLp_Statut() {
      return lp_Statut;
   }

   public void setLp_Statut(String lp_Statut) {
      this.lp_Statut = lp_Statut;
   }

   public Lit getLit() {
      return lit;
   }

   public void setLit(Lit lit) {
      this.lit = lit;
   }

   public Patient getPatient() {
      return patient;
   }

   public void setPatient(Patient patient) {
      this.patient = patient;
   }

   public Docteur getDocteur() {
      return docteur;
   }

   public void setDocteur(Docteur docteur) {
      this.docteur = docteur;
   }
}