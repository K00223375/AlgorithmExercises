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
public class RecursionExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
    //Add the digits in the Number together
    public static int addDigits(int n)
    {
        
        if(n<10)
        {
            return n;
        }
        else
        {
            return n%10+addDigits(n/10);
             
        }
        
    }
    
    //count the number of digits in a number
    public static int countDigits(int n)
    {
        
        if(n<10)
        {
            return 1;
        }
        else
        {
            return 1+countDigits(n/10); 
        }
    }
}
