package weeks6.doubledispatch;

public abstract class Weapon {
    protected int attackPoint;

    public Weapon(int attackPoint){
        this.attackPoint = attackPoint;
    }
    public abstract double attackPoint(Warrior warrior);
    public abstract double attackPoint(Magician magician);
    public abstract double attackPoint(Archer archer);
}
