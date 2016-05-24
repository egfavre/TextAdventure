package com.Favre;

/**
 * Created by user on 5/24/16.
 */
public class Character {
    //generic Class to store common factors
    String name;
    int health;
    int damage;


    //anything object that extend Character Class can battle any other
    public void battle(Character enemy){
        System.out.printf("A wild %s appeared.\n", enemy.name);
        //pull enemy object and then related name

        //are both characters still alive- player and enemy
        while(this.health > 0 && enemy.health > 0) {
            this.health -= enemy.damage;
            enemy.health -= this.damage;
            //within loop print values so you can see what is happening
            System.out.printf("%s's health: %s\n", this.name, this.health);
            System.out.printf("%s's health: %s\n", enemy.name, enemy.health);
        }

        if (this.health <=0) {
            System.out.printf("You have died.\n");
        }
        if (enemy.health <= 0){
            System.out.printf("%s has died.\n", enemy.name);
    }
}
}
