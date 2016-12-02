/**
Main Program to run BattleEncounter

Author: Matthew Baning
Co-Author: WenWen Xu and Robbyn Pocock
*/   
public class BEncounterMain
{
   
   public static void main(String[] args)
   {
      BattleEncounter newGame = new BattleEncounter();
      
      do
      {
         newGame.Encounter();
         newGame.gameMenu();
      
      }
      while(newGame.hero.getHealth()>0);
      
   
   }
}   