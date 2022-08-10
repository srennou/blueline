package Includes;

import java.util.*;

public class PCard {
   public int pc_Id;
   public String pc_Desc;

   public PCard(int pc_Id, String pc_Desc) {
      this.pc_Id = pc_Id;
      this.pc_Desc = pc_Desc;

   }

   public int getPc_Id() {
      return pc_Id;
   }

   public void setPc_Id(int pc_Id) {
      this.pc_Id = pc_Id;
   }

   public String getPc_Desc() {
      return pc_Desc;
   }

   public void setPc_Desc(String pc_Desc) {
      this.pc_Desc = pc_Desc;
   }

}