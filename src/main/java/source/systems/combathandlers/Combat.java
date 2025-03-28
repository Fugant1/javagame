package src.main.java.source.systems.combathandlers;

import src.main.java.source.models.Entity;

public interface Combat {
    void attack(Entity attacker, Entity defensor);
    boolean canAttack(Entity attacker, Entity defensor);
}