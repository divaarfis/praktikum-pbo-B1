/**
 * File : Persegi.java
 * Deskripsi : implementasi Persegi sebagai BangunDatar
 * Nama: Diva Arfis Permata 
 * NIM : 24060123130102 
 */
public class Persegi extends BangunDatar {
    private double sisi;
    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    
    public double hitungKeliling() {
        return 4 * sisi;
    }
}