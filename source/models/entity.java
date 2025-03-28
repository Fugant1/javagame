//abstract class that implements some functions that are general in entities from the game and create the builder
public abstract class entity implements animal {
    protected String name;
    protected String description;
    protected int health;
    protected int attack;
    protected int defense;
    protected int speed;

    public entity(String name, String description, int health, int attack, int defense, int speed) {
        this.name = name; this.description = description; this.attack = attack;
        this.health = health; this.defense = defense; this.speed = speed;
    }

    @Override 
    public String getName() {
        return this.name;
    }
    @Override
    public String getDescription() {
        return this.description;
    }
    @Override
    public int getHealth() {
        return this.health;
    }
    @Override
    public int getAttack() {
        return this.attack;
    }
    @Override
    public int getDefense() {
        return this.defense;
    }
    @Override
    public int getSpeed() {
        return this.speed;
    }
    @Override
    public void takeDamage(int dmg) {
        dmg -= this.defense;
        dmg *= -1;
        if(dmg > 0) {
            return;
        }
        this.updateHealth(dmg);
    }
    @Override
    public void updateHealth(int diff) { //this function update the health when using a pot or taking damage
        this.health += diff;
    }
    @Override
    public boolean isAlive() {
        return (this.health > 0);
    }
}   