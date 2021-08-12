package com.wisata.uas10118392.model;
/*
 * Tanggal pengerjaan : 9 Agustus 2021
 * Nim                : 10118392
 * Nama               : Raden Arvin Rizky A
 * Kelas              : IF-9
 * */
public class MarkerModel {

    String nama,kategori;
    double latitude,longitude;

    public MarkerModel(){

    }

    public MarkerModel(String nama, String kategori, double latitude, double longitude) {
        this.nama = nama;
        this.kategori = kategori;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
