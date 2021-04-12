package edu.wctc.creator;

import java.util.List;

/**
 * Class that tests whether Hand Variation is either true or false
 */
public class Poker {

    private static final int HIGH_CARD = 14;
    private static final int CARDS_IN_HAND = 5;

    /**
     * @param hand users hand
     * @return returns whether hand is Straight
     */
    public boolean isStraight(List<Card> hand) {
        boolean isTheHand = true;
        int prevScore = 0;
        int score = 0;

        for(int i = 0; i < CARDS_IN_HAND;i++) {
            Card card = hand.get(i);
            score = card.getScore();

            if((score == prevScore++) && (i != 0)){
                isTheHand = false;
                prevScore = score;
            }
        }
        return  isTheHand;
    }

    /**
     * @param hand users hand
     * @return returns whether hand is a Straight Flush
     */
    public boolean isStraightFlush(List<Card> hand) {
        boolean isTheHand = true;
        int prevScore = 0;
        String prevSuit = "";
        String suit = "";
        int score = 0;

        for(int i = 0; i < CARDS_IN_HAND;i++) {
            Card card = hand.get(i);
            score = card.getScore();

            if(((score == prevScore++) && (i != 0)) || (!suit.equalsIgnoreCase(prevSuit) && (i !=0))){
                isTheHand = false;
                prevSuit = suit;
            }
        }
        return isTheHand;
    }

    /**
     * @param hand users hand
     * @return returns whether hand has a high-card
     */
    public boolean isHighCard(List<Card> hand) {
        boolean isTheHand = false;
        int score = 0;


        for(int i = 0; i < CARDS_IN_HAND; i++) {
            Card card = hand.get(i);
            score = card.getScore();

            if(score == HIGH_CARD) {
                isTheHand = true;
            }
        }
        return isTheHand;
    }

    /**
     * @param hand users hand
     * @return returns whether hand is a royal flush
     */
    public boolean isRoyalFlush(List<Card> hand) {
        boolean isTheHand = true;
        int prevScore = 0;
        String prevSuit = "";
        String suit = "";
        int score = 0;

        for(int i = 0; i < CARDS_IN_HAND; i++) {
            Card card = hand.get(i);
            score = card.getScore();
            suit = card.getSuit();

            if((score != prevScore++) && !(score >= 10) && !(suit.equalsIgnoreCase(prevSuit))){
                isTheHand = false;
                prevSuit = suit;
            }
        }
        return isTheHand;
    }

    /**
     * @param hand users hand
     * @return returns whether hand is a flush
     */
    public boolean isFlush(List<Card> hand) {
        boolean isTheHand = false;
        int prevScore = 0;
        String prevSuit = "";
        String suit = "";
        int score = 0;

        for(int i = 0; i < CARDS_IN_HAND;i++) {
            Card card = hand.get(i);
            score = card.getScore();

            if(suit.equalsIgnoreCase(prevSuit)){
                isTheHand = true;
                prevSuit = suit;
            }
        }
        return isTheHand;
    }

     /**
     * @param hand users hand
     * @return returns whether hand has a pair
     */ //extra
    public boolean isOnePair(List<Card> hand) {
        boolean isTheHand = false;

        for (int i = 0; i < hand.size()-1; i++)
        {
            for (int k = i++; k < hand.size(); k++)
            {
                if(hand.get(i).getScore() == hand.get(k).getScore())
                {
                    isTheHand = true;
                    break;
                }
            }
        }
        return isTheHand;
    }

    /**
     * @param hand users hand
     * @return returns whether hand has two pairs
     */ //extra
    public boolean isTwoPair(List<Card> hand) {
        List<Card> tempHand;
        boolean hasOnePair = false;
        boolean hasTwoPair = false;
        boolean isTheHand = false;

        tempHand = hand;

        for (int i = 0; i < hand.size()-1; i++)
        {
            for (int k = i++; k < hand.size(); k++)
            {
                if (hand.get(i).getScore() == hand.get(k).getScore())
                {
                    hasOnePair = true;
                    tempHand.remove(i);
                    tempHand.remove(k);
                    break;
                }
            }
        }

        for (int i = 0; i < tempHand.size()-1; i++)
        {
            for (int k = i++; k < tempHand.size(); k++)
            {
                if (tempHand.get(i).getScore() == tempHand.get(k).getScore()) {
                    hasTwoPair = true;
                    break;
                }
            }
        }

        if(hasOnePair && hasTwoPair) {
            isTheHand = true;
        }

        return isTheHand;
    }

    /**
     * @param hand users hand
     * @return returns whether hand matches Three Of A Kind
     */ //extra
    public boolean isThreeOfAKind(List<Card> hand) {
        boolean isTheHand = false;
        int prevScore = 0;
        int numOfKind = 0;
        int score = 0;

        for(int i = 0; i < CARDS_IN_HAND;i++) {
            Card card = hand.get(i);
            score = card.getScore();

            if(score == prevScore){
                numOfKind++;
                prevScore = score;

                if(numOfKind == 3) {
                    isTheHand = true;
                    break;
                }
            }
        }
        return isTheHand;
    }

    /**
     * @param hand users hand
     * @return returns whether hand matches Four Of A Kind
     */ //extra
    public boolean isFourOfAKind(List<Card> hand) {
        boolean isTheHand = false;
        int prevScore = 0;
        int numOfKind = 0;
        int score = 0;

        for(int i = 0; i < CARDS_IN_HAND;i++) {
            Card card = hand.get(i);
            score = card.getScore();

            if(score == prevScore){
                numOfKind++;
                prevScore = score;

                if(numOfKind == 4) {
                    isTheHand = true;
                    break;
                }
            }
        }
        return isTheHand;
    }
}
