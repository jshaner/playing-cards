package edu.cnm.deepdive;

import java.util.Arrays;
import java.util.Random;

public class Shoe {

  private final Card[] cards;

  public Shoe(int decks) {
    int deckSize = Suit.values().length * Rank.values().length;
    cards = new Card[decks * deckSize];  //Suit.values().length * Rank.values().length]; don't need
    for (int i = 0; i < decks; i++) {  //or type "fori" and tab completion
      Deck d = new Deck();
      //int size = d.getCards().length; don't need
      System.arraycopy(d.getCards(), 0, cards, i * deckSize, deckSize); //copy from cards in deck i'm copying start from position 0, copy to cards array, starting at position 1 * decksize (0, 52, 104, etc), and copy this many elements
    }

  }

  public Card[] getCards() {
    return Arrays.copyOf(cards, cards.length);
  }

  public void shuffle(Random rng) {
    for (int targetIndex = cards.length - 1; targetIndex >0; targetIndex--) {
      int sourceIndex = rng.nextInt(targetIndex + 1); //we want it to be possible that a card ends up in the exact same spot - without the +1 this can't be true
      Card temp = cards[targetIndex];
      cards[targetIndex] = cards[sourceIndex];
      cards[sourceIndex] = temp;
    }


  }
}