public class advertisement
{
   public String name = "not defined yet";
   private double balance = 0;
   private String advertisementContent= "not defined yet";
   private String scheme = "not defined yet";
   
   public advertisement(String name, String content)
   {
      this.name = name;
      this.advertisementContent = content;
      System.out.println("Advertisement " + name + " has been created");
   
   }
   
   public double getBalance()
   {
      return balance;
   }
   
   public void setScheme(String scheme)
   {
      this.scheme = scheme;
      System.out.println("Scheme is now " + this.scheme);
   }
   
   public void addBalance(double newBalance)
   {
      this.balance += newBalance;
      
      System.out.println(newBalance + " dollars has been added to  " + name);
   }
}