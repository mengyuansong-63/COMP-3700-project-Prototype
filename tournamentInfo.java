public class tournamentInfo
{
   public String style;
   public String expertRatingFormula;
   public tournamentInfo(String style, String expertRatingFormula)
   {
      this.style = style;
      this.expertRatingFormula = expertRatingFormula;
   }
   public void setStyle(String style)
   {
      this.style = style;
      System.out.println("Already change style to " + style);
   }
   public void setExpertRatingFormula(String expertRatingFormula)
   {
      this.expertRatingFormula = expertRatingFormula;
      
      System.out.println("Already change expert rating formula to " + expertRatingFormula);
   }
   public String toString()
   {
      String result = "The tournamentStyle is " + style + "\n"
         + "The tournament expertRatingFomula is "+ expertRatingFormula;
      
      return result;
   }
}