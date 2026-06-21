package E04;
public class Main {
    public static void main(String[] args) {
        WarriorBuilder builder = new WarriorBuilder();
        Character warrior = builder.setArmor("steel")
                                   .setWeapon("sword")
                                   .setSkill("rage")
                                   .build();
        System.out.println(warrior.attack());
        System.out.println("Poder: " + warrior.getPower());
        System.out.println();
        Character powered = new ShieldDecorator(
                                new SpeedDecorator(warrior));

        System.out.println(powered.attack());
        System.out.println("Poder: " + powered.getPower());
        System.out.println();

        Character superPowered = new InvisibilityDecorator(powered);
        System.out.println(superPowered.attack());
        System.out.println("Poder: " + superPowered.getPower());
        System.out.println();
        System.out.println("Base intacto: " + warrior.attack());
        System.out.println("Poder base: " + warrior.getPower());
    }
}
