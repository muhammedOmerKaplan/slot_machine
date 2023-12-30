import java.util.Scanner;


public class slot_machine
{
    public static void main(String[] args)
    {
        // Introducing
        System.out.println("Welcome to the Challenger Casino's slot machine!");
        System.out.println("Here are our game rules for slot machine: ");
        System.out.println("1. You should enter the number of total chip you have.");
        System.out.println("2. Determine your bet. Higher the bet, higher the reward!");
        System.out.println("3. If you ran out of chips you lose!");
        System.out.println("4. If you triple the initial chip of yours, you win!");
        
        // Initializing 
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your total chip. ");
        int initial_chip = in.nextInt();
        int total_chip = initial_chip;
        int counter = 0;
        while(initial_chip <= 0)
        {
            System.out.println("Please enter a valid value of chips.");
            initial_chip = in.nextInt();
        }
        
                while(total_chip > 0 && total_chip < 3 * initial_chip)//Paran varsa ve giris tutarindaki paranin 3 katini gecmediysen            
                {
                    System.out.println("Please enter your bet. ");
                    int bet = in.nextInt();  
                        
                    if(bet <= total_chip && bet > 0)//Bahsin toplam parandan kucukse
                    {
                        System.out.println("Enter 's' to spin and 'c' to clear history.");
                        String decision = in.next();
                        if(decision.equals("s"))
                        {
                            counter++ ; 
                            System.out.println(counter + ". game.");
                            total_chip = total_chip - bet ;
                            System.out.println("Chip left: " + total_chip);
                            String resultOfSpinning = machine.spinning();
                            System.out.println(resultOfSpinning);
                            int result = machine.slots(resultOfSpinning, bet);
                            
                            System.out.println("You win " + result + "!");
                            total_chip = total_chip + result;
                            System.out.println("Total chip: " + total_chip);
                        }
                        else if(decision.equals("c"))
                        {
                            System.out.print('\u000C');
                        }
                    }
                    else
                    {
                        System.out.println("You have only " + total_chip + " chips.");
                    }
                }
            
                
         
        System.out.println("You have spinned " + counter + " times.");
        if(total_chip >= 3 * initial_chip)
        {
            System.out.println("Congratulations You Win!!!");
        }
        else
        {
            System.out.println("You've spent all your chips. Thank you for playing!"); 
        }
    }
            
        
}    
