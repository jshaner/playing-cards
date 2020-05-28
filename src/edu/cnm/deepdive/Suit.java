package edu.cnm.deepdive;

/**
 * Encapsulates the suits of standard playing cards.  Each instance can return (using the {@link #symbol()} method)
 * the Unicode symbol for that suit.
 */
public enum Suit {

  CLUBS, DIAMONDS, HEARTS, SPADES;
// can use html tags
  /**
   * Returns the <em>Unicode</em> symbol for the current instance.
   *
   * @return One of the four symbols: ♠, ♡, ♢, ♣.
   */
  public char symbol() {  //defining a trick, to tell us what the card's symbol is
    switch (this) {  //refers to current instance of the suit class
      case CLUBS:
        return '\u2663';
      case DIAMONDS:
        return '\u2662';
      case HEARTS:
        return '\u2661';
      case SPADES:
        return '\u2660';
      default:
        return (char) 0;  //error without default because compiler thinks what if there's an instance that isn't one of those four

    }

  }

}
