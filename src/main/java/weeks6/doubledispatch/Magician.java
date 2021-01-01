package weeks6.doubledispatch;

public class Magician extends Character {
    @Override
    public void attack(Weapon weapon) {
        System.out.println("Magician attack - " + weapon.getClass().getSimpleName() + " attack point : " + weapon.attackPoint(this));
    }
}
