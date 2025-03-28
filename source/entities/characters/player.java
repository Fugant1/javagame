//player class
public final class player extends entity {
    private String ability;
    public player(String name, String description, int health, int attack, int defense, int speed, String ability) {
        super(name, description, health, attack, defense, speed);
        this.ability = ability;
    }

    @Override
    public void makeSound() {
        return;
    }
    public void useAbility(String nameAbility) {
        if(this.ability.equals(nameAbility))
            return;
    }
}