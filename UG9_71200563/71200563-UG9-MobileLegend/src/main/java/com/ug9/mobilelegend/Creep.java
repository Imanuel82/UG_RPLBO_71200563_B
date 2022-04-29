package com.ug9.mobilelegend;

public class Creep extends NPC{
    public Creep(String name, int damage, int health){
        super(name, damage, health);
    }
    @Override
    public void attack(Character enemy) {super.attack(enemy);}
}
