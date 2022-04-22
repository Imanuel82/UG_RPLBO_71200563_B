package com.rplbo.ug8;

public abstract class Hero extends Character implements AttackingCreep{
    public Hero(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attack(Creep creep) {

    }
}
