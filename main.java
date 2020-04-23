public class main
{
   public static void main(String arg[])
   {
      //the following part is to demostrate operator class 
      operator opt1 = new operator("operator1");
      opt1.createTournamentInfo("Style", "ExpertRatingFormula");
      opt1.showTournamentInfo();
      opt1.manageTournamentInfo("newStyle","NewFormula");
      
      //the following part is to demostrate spectator class
      spectator spt1 = new spectator(1111, "newSpectator");
      spt1.showInfo();
      spt1.spectateGame("GAME");
      spt1.showSpectatingGame();
   }
   
}