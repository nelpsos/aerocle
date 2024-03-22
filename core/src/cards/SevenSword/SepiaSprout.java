package cards.SevenSword;

import cards.AbstractUnitCard;

public class SepiaSprout extends AbstractUnitCard {
    public static final String id = "Sepia Sprout";
    private static final CardStrings cardStrings;

    public SepiaSprout() {
        super("Sepia Sprout", cardStrings.NAME, /** image path */null, 1, cardStrings.DESCRIPTION, CardRegion.SEVEN_SWORD, cardStrings.FAVORITE_TEXT, CardRace.HUMAN, CardJob.GUARD, 2, 2, 2);
        this.cost = 1;
        this.speed = 2;
        this.attack = 2;
        this.health = 2;
    }

    static {
        cardStrings = aerocle.languagePack.getCardStrings("Sepia Sprout");
    }
}
