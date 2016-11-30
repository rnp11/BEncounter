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
            case 1: m.getHPChange() + f.setHealth();
            case 2: m.getHPChange() + f.setHealth();
            case 3: m.getHPChange() + f.setHealth();
            case 4: m.getMGChange() + f.setMagic(); 
            case 5: m.getMGChange() + f.setMagic();
            case 6: m.getMGChange() + f.setMagic();
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