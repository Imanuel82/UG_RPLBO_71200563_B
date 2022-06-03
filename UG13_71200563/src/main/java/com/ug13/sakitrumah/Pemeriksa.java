package com.ug13.sakitrumah;

import java.io.*;

public class Pemeriksa {
    private String nama;
    private String spesialis;
    private String ruangan;
    public Pemeriksa(String nama, String spesialis, String ruangan){
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }
    public void cekStatus(Pengunjung pengunjung) {
        if (pengunjung.getLevelPenyakit() == 0) {
            System.out.println("===============SELAMAT PASIEN ANDA SUDAH SEMBUH DAN SEHAT===============");
        } else {
            System.out.println("===============PASIEN ANDA MASIH SAKIT===============");
        }
    }
    public void memeriksa(Pengunjung pengunjung, Jadwal jadwal) throws IOException, ClassNotFoundException {
        if (jadwal.getStatusScreening()){
            if(pengunjung.getLevelPenyakit()!=0){
                pengunjung.setLevelPenyakit(pengunjung.getLevelPenyakit()-1);
            } else {
                pengunjung.setStatus(true);
            }
        } else {
            System.out.println("==================ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYANAN==================");
        }
    }
}
