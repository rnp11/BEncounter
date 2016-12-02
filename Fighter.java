import java.util.*;
/**
Author: Matthew Baning
Co-Author: Robbyn Pocock and WenWen Xu
*/

public class Fighter
{
   private int sPoints = 0;//skill points
   private int defHealth = 250;//default health
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
   private String attribute;
   private String weakness;
   private String blocks;
   
   
   
   
   /**
   Default Constructor
   */
   public Fighter()
   {
      health = defHealth;
      level = defLevel;
      magic = defMagic;
      xp = defXp;
      phyPwr = defPhy;
      magPwr = defMag;
      hpPool = health;
      mpPool = magic;
   }
   /**
   Method: addXPLevel
   Purpose: adds experience to players current experience counter
            then when xp threshold is met, level is incremented 
            and player stats increase.
   */
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
   /**
   Method: setLevel()
   Purpose: manually set player level with out additional XP
            required.
   */
   public void setLevel(int lev)
   {
      level = lev;
   }  
   /**
   Method: getLevel()
   Purpose: Returns current level.   
   */
   public int getLevel()
   {
      return level;
   }
   /**
   Method: setHealth()
   Purpose: increments and sets health points
   */
   public void setHealth(int hp)
   {
      health += hp;
      hpPool = health;
   }
   /**
   Method: getHealth()
   Purpose: returns current max health
   */
   public int getHealth()
   {
      return health;
   }
   /**
   Method: setMagic()
   Purpose: increments and sets magic points
   */
   public void setMagic(int mp)
   {
      magic += mp;
      mpPool = magic;
   }
   /**
   Method: getMagic()
   Purpose: returns current max magic points
   */
   public int getMagic()
   {
      return magic;
   }
   /**
   Method: resetHpPool()
   Purpose: resets HP Pool to current max Health Points
   */
   public void resetHpPool()
   {
      hpPool = health;
   }
   /**
   Method: getHpPool()
   Purpose: returns current hp in HP Pool
   */
   public int getHpPool()
   {
      return hpPool;
   }
   /**
   Method: resetMpPool()
   Purpose: resets mp pool to current max Magic points
   */
   public void resetMpPool()
   {
      mpPool = magic;
   }
   /**
   Method: getMpPool()
   Purpose: return left over magic points
   */
   public int getMpPool()
   {
      return mpPool;
   }
   /**
   Method: setName()
   Purpose: Sets fighter's name
   */
   public void setName(String nam)
   {
      name = nam;
   }
   /**
   Method: getName()
   Purpose: returns fighter's name
   */
   public String getName()
   {
      return name;
   }
   /**
   Method: takeDamage()
   Purpose: implements damage to a target from an attack
   */
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
   /**
   Method: attack()
   Purpose: Calculates how much damage the attack will be and uses takeDamage() to implement the attack. uses phyPwr as multiplier
   */
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
      
   /**
   Method: magicAtk()
   Purpose: Similar to attack but uses skills instead and uses magPwr instead of phyPwr as its multilier
   */   
   public void magicAtk(Fighter target, magicSkill skill)
   {
      
      double atkMultiplyer = 2.5;
      double randAtk = (atkMultiplyer*Math.random());
      mpPool-=10;
      
      int dmg = (int)(magPwr*randAtk);
      System.out.println(this.getName()+" attacks "+target.getName()+" with "+skill.getSkillName());
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
      
      if(skill.getSkillAtrb().equalsIgnoreCase(target.getWeakness()))
      {
         System.out.println(target.getName()+" is weak against this type of attack and takes 2xDamage!");
         target.takeDamage(dmg*2);
      }
      else if(skill.getSkillAtrb().equalsIgnoreCase(target.getResist()))
      {
         System.out.println(target.getName()+" is resistant against this type of attack, Damage reduced!");
         target.takeDamage(dmg/2);
      }
      else            
      {   
         target.takeDamage(dmg);
      }
      System.out.println(this.getName()+"'s MP is now at "+ this.getMpPool()+"/"+this.getMagic());  
      
   }
   
   /**
   Method: setAttribute()
   Purpose: sets the attribute of the fighter. determins weakness and resistances
            resistances are called "blocks"
   */
   public void setAttribute(String atrb)
   {
      if(atrb.equalsIgnoreCase("fire"))
      {
         attribute = "fire";
         weakness = "water";
         blocks = "earth";  
      }
      else if(atrb.equalsIgnoreCase("water"))
      {
         attribute = "water";
         weakness = "air";
         blocks = "fire";//Resistance
      }
      else if(atrb.equalsIgnoreCase("air"))
      {
         attribute = "air";
         weakness = "earth";
         blocks = "water";
      }
      else if(atrb.equalsIgnoreCase("earth"))
      {
         attribute = "earth";
         weakness = "fire";
         blocks = "air";
      }
      else
      {
         attribute = "none";
         weakness = "none";
      }
         
   }
   /**
   Method: getResist()
   Purpose: returns blocks (resistance)
   */
   public String getResist()
   {
      return blocks;
   }
   /**
   Method: getAttribute()
   Purpose: retuns attribute
   */
   public String getAttribute()
   {
      return attribute;
   }
   /**
   Method: getWeakness()
   Purpose: returns weakness
   */
   public String getWeakness()
   {
      return weakness;
   }

}
