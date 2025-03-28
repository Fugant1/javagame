//class of the minions of the boss
public class minion extends entity {
    public minion(String name, String description, int health, int attack, int defense, int speed) {
        super(name, description, health, attack, defense, speed);
    }

    @Override
    public void makeSound() {
        return;
    }
}