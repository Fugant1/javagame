//Interface to store all the functions in general animals from the game
package src.main.java.source.models;

public interface Animal {
    String getName();
    String getDescription();
    int getHealth();
    void takeDamage(int damage);
    void updateHealth(int difference);
    int getAttack();
    int getDefense();
    int getSpeed();
    boolean isAlive();
    void makeSound();
}