package com.ug5b.soal2;

public class Buku {
    private String KodeBuku;
    private String namaBuku;
    private long hargaBuku;
    private String namaPenulis;
    private static int nextNum = 1;
    private Integer persediaan;

    public Buku (String argJudul,String argPenulis, long argHarga, Integer argPersediaan) {
        KodeBuku = "NV24510" + nextNum++;
        namaBuku = argJudul;
        namaPenulis = argPenulis;
        hargaBuku = argHarga;
        persediaan = argPersediaan;
    }

    public String getKode() {
        return KodeBuku;
    }

    public String getJudul() {
        return namaBuku;
    }

    public String getPenulis() {
        return namaPenulis;
    }

    public long getHarga() {
        return hargaBuku;
    }

    public Integer getPersediaan() {
        return persediaan;
    }
}
