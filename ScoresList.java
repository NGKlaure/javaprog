/**
Java class to manipulate a list of scores.
This program allows manipulation of a list of scores: 
   Adding, Deleting, Finding, Printing, Average
@author <Nadine>
*/

public class ScoresList
{
   private final int MAX_SIZE = 10;

   private int scores[] = new int[MAX_SIZE];
   private int numScores = 0;

   /**
   Adds a score to the end of the array scores if it is not full.
   @param score to add to the end of the array
   @return true if score is successfully added, false otherwise
   */
   public boolean appendScore ( int score )
   {
      // Write the function body
       
      if( numScores < MAX_SIZE )
      {
         scores[numScores] = score;
         numScores++;
         return true;
      }
      return false;
   }

   /**
   Calculates the float average of the scores stored in the array.
   @return average of scores in the list, 0.0 if no scores in the array
   */
   public float average()
   {
      float ave = 0.0F;       // Type double without the F
      float sum = 0;

      // Complete the method
      for ( int i = 0; i < numScores; i++ )
      {
         sum += scores[i];
      }
      
      if ( numScores == 0 )
         return ave;
      else
      {
         ave = sum / numScores ;     
      }
      return ave;
   }

   /**
   Deletes the LAST occurrence of score from the array scores if it exists.
   Moves all scores up, maintaining relative positions, if it is deleted.
   @param score to delete
   @return true if the score is successfully deleted, false otherwise
   */

    public boolean delete ( int score )
   {
      int scoreindex = find( score );
      // Write the method body
      // You must use one and only one for loop inside the function.
      if ( scoreindex == -1)
         return false;
      else
      {
         numScores--;
         for ( int i = scoreindex; i < numScores; i++ )
         {
            scores[i] = scores[i+1]; 
         }
         return true;
      }
      
   }

   /**
   Tries to find the LAST occurrence of score in the array scores.
   @param score to find
   @return 0-based position of the LAST occurrence of score, -1 if not found
   */
   private int find ( int score )
   {
      // Write the method body
      // You must use one and only one for loop inside the method.
      for ( int i = numScores - 1 ;i >=0; i-- )
      {
         if ( scores[i] == score )
         {   
            return i;
         }
       }
      return -1; 
   }

   /**
   Prints all scores in the array to System.out, one score per line.
   */
   public void print()
   {
      System.out.println( "The list of scores is:" );

      // Complete the method body
      for( int i = 0; i < numScores; i++ )
       {
         System.out.println( scores[i] );
       }  
   }
}  // class ScoresList
