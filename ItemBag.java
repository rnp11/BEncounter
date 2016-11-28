import java.util.*;

public class ItemBag
{

   private ArrayList<Items> list = new ArrayList<Items>();
   private final int MAX_ITEMS= 15;
   private Items m;
   
   public ItemBag(Items thing)
   {
      for(int i=0; i<MAX_ITEMS; i++)
      {
         m = new Items(i);
         list.add(m);
      }
      
   }
   
   
   public static void main(String[] args)
   {
      ArrayList<Items> bag1 = new ArrayList<Items>();;
      ItemBag bag = new ItemBag();
      for(int i = 0; i < 5; i++)
      {
         bag1.add(bag.ItemBag());
         System.out.println(i);
      }   
     } 
}