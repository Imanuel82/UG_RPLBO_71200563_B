package com.ug12.aplikasistockbit;

import java.util.HashMap;

public class Investor {
    private String username;
    private String password;
    private HashMap<Saham, Integer> portfolio = new HashMap<>();
    private String nama;
    public Investor(String username, String password, String nama){
        this.username=username;
        this.password=password;
        this.nama=nama;
    }
    public String getUsername(){return username;}
    public String getPassword(){return password;}
    public String getNama(){return nama;}
    public HashMap<Saham, Integer> getPortfolio() {
        return portfolio;
    }
}
