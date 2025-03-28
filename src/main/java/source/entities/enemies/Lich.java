package src.main.java.source.entities.enemies;

import src.main.java.source.models.Entity;

//class for the boss of the game
//ps: the name of the boss is fucking 'MARCELO'
public final class Lich extends Entity {
    public Lich(String name, String description, int health, int attack, int defense, int speed) {
        super(name, description, health, attack, defense, speed);
    }

    @Override
    public void makeSound() {
        return;
    }
}