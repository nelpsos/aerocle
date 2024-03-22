package cards;

public abstract class AbstractSpellCard extends AbstractCard {
    public CardSpellType spellType;

    public static enum CardSpellType {
        GENERAL, PERMANENT, CONDITIONAL
    }

    public AbstractSpellCard(String id, String name, String img, int cost, String rawDescription, /** CardType type,*/CardRegion region, String favoriteText, CardSpellType spellType) {
        super(id, name, img, cost, rawDescription, CardType.SPELL, region, favoriteText);
        this.spellType = spellType;
    }
}
