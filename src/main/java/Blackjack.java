package com.blackjack;

import java.util.ArrayList;
import java.util.Scanner

public class Blackjack
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Deck deck = New Deck();
            deck.shuffle();

            System.out.println("=== Welcome to Blackjack! ===");
            System.out.println("Enter the number of players");
            int numPlayers = scanner.nextInt();
            scanner.nextLine(); //consume newline

        ArrayList<Hand> hands = new ArrayList<>();

        for (int i = 1; i < numPlayers; i++) {
            System.out.println("Enter name for Palyer " + i + ": ";
            String name = scanner.nextLine();
            hands.add(new Hand(name));

            //Deal 2 cards to each player
            for (int i = 0; i < 2; i++) {
                for (Hand hand : hands) {
                    hand.addCard(deck.dealCard());
                }
            }

            System.out.println("\n--- Initial hands ---");
            for (Hand hand : hands) {
                hand.displayHand();
            }

            //Determine winner closet to 21 without going over
