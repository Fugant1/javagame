package src.main.java.source.entities.characters;

import java.util.ArrayList;
import java.util.List;

import src.main.java.source.models.Entity;

//player class
public final class Player extends Entity {
    private List<String> inventory;
    private List<String> abilities;
    public Player(String name, String description, int health, int attack, int defense, int speed) {
        super(name, description, health, attack, defense, speed);
        this.inventory = new ArrayList<String>();
        this.abilities = new ArrayList<String>();
    }

    @Override
    public void makeSound() {
        return;
    }

    public void storeInInventory(String nameItem) {
        this.inventory.add(nameItem);
    }
    public void learnAbility(String nameAbility) {
        this.abilities.add(nameAbility);
    }
}