package com.ug9.mobilelegend;

public class Ranged extends Hero implements Skill{

    public Ranged(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void ultimate() {

    }

    @Override
    public void attack(Character enemy) {
        super.attack(enemy);
        if(enemy instanceof Creep){
            this.setHealthBonus(this.getHealth()+150);

        }
    }
}
