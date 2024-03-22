package cards;

public abstract class AbstractCard {
    public String id;
    public String name;
    public String img;
    public int cost;
    public String rawDescription;
    public CardType type;
    public CardRegion region;
    public String favoriteText;

    public static enum CardRegion {
        SEVEN_SWORD, ACADEMY
    }

    public static enum CardType {
        ITEM, SPELL, UNIT
    }

    public AbstractCard(String id, String name, String img, int cost, String rawDescription, CardType type, CardRegion region, String favoriteText) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.cost = cost;
        this.rawDescription = rawDescription;
        this.type = type;
        this.region = region;
        this.favoriteText = favoriteText;
    }
}
