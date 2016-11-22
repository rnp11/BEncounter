import java.util.*;


public class Fighter
{
   private int sPoints = 0;//skill points
   private int defHealth = 150;//default health
   private int defLevel = 1;//Default/starting level of fighter
   private int defMagic = 50;//default amount of magic in pool
   private int level;//level of fighter
   private int health;//health of fighter
   private int magic;//magic pool of fighter
   private int phyPwr;//Fighter physical attack power
   private int defPhy = 25;// default attack power
   private int defMag = 35;//default magic attack power
   private int magPwr;//Fighter magical attack power
   private int xp;//Experience Points
   private int defXp = 0;//Default XP to start at 0
   private int xpThreshold = 100;
   private int hpPool;
   private int mpPool;
   private String name;

   public Fighter()
   {
      health = defHealth;
      level = defLevel;
      magic = defMagic;
      xp = defXp;
      phyPwr = defPhy;
      magPwr = defMag;
   }
   
   public void addXPLevel(int newXP)// adds xp and increments level if threshold is met
   {
      xp = xp + newXP;
      int xpDiff = xpThreshold - xp;
      int xpCarry; 
      while(xp >= xpThreshold)
      {  
        
        xpCarry = newXP - xpDiff;
        this.setLevel(level+1);
        phyPwr += 5;
        magPwr += 6;
        this.setHealth(15);
        this.setMagic(10);
        xp = xpCarry;
        xpThreshold += 50;
        System.out.println(this.getName()+" has leveled up to "+this.getLevel());
      }   
         
   }
   
   
   public void setLevel(int lev)
   {
      level = lev;
   }  
   
   public int getLevel()
   {
      return level;
   }
   
   public void setHealth(int hp)
   {
      health += hp;
      hpPool = health;
   }
   
   public int getHealth()
   {
      return health;
   }
   
   public void setMagic(int mp)
   {
      magic += mp;
      mpPool = magic;
   }
   
   public int getMagic()
   {
      return magic;
   }
   
   public void resetHpPool()
   {
      hpPool = health;
   }
   public int getHpPool()
   {
      return hpPool;
   }
   
   public void resetMpPool()
   {
      mpPool = magic;
   }
   
   public int getMpPool()
   {
      return mpPool;
   }
   
   public void setName(String nam)
   {
      name = nam;
   }
   public String getName()
   {
      return name;
   }
   
   public void takeDamage(int dmg)
   {
      hpPool = hpPool - dmg;
      System.out.println(this.getName() + " takes " + dmg + " points in damage!");
      if(hpPool<= 0)
      {
         hpPool = 0;
         System.out.println(this.getName() + "'s HP has reached zero and has Died!");
         System.out.println("GAME OVER!!!");
         System.exit(0);
         
      }
      else
      {      
         
         System.out.println(this.getName()+"'s hp is now at "+ this.getHpPool()+"/"+this.getHealth()+".");
      }   
   }
   
   public void attack(Fighter target)
   {
      double atkMultiplyer = 2.5;
      double randAtk = (atkMultiplyer*Math.random());
      
      int dmg = (int)(phyPwr*randAtk);
      System.out.println(this.getName()+" attacks "+target.getName());
      if(randAtk < 1)
      {
         System.out.println(target.getName() + " Blocked the attack!!!");
      }
      else if(randAtk > 2)
      {
         System.out.println("CRITICAL HIT!!!");
      }
      else
      {
         System.out.println("Good hit!");
      }
               
      target.takeDamage(dmg);
      
   }
   /*****************************************************************/
   //TESTING THE CLASS
   public static void main(String[] args)
   {
      Fighter hero = new Fighter();
      hero.setName("hero");
      hero.setHealth(5);
      Fighter enemy = new Fighter();
      enemy.setName("BadGuy");
      enemy.setHealth(5);
      hero.addXPLevel(105);
      /*
      System.out.println("Hero Level = "+ hero.getLevel()+"\nHero health = "+hero.getHpPool()+"\nHero Magic = " + hero.getMpPool());
      enemy.attack(hero);
      System.out.println("Hero Level = "+ hero.getLevel()+"\nHero health = "+hero.getHpPool()+"\nHero Magic = " + hero.getMpPool());
      System.out.println("_________________________________________________________________________________");
      System.out.println("Enemy Level = "+ enemy.getLevel()+"\nEnemy health = "+enemy.getHpPool()+"\nEnemy Magic = " + enemy.getMpPool());
      hero.attack(enemy);
      System.out.println("Enemy Level = "+ enemy.getLevel()+"\nEnemy health = "+enemy.getHpPool()+"\nEnemy Magic = " + enemy.getMpPool());
      */for(int i = 0; i < 10; i++)
      {
         if(hero.getHpPool() > 0 && enemy.getHpPool() > 0)
         {
            System.out.println("****************");
            
            enemy.attack(hero);
            System.out.println("________________");
            hero.attack(enemy);
            System.out.println("****************");
         }
         else if(hero.getHpPool() > 0 && enemy.getHpPool() <= 0)
         {
            System.out.println(hero.getName()+" has Won!");
            break;
         }
         else if(enemy.getHpPool() > 0 && hero.getHpPool() <= 0)
         {
            System.out.println(enemy.getName()+" has Won! GAME OVER!!!");
            break;
         }
         else
         {
            System.out.println("Draw!");
            break;
         }      
      }   
   }
}
