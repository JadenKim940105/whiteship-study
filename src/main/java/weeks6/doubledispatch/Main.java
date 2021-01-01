package weeks6.doubledispatch;

import weeks6.Inheritance.hierachical.A;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Weapon> weapons = Arrays.asList(new Sword(10), new Arrow(10), new Wand(10));
        List<Character> characters = Arrays.asList(new Warrior(), new Magician(), new Archer());

        characters.forEach(c -> weapons.forEach(w -> c.attack(w)));




    }
}
