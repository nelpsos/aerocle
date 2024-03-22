package decks;

import java.util.ArrayList;
import java.util.HashMap;

import cards.AbstractCard;

public class Deck {
    public ArrayList<AbstractCard> cards;
    public ArrayList<AbstractCard> sideCards;

    private boolean verifyCards(ArrayList<AbstractCard> cardList) {
        int deckSize = cardList.size();
        if (deckSize != 40) return false;

        HashMap<String, Integer> cardIdMap = new HashMap<String, Integer>();
        for (int i = 0; i < deckSize; ++i) {
            String cardId = cardList.get(i).id;
            int cardQuantity = cardIdMap.containsKey(cardId) ? cardIdMap.get(cardId) + 1 : 1;
            if (cardQuantity > 4) return false;
            cardIdMap.put(cardId, cardQuantity);
        }

        return true;
    }

    public boolean verify() {
        if (!verifyCards(cards)) return false;
        if (!verifyCards(sideCards)) return false;
        return true;
    }
}
