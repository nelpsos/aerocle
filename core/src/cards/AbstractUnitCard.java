package cards;

public abstract class AbstractUnitCard extends AbstractCard {
    public CardRace race;
    public CardJob job;
    public int speed;
    public int attack;
    public int health;

    public static enum CardRace {
        HUMAN, GHOST, ELF, HALF_DEMON, VAMPIRE, ANTHRO, DRAGON, GOLEM
    }

    public static enum CardJob {
        GUARD, SOLDIER, SHAMAN, WIZARD, EXPLORER, NECROMANCER, WARRIOR, KNIGHT
    }

    public AbstractUnitCard(String id, String name, String img, int cost, String rawDescription, /** CardType type, */CardRegion region, String favoriteText, CardRace race, CardJob job, int speed, int attack, int health) {
        super(id, name, img, cost, rawDescription, CardType.UNIT, region, favoriteText);
        this.race = race;
        this.job = job;
        this.speed = speed;
        this.attack = attack;
        this.health = health;
    }
}
