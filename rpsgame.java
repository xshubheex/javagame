import org.jetbrains.annotations.NotNull;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class rpsgame {
    public static @NotNull String generateComputerChoice(@NotNull Random random)
    {
        int wordnumber;
        int min=1;
        int max=3;

        int randint=(int)Math.floor(Math.random()*(max-min+1)+min);
        wordnumber = randint;
        String computerchoice ="";

            if ( wordnumber == 1)
            {
                computerchoice = "rock";

            }
        if ( wordnumber == 2)

        {
            computerchoice = "paper";
        }
        if ( wordnumber == 3)
        {
        computerchoice = "scissor";
        }
         System.out.println("\nThe computer already made its choice");
        return computerchoice;
    }
    public static  void showmenu()
    {
        System.out.println("option to choose from :\n1.Rock\n2.Paper\n3.Scissor");
    }
    public static int getuserchoice(@NotNull Scanner scanner)
    {
        int userwordchoice;
        System.out.println( "\nPlease make your choice : ");
        userwordchoice = scanner.nextInt();
        return userwordchoice;
    }
    public static @NotNull String chooseWinner(@NotNull String computerchoice, int userchoice)
    {
        String winner = "No winner";
        String customMessage = "Both choose same";
        String finalMessage = "";

        String rockcustomMessage = "The rock smashes the scissor";
        String scissorcustomMessage = "Scissors cuts the paper";
        String papercustomMessage = "Paper wraps rock";

        if( computerchoice=="rock" && userchoice==3)
        {
            winner = "Computer";
            customMessage = rockcustomMessage;
        }
        else if ( userchoice== 1 && computerchoice== "scissor") {
            winner = "Ussr";
            customMessage = rockcustomMessage;
        }
        else if( computerchoice== "scissor" && userchoice== 2)
        {
            winner = "Computer";
            customMessage = scissorcustomMessage;
        }
         else if( userchoice== 3 && computerchoice== "paper")
        {
            winner = "User";
            customMessage = scissorcustomMessage;
        }
        else if( computerchoice== "paper" && userchoice== 1)
        {
            winner = "Computer";
            customMessage = papercustomMessage;
        }
         else if(userchoice==2 && computerchoice== "rock")
        {
            winner = "User";
            customMessage = papercustomMessage;
        }
        finalMessage = winner + " won ( " + customMessage + " )";
        return finalMessage;
    }
    public static void main( String [] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String computerchoice;
         int userchoice;
        String winner;
        showmenu();
        computerchoice = generateComputerChoice( random );
        userchoice = getuserchoice( scanner );
        winner = chooseWinner( computerchoice, userchoice );
        System.out.println( "\nYou choose : " + userchoice + "\nComuter choose : " +computerchoice );
        System.out.println( winner);

    }

}
