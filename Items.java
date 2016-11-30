import java.util.*;


public class Items
{
  
   String name;
   private Items m;
   private int number,HPChange, MGChange;
   private int random= (int)(Math.random() * 25+1);
   
   
   /*
      default constructor
   */
   public Items()
   {
       number=0;
       name= "No Item";  
   }
   
   /*
      constructor
   */
   public Items(int number)
   {
      if(number<=3)
         name="Health Potion";
      else
         name="Magic Potion";
      if (name.equals("Health Potion"))
      {
           setHPChange(random);  
      }else{
         setMGChange(random);
      }   
   }
   
   public int getHPChange()
   {
      return HPChange;
   }
   public int getMGChange()
   {
      return MGChange;
   }
   public void setHPChange(int hp)
   {
      HPChange = hp;
   }
   public void setMGChange(int mg)
   {
      MGChange = mg;
   }   
   
   /*
      getter
   */
   public String getName()
   {
      return name;
   }  
   
   public String toString()
   {
      return name;
   }
     
   
}