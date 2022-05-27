package com.ug12.aplikasistockbit;

import java.util.ArrayList;


public class Stockbit {
    private ArrayList<Investor> arrInvestor;
    public Investor investor;

    public Stockbit() {
        arrInvestor = new ArrayList<>();
    }
    public void register(Investor investor) {
        arrInvestor.add(investor);
        System.out.println("Registrasi akun atas nama " + investor.getNama() +" sukses");
    }
    public void login(String username ,String password) {
        boolean status = false;
        for (Investor i : arrInvestor) {
            if (i.getUsername().equals(username) && i.getPassword().equals(password)) {
                this.investor = i;
                status = true;
            }
        }
        if (status == false) {
            System.out.println("Username/password anda salah");
        }
        else{
            System.out.println("login berhasil");
        }
    }

    public void printPortfolio() {

    }

    public void orderBeli(Saham saham, int i) {
    }

    public void orderJual(Saham saham, int i) {
    }
}
