package edu.cnm.deepdive;

import java.util.Arrays;

public class DeckTester {

  public static void main(String[] args) {
    Suit[] suits = Suit.values();
    Rank[] ranks = Rank.values();
    Card[] deck = new Card[suits.length * ranks.length];  //every array has a length property, length = number of different suits/ranks
    //have 52 slots but there are no cards in them yet
    int index = 0;
    for (Suit suit : suits) {
      for (Rank rank : ranks) {  //starting with one suit and going through all ranks, then next suit, etc - cartesian product, produces all combinations
        Card c = new Card(suit, rank); //create a card "c" with each suit and rank
        deck[index] = c;
        index++;
      }
    }
    System.out.println(Arrays.toString(deck)); //use Arrays.toString() to print something out
  }

}
