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
        System.out.println("4. If you triple the money of yours, you win!");
        
        // Initializing 
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your total chip. ");
        double total_chip = in.nextDouble();
        String a1 = "*";
        String b1 = "7";
        String c1 = "O";
        String d1 = "X";
        String e1 = "#";
        String f1 = "@";
        
            while(total_chip > 0 && total_chip < 3*total_chip)//Paran varsa ve giris tutarindaki paranin 3 katini gecmediysen            
            {
                System.out.println("Please enter your bet. ");
                double bet = in.nextDouble(); 
                if(bet < total_chip && bet > 0)//Bahsin toplam parandan kucukse
                {
                    System.out.println("Enter 's' to spin and 'c' to cancel the spin.");
                    String decision = in.next();
                    if(decision.equals("s"))
                    {
                        int first = (int)(Math.random() * 6) + 1;//1 ile 6 arasinda rastgele bir sayi
                        int second = (int)(Math.random() * 6) + 1;//1 ile 6 arasinda rastgele bir sayi
                        int third = (int)(Math.random() * 6) + 1;//1 ile 6 arasinda rastgele bir sayi
                        
                        switch(first)
                        {
                            case(1): System.out.println( a1 + "-"); break;
                            case(2): System.out.println( b1 + "-"); break;
                            case(3): System.out.println( c1 + "-"); break;
                            case(4): System.out.println( d1 + "-"); break;
                            case(5): System.out.println( e1 + "-"); break;
                            case(6): System.out.println( f1 + "-"); break;
                            
                        }
                        switch(second)
                        {
                            case(1): System.out.print( a1 + "-"); break;
                            case(2): System.out.print( b1 + "-"); break;
                            case(3): System.out.print( c1 + "-"); break;
                            case(4): System.out.print( d1 + "-"); break;
                            case(5): System.out.print( e1 + "-"); break;
                            case(6): System.out.print( f1 + "-"); break;
                            
                        }
                        switch(third)
                        {
                            case(1): System.out.print( a1 ); break;
                            case(2): System.out.print( b1 ); break;
                            case(3): System.out.print( c1 ); break;
                            case(4): System.out.print( d1 ); break;
                            case(5): System.out.print( e1 ); break;
                            case(6): System.out.print( f1 ); break;
                            
                        }
                    }
                }
                
            }
            if( total_chip > 0)//Paran varsa 
            {
                
            }
        
    }
}