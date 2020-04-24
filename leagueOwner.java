public class leagueOwner extends player
{
   public tournament t1;
   public league l1;
   public leagueOwner(int ID, String name)
   {
      super(ID,name);   
   }
   
   public void conductTournament(String tournamentName)
   {
      t1 = new tournament(tournamentName);
      System.out.println("Tournament " + tournamentName + " has be conducted");
   }
   
   public void sendEmail(String emailContent)
   {
      System.out.println("Email now send to all league members");
   }
   
   public void defineNewLeague(String leagueName)
   {
      l1 = new league(leagueName);
      System.out.println("League " + leagueName + " has be defined");
   } 
}