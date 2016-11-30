import java.util.*;

public class ItemBag
{

   private ArrayList<Items> list = new ArrayList<Items>();
   private ArrayList<Items> mybag = new ArrayList<Items>();
   private Fighter f = new Fighter();
   private final int MAX_ITEMS= 6;
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
      pulls one item out of the list and adds it to the bag randomly
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
   
   public Items giveOne()
   {
      int first = 0;
      Items t = mybag.get(first);
      mybag.remove(first);
      return t;
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
         for(int i=0;i<=mybag.size(); i++)
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
    
    
     
     public void reset()
     {
       while(mybag.size() != 0 )
      {
         this.giveOne();
      }
      list = new ArrayList<Items>();;
      mybag = new ArrayList<Items>();;
      for(int i = 0; i < MAX_ITEMS; i++)
      {
         Items g = new Items();
         list.add(g);
      }
      this.createBag(); 
      }

     
   public static void main(String[] args)
   {
      ArrayList<Items> bag1 = new ArrayList<Items>();;
      ItemBag bag = new ItemBag();
      bag.createBag();
      for(int i = 0; i < 5; i++)
      {
         bag1.add(bag.giveOne());
      }   
      System.out.println(bag1.toString());
      bag.reset();
     
      for(int i= 0; i<5;i++)
         bag1.add(bag.giveOne());
         
      System.out.println(bag1.toString());   
     } 
}