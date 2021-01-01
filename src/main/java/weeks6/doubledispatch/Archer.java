package weeks6.doubledispatch;

public class Archer extends Character{
    @Override
    public void attack(Weapon weapon) {
        System.out.println("Archer attack ! : " + weapon.getClass().getSimpleName() + " attackPoint : " + weapon.attackPoint(this));
    }
}
