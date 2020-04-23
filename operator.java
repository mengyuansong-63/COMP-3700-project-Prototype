public class operator
{
   private String name;
   public tournamentInfo info;
   
   //The following part is for management part
   //The following part is for tournament manage
   
   /*@param string name define the name of operator*/
   public operator(String name)
   {
      this.name = name;
      System.out.println("You have created a new operator "+ this.name);
   }
   /*send game update to all player*/
   public void sendGameUpdateInfo()
   {
      System.out.println("Already send updateInfo to all players");
   }
   /*  create a new tournamentInfo
       @param style
       @param formula
     */
   public void createTournamentInfo(String style, String formula)
   {
      info = new tournamentInfo(style, formula);
      System.out.println("You just created a new tournamentInfo");
   }
   /*  manage the tournamentInfo
       @param style
       @param formula
     */
   public void manageTournamentInfo(String style, String formula)
   {
      info.setStyle(style);
      info.setExpertRatingFormula(formula);
      System.out.println("You just changed the style to: " + style
         + " expertRatingFormula to: " + formula);
   }
   /*show tournament info*/
   public void showTournamentInfo()
   {
      System.out.println(info.toString());
   }
   
// The following part is for player manage

   public spectator createNewSpectator(int ID, String name)
   {
      spectator spt1 = new spectator(ID, name);
      System.out.println("You just created a new spectator");
      return spt1;
   }
   
}
