public class advertiser
{
   public advertisement adt;
   public String name;
   
   public advertiser(String name)
   {
      this.name = name;
   }
   
   public void conductAdvertisement(String adtName, String adtContent)
   {
      adt = new advertisement(adtName, adtContent);
   }
   
   public void cancelAdvertisement()
   {
      System.out.println("Advertisement " + adt.name + " has been deleted");
      adt = null;
      
      
   }
}