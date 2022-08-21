public class Medic extends Hero {
    int healthPoints = 50;
    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил лечение");
    }
    public void increaseExperience(){
        healthPoints = (healthPoints / 10) + healthPoints;
        System.out.println("У Medic увеличен опыт");
    }
}
