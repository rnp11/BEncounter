<<<<<<< HEAD
import java.util.*;

/*****
   Creates a single item
   
@author Robbyn Pocock
@coauthor Matt Baning and WenWen Xu
   
@version 1.0
*****/
=======
/*
Group 8
Item.java
*/
>>>>>>> c6d1ada68a5480f9a30eda8135d802b09c8c463b

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
      method: Items(int number)
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
   /*
      method: getHPChange()
      gets how much the item changes HP
      
   */
   public int getHPChange()
   {
      return HPChange;
   }
   /*
      method: getMGChange()
      gets how much the item changes MG
   */
   public int getMGChange()
   {
      return MGChange;
   }
   /*
      method: setHPChange(int hp)
      sets hp 
   */
   public void setHPChange(int hp)
   {
      HPChange = hp;
   }
   /*
      method: setMGChange(int mg)
      sets mg
   */
   public void setMGChange(int mg)
   {
      MGChange = mg;
   }   
   
   /*
      method: getName()
      getter
   */
   public String getName()
   {
      return name;
   }  
   /*
      method: toString()
      toString method
   */
   public String toString()
   {
      return name + "MG Change: "+ MGChange + " HP Change: " + HPChange;
   }
     
   
}
