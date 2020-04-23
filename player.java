public abstract class player
{
   private int ID;
   private String name;
   public player(int ID, String name)
   {
      this.ID = ID;
      this.name = name;
      System.out.println("You just created a new player");
   }
   
   public int getID()
   {
      return ID;
   }
   
   public String getName()
   {
      return name;
   }
   
   public void showInfo()
   {
      System.out.println("The name is " + name + " the ID is " + ID);
   }
}