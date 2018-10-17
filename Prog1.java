
import java.io.File;
import java.util.Scanner;

/**
Java main Class.
This program is to run methods of ScoresList
Take user input and perform the correct operation.

@author Gadjou
*/
public class Prog1 
{
   /**
   main method
   */
   public static void main ( String[]args )
   {
      
      
      ScoresList list = new ScoresList();
       int score,count = 0;
      Scanner sc;
      
      
     
      
      try
      {
         sc = new Scanner( new File("Prog1_1.in") );
      }
      catch( Exception ex )
      {
         sc = new Scanner( System.in ); 
      }

      
      list.print();
            
      System.out.println( "The average of all scores is " + list.average()
            + "." );
      count = sc.nextInt();  
      for( int i = 0; i < count; i++ )
      { 
         score = sc.nextInt();
         
         if( list.appendScore( score ) )
         {
            
            System.out.println( "The value " + score + " is added to "
                  + "the list. " ); 
           
         }
         else
         {
            System.out.println( "The value " + score + " is not in the "
                  + "list. " ); 
         }
      }
      list.print();
      System.out.println( "The average of all scores is " + list.average()
            +  "." );
        
      count = sc.nextInt();
       
      for( int i = 0; i < count; i++ )
      { 
         score = sc.nextInt();
        
         if ( !list.delete( score ) )
         {
            System.out.println( "The value " + score +" is not in the"
                  + " list." );
         }
         else
         {
            list.delete( score );
            System.out.println( "The value " + score + " is deleted from"
                  + " the list. " );
           
         }  
      }
      list.print();
      System.out.println( "The average of all scores is " + list.average()
            +"." );
       
        
      count = sc.nextInt();
      
      for( int i = 0; i < count;i++ )
      { 
         score = sc.nextInt();
            
       
         if (!list.appendScore(score) )
         {
            System.out.println( "The value " + score+" is not added to the"
                     + " list." );
         }
         else
         {
            
            System.out.println( "The value " + score+ " is added to the "
               + "list. " );
           
         }  
      }
      list.print();
      System.out.println( "The average of all scores is " + list.average() +
            "." );
       
        
      count = sc.nextInt();
      for( int i = 0; i < count; i++ )
      {
         score = sc.nextInt();
         
         if ( !list.delete ( score ) )
         {
            System.out.println( "The value " + score +" is not in the "
                + "list." );
         }
         else
         {
            
            System.out.println( "The value " + score + " is deleted from "
                + "the list. " );
            
         }  
      }
        
      list.print();
        
      System.out.println( "The average of all scores is " + list.average() 
            + "." );
       
       count = sc.nextInt();
      
      for( int i = 0; i < count; i++ )
      { 
         score = sc.nextInt();
        
         if( !list.delete ( score ) )
         {  
            System.out.println( "The value " + score +" is not in the "
                     + "list." );
         }
         else
         {
            list.delete( score );
            System.out.println( "The value " + score + " is deleted from "
               + "the list. " );
            
         }    
      }
      list.print();
      System.out.println( "The average of all scores is " + list.average()
         +"." );    
   }
}
