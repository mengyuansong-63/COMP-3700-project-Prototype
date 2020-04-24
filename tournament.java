public class tournament
{
   public String name = "not defined yet";
   private String accuOfExpertRatingPt = "not defined yet";
   private String matchSequence = "not defined yet";
   private String winner = "not defined yet";
   
   public tournament(String name)
   {
      this.name = name;
   }
   public void customizeMatchSequence(String newSequence)
   {
      this.matchSequence = newSequence;
      System.out.println("The match Sequence has already change to " + newSequence);
   }
   
   public void declareWinner(String winner)
   {
      this.winner = winner;
      System.out.println("The match winner is: " + winner);
   }
   
   public void customizeERP(String newERP)
   {
      this.accuOfExpertRatingPt = newERP;
      System.out.println("The accumulation of expert rating point" 
         + " has already change to " + newERP);
   }
   
   public void playTournament()
   {
      System.out.println("Tournament " + name + " now start!!");
   }
   
   
}