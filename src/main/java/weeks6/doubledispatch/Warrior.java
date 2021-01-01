package weeks6.doubledispatch;

public class Warrior extends Character{

    @Override
    public void attack(Weapon weapon) {
        System.out.println("Warrior attack - " + weapon.getClass().getSimpleName() + " attack point : " + weapon.attackPoint(this));
    }
}
