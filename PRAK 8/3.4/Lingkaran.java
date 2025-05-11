/**
 * File : Lingkaran.java
 * Deskripsi : implementasi Lingkaran sebagai BangunDatar
 * Nama: Diva Arfis Permata 
 * NIM : 24060123130102 
 */

 public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2 * jejari * 3.14;
    }
}