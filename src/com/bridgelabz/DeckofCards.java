package com.bridgelabz;

import java.util.Random;

public class DeckofCards {
     String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
     String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int[][] cards = new int[4][13];

    public void distrubuteOneCard() {
        Random random = new Random();
        int suit = random.nextInt(4);
        int rank = random.nextInt(13);

        if(cards[suit][rank] != 0) {
            distrubutecards();
        } else {
            cards[suit][rank] = 1;
        }
    }
    public void distrubutecards() {
        for(int i = 0; i < 9; i++) {
            distrubuteOneCard();
        }
    }


        void showDeck() {
            for(int suit = 0; suit < 4; suit ++) {
                for(int rank = 0; rank < 13; rank++) {
                    if(cards[suit][rank] == 1) {
                        System.out.println( suit + " " + rank );
                    }
                }
            }
        }
    public static void main(String[] args) {
        DeckofCards player = new DeckofCards();
        player.distrubutecards();
        player.showDeck();
    }
    }