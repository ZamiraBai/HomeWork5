package com.company;

import java.util.Random;

public class Boss {
    private int health;
    private int damage;
    private int bossDefence;

    public Boss(int health, int damage, int bossDefence) {
        this.health = health;
        this.damage = damage;
        this.bossDefence = bossDefence;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getBossDefence() {
        return bossDefence;
    }

    public void setBossDefence(int bossDefence) {
        this.bossDefence = bossDefence;
    }

    public  void changeBossDefence() {
        Random random = new Random();
        int randomInt = random.nextInt(2);
        bossDefence = bossDefence * randomInt;
        setBossDefence(bossDefence);
    }

}


