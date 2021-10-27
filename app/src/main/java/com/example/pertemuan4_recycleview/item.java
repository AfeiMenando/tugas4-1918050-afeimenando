package com.example.pertemuan4_recycleview;

public class item {
    private String Merk,Ukuran,Jumlah;
    private int logo;

    public item(String Merk, String Ukuran, String Jumlah, int logo) {
        this.Merk = Merk;
        this.Ukuran = Ukuran;
        this.Jumlah = Jumlah;
        this.logo = logo;

    }

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public String getUkuran() {
        return Ukuran;
    }

    public void setPemilik(String Ukuran) {
        this.Ukuran = Ukuran;
    }

    public String getJumlah() {
        return Jumlah;
    }

    public void setJumlah(String Jumlah) {
        this.Jumlah = Jumlah;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}