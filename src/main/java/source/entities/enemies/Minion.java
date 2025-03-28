package src.main.java.source.entities.enemies;

import src.main.java.source.models.Entity;

//class of the minions of the boss
public class Minion extends Entity {
    public Minion(String name, String description, int health, int attack, int defense, int speed) {
        super(name, description, health, attack, defense, speed);
    }

    @Override
    public void makeSound() {
        return;
    }
}