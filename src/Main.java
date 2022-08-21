public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic();
        medic.increaseExperience();
        Hero[] heroes = { new Magic(), new Medic(), new Warrior()};
        for (int i = 0; i < heroes.length; i++) {
        heroes[i].applySuperAbility();
            medic.increaseExperience();
            System.out.println(medic.healthPoints);
        }
    }
}