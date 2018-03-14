package pkgCore;
import pkgEnum.*;
public class Card implements Comparable {

	private eSuit suit;
	private eRank rank;
	
	public Card(eSuit suit, eRank rank) {
		super();
		this.setSuit(suit);
		this.setRank(rank);
	}
	
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return c.getRank().compareTo(this.getRank());

}

	public eSuit getSuit() {
		return suit;
	}

	private void setSuit(eSuit suit) {
		this.suit = suit;
	}

	public eRank getRank() {
		return rank;
	}

	private void setRank(eRank rank) {
		this.rank = rank;
	}
	
}
