
import java.io.File;
import java.util.Scanner;

/**
this class has static methods addMember() to add a member ,
deleteMember()to delete a member
displayHandicap() to display the handicap
and the main method to test all methods.
@author Gadjou
*/
public class Prog2 
{
   private static GolfLeague league = new GolfLeague();
   private static Scanner sc;
   
   /**
   Adds an instance of GolfLeagueMember to league.
   The method reads in two strings for name and group
   and an integer for score, invokes the add method 
   on league, and displays a message according to the
   return result of the add method.
   */
   private static void addMember( )
   {
      
      String name,group;
      int score;
      name = sc.next();
      group = sc.next();
      score = sc.nextInt();
      
      GolfLeagueMember mem = null ;
      
      if (group.equalsIgnoreCase("Regular"))
      {
         mem = new RegularMember(name , score); 
      }
      
      else if (group.equalsIgnoreCase("youth"))
      {
         mem = new YouthMember(name , score);
      }
      
      else if (group.equalsIgnoreCase("senior"))
      {
         mem = new SeniorMember(name , score);
      }
      
      if (league.add(mem))  
      {
        System.out.println( group + " Member " + mem.getName()
              + " is added");
      }
      else 
      {
         System.out.println( mem.getName()+ " is not added");
      }
   }

   /**
   Deletes a member from league.
   The method reads in a string for name, invokes method
   delete on league, and displays a message according to 
   the return result of the delete method.
   */
   private static void deleteMember()
   {
      String  name = sc.next();
      if (league.delete(name))
      {
        System.out.println(name + " is deleted");
      }
      else
      {
        System.out.println(name + " is not in the league");
      }
     
   }
   
   /**
   Adds a score for a member in league.
   The method reads in a string for name and an integer 
   for score, invokes method enterScore on league, and 
   displays a message according to the return result of 
   the enterScore method.
   */
   private static void addScore()
   {
      String name = sc.next();
      int score = sc.nextInt();
      if (league.enterScore(name, score))
      {
         System.out.println("Score of "+ score + " is stored for " + name);
      }
      else 
      {
         System.out.println(name + " is not in the league");
      }
   }
   
   /**
   Displays the handicap for a member in league.
   The method reads in a string for name, invokes method 
   getHandicap on league, and displays a message according 
   to the return result of the getHandicap method.
   */
   private static void displayHandicap()
   {
      String name = sc.next();
      if (league.getHandicap(name)!= -1)
      {
         System.out.println(name + " has a handicap of " 
            + league.getHandicap(name));
      }
      else
      {
         System.out.println(name + " is not in the league");
      }
   }
   
   /**
   main method 
   The method has only one variable, command of class String.
   The commands can have mixed cases such as add or handiCAP.
   The Print command displays the string from the toString method 
   of league, and other commands are handled by the private 
   static methods of the class.
   */
   public static void main(String[] args)
   {
      try
      {
         sc = new Scanner( new File("prog2_1.in") );  
      }
      catch( Exception ex )
      {
         sc = new Scanner( System.in ); 
      }
      
      while (sc.hasNext())
      {
         String command;
         command = sc.next();
         if (command.equalsIgnoreCase("print"))
         {
            System.out.println(league.toString());
         }
          
         else if (command.equalsIgnoreCase("add"))
         {
            addMember();
         }
           
         else if (command.equalsIgnoreCase("Handicap"))
         {
            displayHandicap();
         } 
         else if (command.equalsIgnoreCase("score"))
         {
            addScore();
         } 
         else if (command.equalsIgnoreCase("Delete"))
         {
            deleteMember();
         } 
      } 
   }
}
