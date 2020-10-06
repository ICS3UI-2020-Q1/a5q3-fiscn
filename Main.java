import java.util.Scanner; 

/**
 * program that will take a positive integer and compute the factorial of that integer.
 * @author Neil Fischer
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create scanner for user input 
    Scanner input = new Scanner(System.in); 

    //prompt the user to enter in a integer 
    System.out.println("Please enter an integer to calculate the factorial of"); 

    //declare variables 
    int userNM = input.nextInt(); 
    int answerNM = 1; 

    //create for loop for the factorial of the integer 
    for(int count = userNM; count >= 1; count--){
      answerNM = answerNM * count; 
    } 
    System.out.println(userNM + "!" + "= " + answerNM); 


    
  }
}
