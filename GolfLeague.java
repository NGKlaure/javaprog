/**
class to  manage a list of instances of class GolfLeagueMember
using an array. has the following method:add( GolfLeagueMember member ),
delete( String memberName ),enterScore ( String memberName, int score )'
getHandicap( String memberName ),and toString().
@author Gadjou
*/
public class GolfLeague 
{
   private final int MAX_SIZE = 10;
   
   private GolfLeagueMember members[] = new GolfLeagueMember[MAX_SIZE];
   private int numOfMembers = 0;
   
   /**
   constructor
   */
   public GolfLeague ()
   {
   }
 
   /**
   Adds a member to members[].
   @param member to add 
   @return true if the member was added
   false otherwise (array was full)
   */
   public boolean add( GolfLeagueMember member )
   {
      if( numOfMembers < MAX_SIZE )
      {
         members[ numOfMembers ] = member;
         numOfMembers++;
         return true;
      }
      return false;
   }
   
   /**
   Deletes a member from members[] and moves all array 
   elements after the deleted one up one slot. 
   @param memberName name of the member to be deleted
   @return true if the member was deleted
   false otherwise (no member had the name)
   */
   public boolean delete( String memberName )
   {
      int memberIndex = findByName( memberName );
      // Write the method body
      // You must use one and only one for loop inside the function.
      if (findByName( memberName ) != -1)
      {
         numOfMembers--;
         for ( int i = memberIndex; i < numOfMembers; i++ )
         {
            members[i] = members[i+1]; 
         }
         return true;
      }
      return false;
   }
   
    /**
   Stores score for a member in members[].
   @param memberName name of the member
   @param score to be stored
   @return true if score was stored
   false otherwise (no member had the name)
   */
   public boolean enterScore ( String memberName, int score )
   {
      int index = findByName(memberName);
      if (index != -1)
      {
         members[index].storeScore(score);
         return true;
      }
      return false;
   }
      
   /**
   Overrides the toString method from class Object. 
   @return string beginning with a new line character,
   followed by "All members of the League: " and another
   new line character, followed by one line for each member
   in members[]. 
   The line for a member has the string from the toString 
   method of the member, followed by a new line character.
   */
  @Override
   public String toString()
   {
      String aff = "";
      aff = aff+  "\nAll members of the League:\n";
      
      String allMember= "";
      for (int i = 0; i < numOfMembers ; i++)
      {
         allMember += members[i].toString()+ "\n";
      }
      return aff + allMember;
   }

   /**
   Gets the handicap of a member in members[].
   @param memberName name of the member
   @return handicap of the member in the array 
   -1 otherwise (no member had the name) 
   */

   public int getHandicap( String memberName )
   {
      int index;
      index = findByName(memberName);
      //System.out.print(index);
      if (index != -1)
      {
         return members[index].handicap();
      }
      return -1;
   } 
   
   /**
   Gets the index of a member in members[].
   @param memberName name of the member
   @return index of the member in members[]
   -1 otherwise (no member had the name) 
   */

   private int findByName(String memberName)
   {
      for ( int i = numOfMembers - 1 ; i >= 0  ;i-- )
      {
          
         if (members[i].getName().equals(memberName))
         {
            return i;
         }
      }
      return -1;
   }
   
 /*  @Override
   public boolean equals( Object obj ) // don't really need it
   {
      // True this and obj are the same instance
      // False otherwise
      if (obj instanceof GolfLeague  ){
      GolfLeague  g = (GolfLeague )obj;
      return this.members.equals(g.members);
   }
      return false;
   }*/
}
