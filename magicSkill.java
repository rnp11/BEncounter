import java.util.*;

public class magicSkill
{

   private String skillName;
   private String skillAtrb;
   
   public magicSkill()
   {
      skillName = "None";
      skillAtrb = "None";
   }
   
   
  
   
   public void attackSkill(int skillNum)
   {
      if(skillNum == 1)
      {
         skillName = "Flame Strike";
         skillAtrb = "Fire";
      }
      else if(skillNum == 2)
      {
         skillName = "Water Blast";
         skillAtrb = "Water";
      }
      else if(skillNum == 3)
      {
         skillName = "Aero Blade";
         skillAtrb = "Air";
      }
      else if(skillNum == 4)
      {
         skillName = "Earthquake";
         skillAtrb = "Earth";
      }
   }
   
   public String getSkillName()
   {
      return skillName;
   }
    public String getSkillAtrb()
   {
      return skillAtrb;
   }
}