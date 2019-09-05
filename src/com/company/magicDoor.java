package com.company;

public class magicDoor {
    public Hero[] generate() {
        Hero [] heroes = new Hero[4];
        Hero warrior = new Hero(200, 50, 100);
        heroes[0] = warrior;
        Hero kinetic = new Hero(200, 50, 100);
        heroes[1] = kinetic;
        Hero medic = new Hero(200, 50, 100);
        heroes[2] = medic;
        Hero physic = new Hero(200, 50, 100);
        heroes[3] = physic;

        return heroes;
    }
}
