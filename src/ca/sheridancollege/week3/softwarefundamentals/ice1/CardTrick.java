package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 */
import java.util.*;
import java.lang.Object;
public class CardTrick {

    public static void main(String[] args) {
        Random rand = new Random();//Used to generate random numbers
        Card[] magicHand = new Card[7];
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(rand.nextInt(13)+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
        }
        System.out.println(java.util.Arrays.toString(magicHand)); //Used to print out the card array (meant for debugging purposes)
        String[] magicHandStr = Arrays.stream(magicHand).map(Object::toString).toArray(String[]::new); //Changes Card array into string
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        Scanner i = new Scanner(System.in);//Scanner object for card value
        System.out.println("Enter card value: ");
        int cardNum = i.nextInt();
        Scanner j = new Scanner(System.in);//Scanner object for card suit
        System.out.println("Enter card Suit: ");
        String cardSuit = j.nextLine();
        String userCard = cardNum +" of "+cardSuit;//Makes user input into a card so this card can be searched in the array
        for(int q = 0; q < magicHand.length; q++){
            //Runs through the magic hand array and compares the user input to the array elements to see if theres a match
            if(userCard.equals(magicHandStr[q])){//If theres a match between users card and one of the array elements print success message
                System.out.println("This card was in the magic hand.");
                break;
            }
            else{//If theres no match between users card and one of the array elements print failure message
                System.out.println("This card was not in the magic hand.");
                break;
            }
        }
    }

}
