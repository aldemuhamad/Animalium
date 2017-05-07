package com.example.aldemuhamad.androidzoo;

/**
 * Created by aldemuhamad on 5/7/2017.
 */

public class AnimalModel {

    String namaInd, namaEng;
    int gambar;

    public String getNamaInd() {
        return namaInd;
    }

    public String getNamaEng() {
        return namaEng;
    }

    public int getGambar() {
        return gambar;
    }

    public AnimalModel(String namaInd, String namaEng, int gambar){
        this.namaInd = namaInd;
        this.namaEng = namaEng;
        this.gambar = gambar;
    }

}
