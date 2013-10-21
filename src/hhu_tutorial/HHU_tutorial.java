/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hhu_tutorial;

/**
 *
 * @author mbirk
 */
public class HHU_tutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Deck myDeck = new Deck();
        myDeck.printCards();
    }
    
}

class Deck{
    private String[] ranks = new String[12];
    private String[] suits = new String[4];
    
    private static Card[] deck = new Card[48];
    
    private int i;
    
    Deck(){
        ranks = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "Jake", "Queen", "King", "Ace"};
        suits = new String[] {"Spades", "Hearts", "Diamonds", "Clubs"};
        
        i = 0;
        for(String suit : suits){
            for(String rank : ranks){
                deck[i++] = new Card(rank, suit);
            }
        }
    }
    
    void printCards(){
        for(Card card : deck){
            System.out.println("Suit: "+ card.getSuit() + " Rank: "+card.getRank());
        }
    }
}

class Card{
    private String rank;
    private String suit;
    
    Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }
    
    String getRank(){
        return rank;
    }
    
    String getSuit(){
        return suit;
    }
}