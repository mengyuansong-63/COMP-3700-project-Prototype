public class main
{
   public static void main(String arg[])
   {
      //the following part is to demostrate operator class 
      System.out.println("The following part is to demostrate operator class ");
      operator opt1 = new operator("operator1");
      opt1.createTournamentInfo("Style", "ExpertRatingFormula");
      opt1.showTournamentInfo();
      opt1.manageTournamentInfo("newStyle","NewFormula");
      
      //the following part is to demostrate spectator class
      System.out.println();
      System.out.println("The following part is to demostrate spectator class ");
      spectator spt1 = new spectator(1111, "newSpectator");
      spt1.showInfo();
      spt1.spectateGame("GAME");
      spt1.showSpectatingGame();
      
      //the following part is to demostrate leagueOwner class
      System.out.println();
      System.out.println("The following part is to demostrate leagueOwner class");
      leagueOwner lo1 = new leagueOwner(2222, "LO1");
      lo1.defineNewLeague("new league name");
      lo1.conductTournament("T1");
      lo1.sendEmail("email content");
      
      
      //the following part is to demostrate tournament class
      
      System.out.println();
      System.out.println("The following part is to demostrate tournament class");
      lo1.t1.customizeMatchSequence("New Sequence");
      lo1.t1.declareWinner("WinnerName");
      lo1.t1.customizeERP("new ERP");
      lo1.t1.playTournament();
      
      //the following part is to demostrate advertiser class
      System.out.println();
      System.out.println("The following part is to demostrate advertier class");
      advertiser adr = new advertiser("newAdvertiser");
      adr.conductAdvertisement("adtName","adtContent");
      
      //the following part is to demostrate advertisement class
      System.out.println();
      System.out.println("The following part is to demostrate advertisement class");
      System.out.println("The balance of advertisement " + adr.adt.name + " is " + adr.adt.getBalance());
      adr.adt.addBalance(111111);
      adr.adt.setScheme("newScheme");
      adr.cancelAdvertisement();
   }
 
}