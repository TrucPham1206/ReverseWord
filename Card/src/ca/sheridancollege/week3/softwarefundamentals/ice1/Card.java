/* Truc Pham 991511456
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;


import java.util.Scanner;
public class Card {

	public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        boolean result = false;
    
        CardBase[] magicHand = new CardBase[7];
        CardBase c = new CardBase();
        for (int i=0; i<magicHand.length; i++)
        {
            c = new CardBase();
            
            c.setValue(c.valueRandom());
            
            c.setSuit(CardBase.SUITS[c.suitsRandom()]);
            System.out.println(c.getValue() + " " + c.getSuit());
            
        
        }
       
        CardBase luckyCard = new CardBase();   
        luckyCard.setValue(12);
        luckyCard.setSuit("heart");
    
        
       System.out.print("Please input card number (Note: Ace=1,Jack=11, Queen=12, King=13): ");    
        int inputValue = input.nextInt();
        System.out.print("Please input card suit: ");    
        String inputSuit = input.next();
        
       
      
        for(int i=0; i<magicHand.length; i++){
            if (  inputValue == c.getValue()&& inputSuit.equals(c.getSuit())){
               result = true;       
            }
            else{
               result = false;
            }
            
        }
        
        if (result == true){
            System.out.println("Your Card is found");
            
        }
        else{
            System.out.println("Your Card is not found");          
        }
    
		    
    }
}
    

