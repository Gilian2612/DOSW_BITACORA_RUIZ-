package E04;

public class Warrior implements Character {

    private final String armor;
    private final String weapon;
    private final String skill;

    Warrior(String armor, String weapon, String skill) {
        this.armor = armor;
        this.weapon = weapon;
        this.skill = skill;
    }

    @Override
    public String attack() {
        return "Warrior ataca con " + weapon + " [armadura: " + armor + ", skill: " + skill + "]";
    }

    @Override
    public int getPower() {
        return 50;
    }
}
