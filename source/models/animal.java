public interface animal {
    String getName();
    String getDescription();
    int getHealth();
    void updateHealth(int newHealth);
    int getAttack();
    int getDefense();
    int getSpeed();
    int attack();
    int defense();
    boolean isAlive();
    void reset();
}