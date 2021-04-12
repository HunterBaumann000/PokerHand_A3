package edu.wctc.creator;

public class Card {

    private final String face;
    private final String suit;
    private final int score;

    public Card(String face, String suit, int score) {
        this.face = face;
        this.suit = suit;
        this.score = score;
    }

    public String getFace() {
        return face;
    }

    public String getSuit() {
        return suit;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Card{" +
                "face='" + face + '\'' +
                ", suit='" + suit + '\'' +
                ", score=" + score +
                '}';
    }
}
