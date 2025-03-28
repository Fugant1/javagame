package src.main.java.source.systems.combathandlers;

import src.main.java.source.models.Entity;

public class Combatcomponents implements Combat {
    public void attack(Entity attacker, Entity defensor) {
        defensor.takeDamage(attacker.getAttack());
    }

    public boolean canAttack(Entity attacker, Entity defensor) { //will be used if the boss can protect himself for example
        return false;
    }
}
