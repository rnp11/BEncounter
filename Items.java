import java.util.*;


public class Items
{
  
   String name;
   private Items m;
   private int number;
   
   
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
      if(number<=7)
         name="Health Potion";
      else
         name="Magic Potion";   
   }
   
   /*
      getter
   */
   public String getName()
   {
      return name;
   }  
   
  
     
   
}