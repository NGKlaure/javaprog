/**
Subclass of GolfLeagueMember 
contain a constructor and Override the Handicap method and
toString()method.
@author Gadjou
*/
public class YouthMember extends GolfLeagueMember 
{
   private final int YOUTH_COURSE_PAR = 73;
 
   /**
   constructor of youthMember that just invokes 
   the base class constructor.  
   */
   public YouthMember(String name, int score)
   {
      super(name, score);
      coursePar = YOUTH_COURSE_PAR;
   }

   
   /**
   Method  to overrides the handicap method of GolfLeagueMember
   to compute the handicaps for Youth members 
   */
   @Override
   public int handicap()
   {
     int curHandicap ;
      float ave = 0.0F; 
      int sum = 0;
      int newSum ;

      for (int i = 0 ; i < scores.length ; i++)
      {
         sum += scores[i] ;
      }
         
      newSum =  sum - scores[indexOfMin()]  ; 
         
        
      ave = (newSum /(float)(scores.length - 1));
         
      double temp ;
      double temp2 ;
      temp = ave - coursePar;
      temp2 = temp * HANDICAP_PERCENT;
      curHandicap = (int) temp2;
         
      if (curHandicap < 0)
      {
         return 0;
      }
        
      return curHandicap;
   }
    
   /**
   Method to override toString()
   */
   @Override
   public String toString()
   {
      return "Youth Member " + super.toString();
   }
}
