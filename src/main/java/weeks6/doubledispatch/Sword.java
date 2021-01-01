package weeks6.doubledispatch;

public class Sword extends Weapon {

    public Sword(int attackPoint) {
        super(attackPoint);
    }

    @Override
    public double attackPoint(Warrior warrior) {
        return this.attackPoint;
    }

    @Override
    public double attackPoint(Magician magician) {
        return attackPoint * 0.3;
    }

    @Override
    public double attackPoint(Archer archer) {
        return attackPoint * 0.5;
    }
}
