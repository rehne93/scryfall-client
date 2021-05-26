package de.baernreuther.scryfall.client;

import de.baernreuther.scryfall.client.cards.CardModel;
import de.baernreuther.scryfall.client.cards.CardService;

public class Main {

    public static void main(String[] args) {
        CardService cardService = new CardService();
        CardModel cardModel = cardService.fuzzySearch();
        System.out.println(cardModel);
    }
}
