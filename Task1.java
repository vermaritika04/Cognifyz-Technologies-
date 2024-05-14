import java.util.Scanner;

public class Task1 {
    public static void
        guessingnumbergame()
        {
            Scanner sc = new  Scanner(System.in);
            int number = 1 + (int)(100*Math.random());
            //giving user 3 trials
            int k = 3;
            int i, guess;

            System.out.println("A number is choosen"+"between 1 to 100."+"Guess the number"+ "within 3 trials.");
            //iterating over k trials
            for(i=0; i<k; ++i)
            {
                System.out.println("Guess the number: ");
                guess = sc.nextInt();

                if (number==guess) {
                    System.out.println("Congratulations! You got it right.");
                    break;
                } else if (number < guess  && i != k - 1) {
                    System.out.println("The number is"+ " less than " + guess);
                } else if (number > guess && i != k -1) {
                    System.out.println("The number is" + " greater than " + guess);
                }
        
            }
            
        if (i == k) {
            System.out.println("You have exhausted" + " k trials.");
            System.out.println("The number was " + number);
        }
    }
    

    public  static void main(String[] args) {
        guessingnumbergame();
    }
}
