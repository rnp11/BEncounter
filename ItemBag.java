import java.util.*;

public class ItemBag
{

   private ArrayList<Items> list = new ArrayList<Items>();
   private ArrayList<Items> mybag = new ArrayList<Items>();
   private Fighter f = new Fighter();
   private final int MAX_ITEMS= 5;
   private Items m;
   Scanner sc = new Scanner(System.in);
   
   public ItemBag()
   {
      for(int i=0; i<MAX_ITEMS; i++)
      {
         m = new Items(i);
         list.add(m);
      }
   }
   /*
      pulls one item out of the list and adds it to the bag
   */
   public void createBag()
   {
      int z = MAX_ITEMS;
      int k;
      for(int i = 0; i < MAX_ITEMS; i++)
      {
         k = (int)(z*Math.random() - 1);
         mybag.add(list.remove(k));
         z--;
      } 
   }
   /*
     use of the item before attack 
     
      
   */
     public void useItem()
   {
     System.out.println("If you would like to use an item press y. If no, press n.");
     sc.next();
     if(sc.next().equalsIgnoreCase("y"))
     {
         for(int i; i<=mybag.size(); i++)
           {
            System.out.print(i+1);
            System.out.println(m.toString());
            }
         System.out.println("Choose which item to use:");
         sc.nextInt();
         int placement=sc.nextInt();
         switch(placement){
            case 1: f.setHealth(m.getHPChange());
            case 2: f.setHealth(m.getHPChange());
            case 3: f.setHealth(m.getHPChange());
            case 4: f.setMagic(m.getMGChange()); 
            case 5: f.setMagic(m.getMGChange());
            case 6: f.setMagic(m.getMGChange());
         }
            
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