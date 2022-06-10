package com.ug14.rumahsakit;

public class Jadwal {
    private int idPemeriksa;
    private Pasien pasien;
    private Dokter dokter;
    private Suster suster;
    private Pelayanan pelayanan;
    private Boolean statusDaftar = false;
    private Boolean statusScreening = false;
    public Jadwal(){
    }
    public int getIdPemeriksa(){
        return idPemeriksa;
    }
    public Pasien getPasien(){
        return pasien;
    }
    public Dokter getDokter(){
        return dokter;
    }
    public Suster getSuster(){
        return suster;
    }
    public Pelayanan getPelayanan(){
        return pelayanan;
    }
    public Boolean getStatusDaftar(){
        return statusDaftar;
    }
    public Boolean getStatusScreening(){
        return statusScreening;
    }
    public void setIdPemeriksa(int Pemeriksa){
        this.idPemeriksa = idPemeriksa;
    }
    public void setPasien(Pasien pasien){
        this.pasien = pasien;
    }
    public void setDokter(Dokter dokter){
        this.dokter = dokter;
    }
    public void setSuster(Suster suster){
        this.suster = suster;
    }
    public void setPelayanan(Pelayanan pelayanan){
        this.pelayanan = pelayanan;
    }
    public void setStatusDaftar(Boolean statusDaftar){
        this.statusDaftar = statusDaftar;
    }
    public void setStatusScreening(Boolean statusScreening){
        this.statusScreening = statusScreening;
    }
}
