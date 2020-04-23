public class spectator extends player
{
   private String spectatingGame;
   public spectator(int ID, String name)
   {
      super(ID, name);
      System.out.println("The role of this player is spectator");
   }
   
   public void spectateGame(String gameID)
   {
      this.spectatingGame = gameID;
      System.out.println("Spectating " + gameID);
   }
   
   public void showSpectatingGame()
   {
      System.out.println( super.getName() + " is spectating " + spectatingGame);
   }
}