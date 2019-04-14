package com.bagicode.myapplicationrv;

public class MahasiswaModel {

    String nama, kelas;

    public MahasiswaModel(){

    }

    public MahasiswaModel(String nama, String kelas) {
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
