package com.bagicode.myapplicationrv.rc_listener;

public class MahasiswaModelListener {

    String nama, kelas;

    public MahasiswaModelListener(){

    }

    public MahasiswaModelListener(String nama, String kelas) {
        this.nama = nama;
        this.kelas = kelas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}
