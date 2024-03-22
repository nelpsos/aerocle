package cards;

public abstract class AbstractItemCard extends AbstractCard {
    public int attack;
    public int health;
    public int speed;
    public CardStatusType statusType;
    public CardItemType itemType;
    public boolean onlyRegion;

    public static enum CardItemType {
        WEAPON, CONSUMABLE, EQUIP, ACCESSORY
    }

    public static enum CardStatusType {
        ATTACK, HEALTH, SPEED
    }

    public AbstractItemCard(String id, String name, String img, int cost, String rawDescription, /** CardType type,*/CardRegion region, String favoriteText, int attack, int health, int speed, CardStatusType statusType, CardItemType itemType, boolean onlyRegion) {
        super(id, name, img, cost, rawDescription, CardType.ITEM, region, favoriteText);
        this.attack = attack;
        this.health = health;
        this.speed = speed;
        this.statusType = statusType;
        this.itemType = itemType;
        this.onlyRegion = onlyRegion;
    }
}
