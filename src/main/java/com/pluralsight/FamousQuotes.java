package com.pluralsight;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        /*Create an array of strings to store 10 quotes. Add 10 of your favorite quotes to
        the array.
        Prompt the user to select a number between 1 and 10 and display that quote.
        DO NOT use try/catch (yet) to handle the error.
                Test the application. Select a number that exists. Does it work?
                Enter a number that doesn't exist (any number other than 1 to 10). What
        happens?
                Now add exception handling to the application and retest.
        BONUS: Add a loop to the program asks the user if they want to see another
        saying. If they say yes, repeat the process. DO NOT shut the application down
        when if an exception occurs. Just pick up with the next iteration.
                BONUS: Allow the user to select an option that will display a random quote.
         */
        boolean run = true;
        while (run){
            try{
            String[] quotes =
                    {         "Waste no more time arguing what a good man should be. Be One. – Marcus Aurelius\n"
                            , "“It never ceases to amaze me: we all love ourselves more than other people, but care more about their opinion than our own.” – Marcus Aurelius\n"
                            , "“If it is not right, do not do it, if it is not true, do not say it.” – Marcus Aurelius\n"
                            , "“The best revenge is not to be like your enemy.” – Marcus Aurelius\n"
                            , "“Choose not to be harmed — and you won’t feel harmed. Don’t feel harmed — and you haven’t been.” – Marcus Aurelius\n"
                            , "“It’s time you realized that you have something in you more powerful and miraculous than the things that affect you and make you dance like a puppet.” – Marcus Aurelius\n"
                            , "“External things are not the problem. It’s your assessment of them. Which you can erase right now.” – Marcus Aurelius\n"
                            , "“If anyone can refute me—show me I’m making a mistake or looking at things from the wrong perspective—I’ll gladly change. It’s the truth I’m after, and the truth never harmed anyone.” – Marcus Aurelius\n"
                            , "“You could leave life right now. Let that determine what you do and say and think.” – Marcus Aurelius\n"
                            , "“Be tolerant with others and strict with yourself.” – Marcus Aurelius\n"
                    };
            Scanner scan = new Scanner(System.in);
            System.out.print("Please type any number between 1-10:");
        int index = scan.nextInt();
        System.out.println(quotes[index]);
        run = false;

            } catch (Exception e) {
                System.out.println("Please enter a number between 1-10, and try again.");
            }
        }
}}
