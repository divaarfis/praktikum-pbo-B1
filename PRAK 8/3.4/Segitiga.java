/**
 * File : Segitiga.java
 * Deskripsi : implementasi Segitiga sebagai BangunDatar
 * Nama: Diva Arfis Permata 
 * NIM : 24060123130102 
 */
public class Segitiga extends BangunDatar {
    private double sisiA;
    private double sisiB;
    private double sisiC;
    
    public Segitiga(double sisiA, double sisiB, double sisiC) {
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }
    
    public double hitungKeliling() {
        return sisiA + sisiB + sisiC;
    }
}