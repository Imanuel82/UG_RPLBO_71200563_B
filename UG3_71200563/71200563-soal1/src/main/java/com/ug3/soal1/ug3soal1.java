package com.ug3.soal1;

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class ug3soal1 {
    public static void main(String[]args){
        System.out.println("Absen disini");
        System.out.print("Nama karyawan: ");
        String namakaryawan = inp.nextLine();
        System.out.println("Berhasil absensi");
        System.out.println("Atas nama : " + namakaryawan);
        DateFormat tanggal = new SimpleDateFormat("dd-MMMM-yyyy");
        String Tgl = tanggal.format(new Date()).toString();
        System.out.println("Pada tanggal : " + Tgl);
        DateFormat jam = new SimpleDateFormat("hh:mm:ss aa");
        String Jam = tanggal.format(new Date()).toString();
        System.out.println("Pukul : " + Jam);
    }

}
