package weeks6.doubledispatch;

public class Wand extends Weapon{

    public Wand(int attackPoint) {
        super(attackPoint);
    }

    @Override
    public double attackPoint(Warrior warrior) {
        return this.attackPoint * 0.3;
    }

    @Override
    public double attackPoint(Magician magician) {
        return this.attackPoint;
    }

    @Override
    public double attackPoint(Archer archer) {
        return this.attackPoint * 0.5;
    }
}
