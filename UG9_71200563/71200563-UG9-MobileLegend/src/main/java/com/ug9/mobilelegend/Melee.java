package com.ug9.mobilelegend;

public class Melee extends Hero implements Skill{

    public Melee(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void ultimate() {

    }

    @Override
    public void attack(Character enemy) {
        super.attack(enemy);
        if(enemy instanceof Creep){
            this.setHealthBonus(this.getHealth()+200);

        }
    }
}
