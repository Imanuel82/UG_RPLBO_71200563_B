package com.rplbo.ug8;

public abstract class Character {
    protected String name;
    protected int health;
    protected int damage;


    public Character(String name, int health ,int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void showCharacterInfo() {
        System.out.println("Character\t: " + this.name);
        System.out.println("Health\t\t: " + this.health);
        System.out.println("Damage\t\t: " + this.damage);
    }

    public  void attacked(int damage) {

    }

    public boolean isDie() {
        if(this.health <= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public abstract void attack(Creep creep);
}
