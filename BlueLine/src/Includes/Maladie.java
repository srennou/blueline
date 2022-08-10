package Includes;

import java.util.*;

public class Maladie {
   public int m_Id;
   public String m_Nom;

   public Maladie(int m_Id, String m_Nom) {
      this.m_Id = m_Id;
      this.m_Nom = m_Nom;
   }

   public int getM_Id() {
      return m_Id;
   }

   public void setM_Id(int m_Id) {
      this.m_Id = m_Id;
   }

   public String getM_Nom() {
      return m_Nom;
   }

   public void setM_Nom(String m_Nom) {
      this.m_Nom = m_Nom;
   }
}