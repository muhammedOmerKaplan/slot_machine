public class machine

{
    
     public static String spinning()
    {
        String minus = " - ";
        String slots = " *7OX#@";
        int first = (int)(Math.random() * 6) + 1;
        int second = (int)(Math.random() * 6) + 1;
        int third = (int)(Math.random() * 6) + 1;
        char slot_1 = slots.charAt(first);
        char slot_2 = slots.charAt(second);
        char slot_3 = slots.charAt(third);
        String result = slot_1 + minus + slot_2 + minus + slot_3 ;
            return  result;
            
    }
        
    public static int slots(String resultOfSpinning, int bet)
    {
        
        char slot_1 = resultOfSpinning.charAt(0);
        char slot_2 = resultOfSpinning.charAt(4);
        char slot_3 = resultOfSpinning.charAt(8);
        
        if(slot_1 == '*' && slot_2 != '*' && slot_3 != '*')
        {   
            return bet; 
        }
        else if(slot_1 != '*' && slot_2 == '*' && slot_3 != '*')
        {
            return bet;
        }
        else if(slot_1 != '*' && slot_2 != '*' && slot_3 == '*')
        {
            return bet;
        }
        else if(slot_1 == '*' && slot_2 == '*' && slot_3 != '*')
        {
            return  bet * 2 ;
        }
        else if(slot_1 != '*' && slot_2 == '*' && slot_3 == '*')
        {   
            return  bet * 2 ; 
        }
        else if(slot_1 == '*' && slot_2 != '*' && slot_3 == '*')
        {
            return  bet * 2 ;
        }
        else if(slot_1 == '*' && slot_2 == '*' && slot_3 == '*')
        {
            return  bet * 150 ;
        }
        //
        else if(slot_1 == '7' && slot_2 == '7' && slot_3 == '7')
        {
            return  bet * 500 ;
        }
        else if(slot_1 == 'O' && slot_2 == 'O' && slot_3 == 'O')
        {
            return  bet * 200 ;
        }
        else if(slot_1 == 'X' && slot_2 == 'X' && slot_3 == 'X')
        {
            return  bet * 250 ;
        }
        else if(slot_1 == '#' && slot_2 == '#' && slot_3 == '#')
        {
            return  bet * 300;
        }
        else if(slot_1 == '@' && slot_2 == '@' && slot_3 == '@')
        {
            return  bet * 1000 ;
        }
        else
        {
            return  0 ;
        }
    }
}                                       