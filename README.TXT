-----------------------------------------------------------------------------------------------------------
                                    CS140 - Introduction to Computing I

                                        mp02 (Nested loop) - 50 pts
                                    Due: 5:00 pm, Friday June 16, 2017
-----------------------------------------------------------------------------------------------------------
Electronic submission:
    - Use the 'Submit p2' link on moodle to test your code, make your submission and receive immediate
      feedback.
-----------------------------------------------------------------------------------------------------------
Objectives:
    - To gain experience with the BlueJ IDE and how to edit source code for a class. 
    - To create instances of a class and call its methods.
    - To use the Scanner to request keyboard input from the user.
    - To use a nested for and a do/while statement.
    - To code a class given its UML description.
-----------------------------------------------------------------------------------------------------------   
Project setup:
    The mp02.MultiplicationTable project is provided to you with this README file.
-----------------------------------------------------------------------------------------------------------    
Problem description:
    In this mp you are to implement the class MultiplicationTable whose UML is given below. Make sure you
    implement only what is shown in the UML. If something is missing it is by design, so do not add it.
-----------------------------------------------------------------------------------------------------------
Implementation details: 
    1) Create a new class named MultiplicationTable. Its UML is shown below.
    
    ----------------------------------------------------------
                         MultiplicationTable
    ----------------------------------------------------------
    -factor: int
    ----------------------------------------------------------
    +MultiplicationTable()
    +MultiplicationTable(factor: int)
    +getFactor(): void
    +setFactor(factor: int): void
    +askUserForMultiplicationFactor(): void
    +displayTable(): void
    -isFactorValid(factor: int): boolean
    ----------------------------------------------------------  
    
    2) Clean-up the class template before you add the new methods.
    
    3) Implement the constructors
    default (convenience): calls the designated with a default value of 10.
    
    one-argument (designated): sets the factor to the supplied parameter.
    
    4) Implement the getter/setter
    get - simply returns the factor
    set - updates the object only if new value is valid. Calls the isFactorValid to check. 
    Displays the message "Factor must be > 0 and <= 30." if invalid.
    
    5) Implement the askUserForMultiplicationFactor
    This method uses the Scanner class to read input from the keyboard. The method prompts the
    user for a multiplication factor, and repeats until a valid factor is entered. This requires
    the use of the isFactorValid() method that does the checking.
    
    This is a good example of the use of a do/while statement. The do/while executes its body
    at least one time, and checks its condition at the end. This allows for subsequent execution
    of the body if the condition is met. Once the user enters a valid factor, call the setter
    to update the object.
    
    The interaction should go as follows:
    
    Enter multiplication factor [1-30]: 0
    Enter multiplication factor [1-30]: 90
    Enter multiplication factor [1-30]: 10
    
    
    6) Implement the displayTable
    This method displays the multiplication table using a nested for loop. To get the table to line
    up as shown below, use System.out.printf(). Each column in the sample output below is 4 characters
    wide. The horizontal line uses the minus character and the | character is the vertical bar or pipe
    character. The one that shares the key with the \.
    
    Sample output:

      1   2   3   4   5   6   7   8   9  10
    ----------------------------------------
  1|   1   2   3   4   5   6   7   8   9  10
  2|   2   4   6   8  10  12  14  16  18  20
  3|   3   6   9  12  15  18  21  24  27  30
  4|   4   8  12  16  20  24  28  32  36  40
  5|   5  10  15  20  25  30  35  40  45  50
  6|   6  12  18  24  30  36  42  48  54  60
  7|   7  14  21  28  35  42  49  56  63  70
  8|   8  16  24  32  40  48  56  64  72  80
  9|   9  18  27  36  45  54  63  72  81  90
 10|  10  20  30  40  50  60  70  80  90 100
 
    7) Implement the isFactorValid
    This method returns true if its parameter is in the range 1-30 inclusive else
    it returns false.
    
-----------------------------------------------------------------------------------------------------------

Grading Rubric

Feature                                                 Points (+/-)
-----------------------------------------------------------------------

Compilation                                                     -6
  : does not compile
-----------------------------------------------------------------------

Style                                                            -5
  : clean-up
  : variable names
  : indentation, white space, comments
-----------------------------------------------------------------------

Constructors                                                     10
    : convenience calls designated
    : designated calls setter
    
-----------------------------------------------------------------------

Accessors                                                        10
  : getter
  : setter (validates against 0<f<=30)
-----------------------------------------------------------------------

askUserForMultiplicationFactor                                   10
  : validates input repeatedly
  : set factor on success
  
-----------------------------------------------------------------------

displayTable                                                     10
  : proper format
  : correct results
  
-----------------------------------------------------------------------

isFactorValid                                                    10
  : validates for range (0, 30]