public class leagueMemberList
{
   private String listName;
   private leagueMember[] leagueMemberList;
   
   public leagueMemberList(String listName)
   {
      this.listName = listName;
      //maximum of a league member list is 200
      leagueMemberList = new leagueMember[200];
   }
   
   public String getListName()
   {
      return listName;
   }
   
   public void setListName(String listNameIn)
   {
      listName = listNameIn;
   }
   
   public leagueMember[] getList()
   {
      return leagueMemberList;
   }
   
   public void addMember(String memberName)
   {
      System.out.println(memberName + "has been added into the list");
   }
   
}