import java.util.*;


public class Items
{
  
   String name;
   private Items m;
<<<<<<< HEAD
   private int number,addhp;
=======
   private int number;
>>>>>>> b9db69ec0bcfd5b37c821fb07ec1005976db4d4f
   
   
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
   
<<<<<<< HEAD
   public String toString()
   {
      return name;
   }
=======
  
>>>>>>> b9db69ec0bcfd5b37c821fb07ec1005976db4d4f
     
   
}