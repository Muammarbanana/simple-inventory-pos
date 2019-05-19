package com.example.inventoridutabangunan;

public class DataBarang {
    private String namaBarang;
    private String kodeBarang;
    private String stokBarang;
    private String satuanBarang;
    private String hargaDasar;
    private String hargaJual;

    public DataBarang(String namaBarang, String kodeBarang, String stokBarang, String satuanBarang, String hargaDasar, String hargaJual) {
        this.namaBarang = namaBarang;
        this.kodeBarang = kodeBarang;
        this.stokBarang = stokBarang;
        this.satuanBarang = satuanBarang;
        this.hargaDasar = hargaDasar;
        this.hargaJual = hargaJual;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getStokBarang() {
        return stokBarang;
    }

    public void setStokBarang(String stokBarang) {
        this.stokBarang = stokBarang;
    }

    public String getSatuanBarang() {
        return satuanBarang;
    }

    public void setSatuanBarang(String satuanBarang) {
        this.satuanBarang = satuanBarang;
    }

    public String getHargaDasar() {
        return hargaDasar;
    }

    public void setHargaDasar(String hargaDasar) {
        this.hargaDasar = hargaDasar;
    }

    public String getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(String hargaJual) {
        this.hargaJual = hargaJual;
    }
}
