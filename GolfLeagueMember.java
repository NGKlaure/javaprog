/**
super class with one protected constructor, with two parameters:
name and initial score.contain the following methods
getName(),toString(), storeScore(int score),handicap(),indexOfMax()
indexOfMin().
@author Gadjou
*/
abstract class GolfLeagueMember 
{
   protected final int    NUM_STORED_SCORES = 5;
   protected final double HANDICAP_PERCENT = 0.96;
   
   private   String name;
   protected int    coursePar = 72;
   protected int    scores[] = new int[NUM_STORED_SCORES];  
   protected int    curIndex;  
   
   
   /**
   constructor of GolfLeagueMember  with to parameters
   name and score
   */
   protected GolfLeagueMember ( String name , int score)
   {
      this.name = name;
      curIndex = 0;
      
      for (int i = 0 ; i < scores.length ; i++ )
      {
         scores[i] = score;
      }
   }
   
   /**
   Method to get the name of the GolfLeagueMember 
   */
   public String getName ()
   {
      return name;
   }
   
   /**
   Method to print the the  scores and the golfer in a formate way
   */
   @Override
   public String toString()
   {
      String affich = "";
      affich = affich + getName()+ ": " +  curIndex + ",";
      String scoreval = "";
      
      for (int i = 0; i < NUM_STORED_SCORES - 1; i++)
      {
         scoreval = scoreval + scores[i] + ",";
      }
      
      return affich + scoreval + scores[NUM_STORED_SCORES - 1] ;
   }
   
   
   /**
   Method to store a score 
   in the array
   */
   public void storeScore( int score)
   {
          
      scores[curIndex++] = score;
     // curIndex++;
      if (curIndex == NUM_STORED_SCORES )
      {
         curIndex = 0;
      } 
   }
   
   /**
   Method to return the handicap
   */
   abstract public int handicap();
   
   
   /**
   Method to return the index of the Max element
   in the array
   */
   protected int indexOfMax( )
   {
      int maxScore = scores[0];
      int index = 0;
      for (int i = 0 ; i <scores.length ; i ++)
      {
         if ( scores[i] > maxScore)
         {
            index = i;
            maxScore = scores[i];
         } 
      } 
      return  index  ;
   }
   
   /**
   Method to return the index of the Min element
   in the array
   */
   protected int indexOfMin()
   {
      int minScore = scores[0];
      int index = 0;
      
      for (int i = 0 ; i < scores.length ; i ++)
      {
         if ( scores[i] <  minScore)
         {
            index = i;
            minScore = scores[i];
         }
          
      } 
      return  index  ;
   }
}
