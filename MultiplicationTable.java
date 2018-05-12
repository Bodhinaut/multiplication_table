import java.util.Scanner;
/** Kyle M. Shive
 * Program 2
 * 6/08/2017
 * CS140-021
 * CS140-001
 * Socratis Tornaritis
 */
public class MultiplicationTable
{
    // these are the instance variables 
    private int factor;
    Scanner keyboard = new Scanner(System.in);
    
    /**
     * Constructor for objects of class MultiplicationTable
     */
    public MultiplicationTable()
    {
        // initialise instance variables
        factor = 10;
    }

    // another constructor
    public MultiplicationTable( int thisFactor)
    {
        factor = thisFactor;
        
    }
    
    public int getFactor() {
    return this.factor; 
    }
    
    public void setFactor(int thisFactor) {
        if (thisFactor <= 0 && thisFactor > 30) {
        System.out.println("Factor must be > 0 and <= 30.");
        } else {
            this.factor = factor;
        }
      
    }

    
    
    
    private boolean isFactorValid (int thisFactor) {
    if (thisFactor > 0 && thisFactor <= 30) {
    return true;
    }else{
    return false;
     }
   }
   //not return false after else
   
   public void askUserForMultiplicationFactor(){
    
    int tempFactor;
    do{
    System.out.print("Enter multiplication factor [1-30]: "); 
    tempFactor = keyboard.nextInt();
    if (tempFactor > 0 && tempFactor < 30) {
    }else{ System.out.println("Factor must be > 0 and <= 30.");
    }
    }while(!isFactorValid(tempFactor));
    //apprently above I need to take out the if and else and go back to how I had it
    //because I got an extra error
    
    
    //factor = tempFactor; //maybe
    
    }
    
    public void displayTable(){
        
         System.out.print("1   2   3   4   5   6   7   8   9  10" +
         "\n----------------------------------------\n");
       for(int factorNumberDown = 1; factorNumberDown < 11; factorNumberDown++)
       {

           System.out.print("\n" + factorNumberDown + "| ");
           for(int factorNumberAcross = 1; factorNumberAcross <11; factorNumberAcross++)
           {
               System.out.print((factorNumberDown*factorNumberAcross) + " ");
            }
        }
       //make this variables above, make 11 = factor, also maybe change my i
       //also format my lines to look better
    }
    
    
}

