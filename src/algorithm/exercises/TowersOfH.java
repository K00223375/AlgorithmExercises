/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.exercises;

/**
 *
 * @author K00223375
 */
public class TowersOfH 
{
    
    final static int DISKS = 64;		// no of disks on tower 1
      public static void main (String args[ ]){
         Move(DISKS, 1,3,2);
         System.exit(0);
      } // end of MAIN
   
   // Move : Move count disks from start to finish using temp for  temporary storage 
      public static void Move(int count, int start, int finish, int temp)
      {
         if (count > 1)
         {
            Move(count-1, start, temp, finish);
            System.out.println("Move a disk from " + start + " to " + finish);
            Move (count-1, temp, finish, start);
         }
         else
            System.out.println("Move a disk from " + start + " to " + finish);
      } // end of MOVE

    
    
}
