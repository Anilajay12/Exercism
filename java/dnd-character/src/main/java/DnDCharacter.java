import java.util.Random;

class DnDCharacter {

    private int ability = randomAbilityCalculator();
    private int strength = randomAbilityCalculator();
    private int dexterity = randomAbilityCalculator();
    private int constitution = randomAbilityCalculator();
    private int intelligence = randomAbilityCalculator();
    private int wisdom = randomAbilityCalculator();
    private int charisma = randomAbilityCalculator();

    private int randomAbilityCalculator() {
        return new Random().ints(4, 1, 6).sorted().skip(1).sum();
    }

    int ability() {
        return ability;
    }

    int modifier(int input) {
        return (int) Math.floor((float) (input - 10) / 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }

}