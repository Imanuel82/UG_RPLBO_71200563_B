package com.ug7.game;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Player P_71190480 = new Player("bantolostd", "prakrplboasik");
        Player P_71200563 = new Player("imanuelvs", "prakrplbonuel");
        Ninja A_71190480 = new Ninja(P_71190480);
        Penyihir A_71200563 = new Penyihir(P_71200563);
        System.out.println("\n========== AWAL ==========");
        A_71190480.getInfo();
        A_71200563.getInfo();
        System.out.println("\n========== NORMAL ATTACK #1 ==========");
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.normalAttack(A_71200563);
        System.out.println("\n========== BELI SENJATA #1 ==========");
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.buyWeapon(2);
        System.out.print("[" + A_71200563.getPlayer().getUsername() + "] - ");
        A_71200563.buyWeapon(4);
        System.out.println("\n========== BELI SENJATA #2 ==========");
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.buyWeapon(1);
        System.out.print("[" + A_71200563.getPlayer().getUsername() + "] - ");
        A_71200563.buyWeapon(3);
        System.out.println("\n========== NORMAL ATTACK #2 ==========");
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.normalAttack(A_71200563);
        System.out.print("[" + A_71200563.getPlayer().getUsername() + "] - ");
        A_71200563.normalAttack(A_71190480);
        System.out.println("\n========== ABILITY ATTACK #1 ==========");
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.abilityAttack(A_71200563);
        System.out.print("[" + A_71200563.getPlayer().getUsername() + "] - ");
        A_71200563.abilityAttack(A_71190480);
        System.out.println("\n========== WALKING AND NORMAL ATTACK #1 ==========");
        A_71190480.walk(true);
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.normalAttack(A_71200563);
        A_71200563.walk(true);
        System.out.print("[" + A_71200563.getPlayer().getUsername() + "] - ");
        A_71200563.normalAttack(A_71190480);
        System.out.println("\n========== ABILITY ATTACK #2 ==========");
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.abilityAttack(A_71200563);
        System.out.print("[" + A_71200563.getPlayer().getUsername() + "] - ");
        A_71200563.abilityAttack(A_71190480);
        System.out.println("\n========== WAR #1 ==========");
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.walk(false);
        System.out.print("[" + A_71200563.getPlayer().getUsername() + "] - ");
        A_71200563.walk(false);
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.normalAttack(A_71200563);
        System.out.print("[" + A_71200563.getPlayer().getUsername() + "] - ");
        A_71200563.normalAttack(A_71190480);
        System.out.print("[" + A_71190480.getPlayer().getUsername() + "] - ");
        A_71190480.abilityAttack(A_71200563);
        System.out.println("\n========== AKHIR ==========");
        A_71190480.getInfo();
        A_71200563.getInfo();
    }
}
