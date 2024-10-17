import java.util.Random;
import java.util.Scanner;

public class Number_Guess_Game {
    public static void main(String x[])
    {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNumber = r.nextInt(100) + 1;
        while(true)
        {
            System.out.println("Enter the number ");
            int GuessNumber=sc.nextInt();

            if(GuessNumber==randomNumber)
            {
                System.out.println("Congratulation! You Guessed the right number: "+randomNumber);
            }
            if(GuessNumber>randomNumber)
            {
                System.out.println("Too High! Please try again");
            }
            if(GuessNumber<randomNumber)
            {
                System.out.println("Too Low! Please try again");
            }
        }
    }
}