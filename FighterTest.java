   /****************************************************************
   Author: Matthew Baning
   Co-Author: WenWen Xu and Robbyn Pocock
   
   //TESTING THE CLASS
   //changed testing class to implement a magical attack instead of physical
   //this will loop a battle sequence(menu and implemenation will be in the battle encounter class)
   */
public class FighterTest
{
   
   public static void main(String[] args)
   {
      magicSkill fire = new magicSkill();
      magicSkill water = new magicSkill();
      magicSkill air = new magicSkill();
      magicSkill earth = new magicSkill();
      
   
      fire.attackSkill(1);
      water.attackSkill(2);
      air.attackSkill(3);
      earth.attackSkill(4);
   
      Fighter hero = new Fighter();
      /**
      Testing: setName() and getName()
      Expecting: name should be set to hero, and should be printed to screen
      */
      hero.setName("hero");
      hero.getName();
      hero.setHealth(5);
      Fighter enemy = new Fighter();
      enemy.setName("BadGuy");
      /**
      Testing: setHealth() and getHealth()
      Expecting:(health should equal 255)
      */
      enemy.setHealth(5);
      enemy.getHealth();
      /**
      Testing: addXPLevel(); adding 105 to current xp (from 0 at level 1)
      Expecting: Player should level up to level 2: should print to screen "hero has leveled up to 2"
      */
      hero.addXPLevel(105);
      /**
      Testing: setAttribute() and getAttribute()
      Expecting: attribute should print as earth
      */
      enemy.setAttribute("earth");
      enemy.getAttribute();
      /**
      Testing: running fighter class
      
      */
      for(int i = 0; i < 10; i++)
      {
         if(hero.getHpPool() > 0 && enemy.getHpPool() > 0)
         {
            System.out.println("****************");
            /**
            Testing: attack() and magicAtk()
            Expecting: enemy should attack hero and decrement damage from Hero HP
                       hero should use a skill and decrement damage from enemy HP
            */           
            enemy.attack(hero);
            System.out.println("________________");
            hero.magicAtk(enemy, fire);
            System.out.println("****************");
            /**
            End attack() and magicAtk() test
            */
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