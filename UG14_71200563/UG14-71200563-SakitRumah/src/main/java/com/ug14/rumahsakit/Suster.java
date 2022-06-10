package com.ug14.rumahsakit;

import org.jetbrains.annotations.NotNull;

public class Suster {
    private int idSuster;
    private String nama;

    public Suster(String nama){
        this.nama = nama;
    }
    public void screening(Pasien pasien, @NotNull Jadwal jadwal){
        if (this.equals(jadwal.getPasien())){
            if(jadwal.getPasien().equals(pasien) && jadwal.getStatusDaftar()){
                jadwal.setStatusScreening(true);
                System.out.println("Screening berhasil !");
            }else {
                System.out.println(
                        "====================ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYAN===================="
                );
            }
        }else {
            System.out.println("ERROR !");
        }
    }

    public int getIdSuster() {
        return idSuster;
    }
    public String getNama() {
        return nama;
    }
    public void setIdSuster(int idSuster) {
        this.idSuster = idSuster;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
}
