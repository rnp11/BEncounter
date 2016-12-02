import java.util.*;
/**
Author: Matthew Baning
Co-Author: Robbyn Pocock and WenWen Xu
*/
public class magicSkill
{

   private String skillName;
   private String skillAtrb;
   
   public magicSkill()
   {
      skillName = "None";
      skillAtrb = "None";
   }
   /**
   Method: attackSkill()
   Purpose: sets the skill name the an element to a new skill 
   */
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
   /**
   Method: getSkillName()
   Purpose: returns skill name
   */
   public String getSkillName()
   {
      return skillName;
   }
   /**
   Method: getSkillAtrb()
   Purpose: returns skill attribute
   */
   public String getSkillAtrb()
   {
      return skillAtrb;
   }
}