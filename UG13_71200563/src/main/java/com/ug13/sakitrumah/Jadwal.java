package com.ug13.sakitrumah;

public class Jadwal {
    private Pengunjung pengunjung;
    private Pemeriksa pemeriksa;
    private Perawat perawat;
    private Pendaftaran pendaftaran;
    private Boolean statusDaftar =  false;
    private Boolean statusScreening = false;
    public Jadwal() {
    }
    public Pengunjung getPengunjung() {
        return pengunjung;
    }
    public Pemeriksa getPemeriksa() {
        return pemeriksa;
    }
    public Perawat getPerawat() {
        return perawat;
    }
    public Pendaftaran getPendaftaran() {
        return pendaftaran;
    }
    public Boolean getStatusDaftar() {
        return statusDaftar;
    }
    public Boolean getStatusScreening() {
        return statusScreening;
    }
    public void setPengunjung(Pengunjung pengunjung) {
        this.pengunjung = pengunjung;
    }
    public void setPemeriksa(Pemeriksa pemeriksa) {
        this.pemeriksa = pemeriksa;
    }
    public void setPerawat(Perawat perawat) {
        this.perawat = perawat;
    }
    public void setPendaftaran(Pendaftaran pendaftaran) {
        this.pendaftaran = pendaftaran;
    }
    public void setStatusDaftar(Boolean statusDaftar) {
        this.statusDaftar = statusDaftar;
    }
    public void setStatusScreening(Boolean statusScreening) {
        this.statusScreening = statusScreening;
    }
}
