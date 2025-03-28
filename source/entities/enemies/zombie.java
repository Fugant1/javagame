public class zombie extends entity {
    public zombie(String name, String description, int health, int attack, int defense, int speed) {
        super(name, description, health, attack, defense, speed);
    }

    @Override
    public void makeSound() {
        return;
    }
}