 import java.util.*;
 
public class BattleEncounter
{
   protected Fighter hero  = new Fighter();
   private Fighter enFire = new Fighter();
   private Fighter enWater = new Fighter();
   private Fighter enAir = new Fighter();
   private Fighter enEarth = new Fighter();
   private Fighter enemy = new Fighter();
   Scanner sc = new Scanner(System.in);
   private int skillOpt;
   private int menuOpt;
   final int MAX_ENTYPE = 4; 
   Fighter[] enemyList = {enFire, enWater, enAir, enEarth};
   magicSkill fire = new magicSkill();
   magicSkill water = new magicSkill();
   magicSkill air = new magicSkill();
   magicSkill earth = new magicSkill();
      
   
   
   
   
   public BattleEncounter()
   {
      
      //Setting Fighter name Defaults
      hero.setName("The Hero");
      enFire.setName("Fire Demon");
      enWater.setName("Water Serpent");
      enAir.setName("Razor Wing");
      enEarth.setName("Sand Worm");
      
      //Setting Enemy Attributes
      enFire.setAttribute("Fire");
      enWater.setAttribute("Water");
      enAir.setAttribute("Air");
      enEarth.setAttribute("Earth");
      
      enFire.setHealth(5);
      enWater.setHealth(5);
      enAir.setHealth(5);
      enEarth.setHealth(5);
      
      hero.setHealth(5);
      hero.setMagic(10);
      
      fire.attackSkill(1);
      water.attackSkill(2);
      air.attackSkill(3);
      earth.attackSkill(4);
   }
   //Method that sets and encounters a random enemy
   public void Encounter()
   {
      int randEnemy = (int)(Math.random()*3);
      enemy = enemyList[randEnemy];
      System.out.println("You have encountered a " + enemy.getName());
   }
   //menu that gives action options
   public void gameMenu()
   {
      
      do
      {
         System.out.println("__________________________________________________");
         enemy.attack(hero);
         System.out.println("__________________________________________________");
         System.out.println("What action would you like to perform?");
         System.out.println("1-Attack\t2-Use Item\n3-Use Skill\t4-Exit and Quit");
         menuOpt = sc.nextInt();
         this.useOption(hero, enemy, menuOpt);
      }
      
      while(enemy.getHealth()>0);
      
        
   }
   //method to use options from menu
   public void useOption(Fighter guy,Fighter target, int opt)
   {
      
      {
         if(opt == 1)
         {
            guy.attack(target);
         }
         else if(opt == 2)
         {
            System.out.println("No Items at this time!");
            
         }
         else if(opt == 3)
         {
            System.out.println("Which Skill would you like to use?");
            System.out.println("1-Flame Strike\t2-Water Blast");
            System.out.println("3-Aero Blade\t4-Earthquake");
            skillOpt = sc.nextInt();
            if(skillOpt == 1)
            {
               
               guy.magicAtk(target, fire);
                
            }
            else if(skillOpt == 2)
            {
               guy.magicAtk(target, water);
            }
            else if(skillOpt == 3)
            {
               guy.magicAtk(target, air);
            }
            else
            {
               guy.magicAtk(target, earth);
            }
         }   
         else
         {
            System.exit(0);   
         }
      }   
               
   }  
   
   
   
   
}