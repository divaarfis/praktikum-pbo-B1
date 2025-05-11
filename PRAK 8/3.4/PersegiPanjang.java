/**
 * File : PersegiPanjang.java
 * Deskripsi : implementasi PersegiPanjang sebagai BangunDatar
 * Nama: Diva Arfis Permata 
 * NIM : 24060123130102 
 */
public class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;
    
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}