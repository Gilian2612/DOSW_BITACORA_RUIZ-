package E04;

public class WarriorBuilder {

    private String armor = "leather";
    private String weapon = "fists";
    private String skill = "basic";

    public WarriorBuilder setArmor(String armor) { this.armor = armor; return this; }
    public WarriorBuilder setWeapon(String weapon) { this.weapon = weapon; return this; }
    public WarriorBuilder setSkill(String skill) { this.skill = skill; return this; }

    public Character build() {
        return new Warrior(armor, weapon, skill);
    }
}
