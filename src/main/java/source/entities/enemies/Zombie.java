package src.main.java.source.entities.enemies;

import src.main.java.source.models.Entity;

public class Zombie extends Entity {
    public Zombie(String name, String description, int health, int attack, int defense, int speed) {
        super(name, description, health, attack, defense, speed);
    }

    @Override
    public void makeSound() {
        return;
    }
}