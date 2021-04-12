package edu.wctc.creator.test;

import edu.wctc.creator.Card;
import edu.wctc.creator.Deck;
import edu.wctc.creator.Poker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PokerTests {
    Deck deck = new Deck();
    List<Card> hand = new ArrayList<Card>();
    Poker poker = new Poker();

    //This Tests Straight
//    @BeforeEach
//    void runIt() {
//        hand.add(deck.getCard(5));
//        hand.add(deck.getCard(19));
//        hand.add(deck.getCard(33));
//        hand.add(deck.getCard(47));
//        hand.add(deck.getCard(9));
//    }

    //This Tests Straight Flush
//    @BeforeEach
//    void runIt() {
//        hand.add(deck.getCard(3));
//        hand.add(deck.getCard(4));
//        hand.add(deck.getCard(5));
//        hand.add(deck.getCard(6));
//        hand.add(deck.getCard(7));
//    }

    //This Tests High Card
//    @BeforeEach
//    void runIt() {
//        hand.add(deck.getCard(2));
//        hand.add(deck.getCard(3));
//        hand.add(deck.getCard(4));
//        hand.add(deck.getCard(5));
//        hand.add(deck.getCard(12));
//    }

    //This Tests Royal Flush
//    @BeforeEach
//    void runIt() {
//        hand.add(deck.getCard(8));
//        hand.add(deck.getCard(9));
//        hand.add(deck.getCard(10));
//        hand.add(deck.getCard(11));
//        hand.add(deck.getCard(12));
//    }

    //This Tests Flush
//    @BeforeEach
//    void runIt() {
//        hand.add(deck.getCard(13));
//        hand.add(deck.getCard(15));
//        hand.add(deck.getCard(17));
//        hand.add(deck.getCard(24));
//        hand.add(deck.getCard(25));
//    }

    //This Tests a Pair
//    @BeforeEach
//    void runIt() {
//        hand.add(deck.getCard(1));
//        hand.add(deck.getCard(12));
//        hand.add(deck.getCard(17));
//        hand.add(deck.getCard(24)); // <-- King
//        hand.add(deck.getCard(37)); // <-- King
//    }

//    //This Tests two Pairs
//    @BeforeEach
//    void runIt() {
//        hand.add(deck.getCard(12)); // <-- Ace
//        hand.add(deck.getCard(51)); // <-- Ace
//        hand.add(deck.getCard(21)); // <-- Jack
//        hand.add(deck.getCard(34)); // <-- Jack
//        hand.add(deck.getCard(2));
//    }

    //This Tests Three of a Kind
    @BeforeEach
    void runIt() {
        hand.add(deck.getCard(12)); // <-- Ace
        hand.add(deck.getCard(51)); // <-- Ace
        hand.add(deck.getCard(38)); // <-- Ace
        hand.add(deck.getCard(1));
        hand.add(deck.getCard(2));
    }

    //in class
    @org.junit.jupiter.api.Test
    void isStraight() {
        assertTrue(poker.isStraight(hand));
    }

    //in class
    @org.junit.jupiter.api.Test
    void isStraightFlush() { assertTrue(poker.isStraightFlush(hand)); }

    //working
    @org.junit.jupiter.api.Test
    void isHighCard() {
        assertTrue(poker.isHighCard(hand));
    }

    //working
    @org.junit.jupiter.api.Test
    void isRoyalFlush() {assertTrue(poker.isRoyalFlush(hand));}

    //working
    @org.junit.jupiter.api.Test
    void isFlush() {assertTrue(poker.isFlush(hand));}

    //Extra, working
    @org.junit.jupiter.api.Test
    void isOnePair() {assertTrue(poker.isOnePair(hand));}

    //Extra, kinda working
    @org.junit.jupiter.api.Test
    void isTwoPair() {assertTrue(poker.isTwoPair(hand));}

    //Extra, not working
    @org.junit.jupiter.api.Test
    void isThreeOfAKind() {assertTrue(poker.isThreeOfAKind(hand));}

    //Extra, not working
    @org.junit.jupiter.api.Test
    void isFourOfAKind() {assertTrue(poker.isFourOfAKind(hand));}

}