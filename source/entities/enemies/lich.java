//class for the boss of the game
//ps: the name of the boss is fucking 'MARCELO'
public final class lich extends entity {
    public lich(String name, String description, int health, int attack, int defense, int speed) {
        super(name, description, health, attack, defense, speed);
    }

    @Override
    public void makeSound() {
        return;
    }
}