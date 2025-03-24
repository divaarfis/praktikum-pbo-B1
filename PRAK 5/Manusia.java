/**
 * File: Manusia.java
 * Pembuat : Diva Arfis Permata - 24060123130102
 * Tanggal: 24 Maret 2025
 */

 import java.time.LocalDate;
 
 public abstract class Manusia {
     protected String nama;
     protected LocalDate tglLahir;
     protected String alamat;
     protected double pendapatan;
     
     private static int counterMns = 0;
     
     public Manusia(String nama, LocalDate tglLahir, String alamat, double pendapatan) {
         this.nama = nama;
         this.tglLahir = tglLahir;
         this.alamat = alamat;
         this.pendapatan = pendapatan;
         counterMns++;
     }
     
     public Manusia(String nama, LocalDate tglLahir, double pendapatan) {
         this.nama = nama;
         this.tglLahir = tglLahir;
         this.alamat = ""; //kosong
         this.pendapatan = pendapatan;
         counterMns++;
     }
     
     public String getNama() {
         return nama;
     }
     
     public void setNama(String nama) {
         this.nama = nama;
     }
     
     public LocalDate getTglLahir() {
         return tglLahir;
     }
     
     public void setTglLahir(LocalDate tglLahir) {
         this.tglLahir = tglLahir;
     }
     
     public String getAlamat() {
         return alamat;
     }
     
     public void setAlamat(String alamat) {
         this.alamat = alamat;
     }
     
     public double getPendapatan() {
         return pendapatan;
     }
     
     public void setPendapatan(double pendapatan) {
         this.pendapatan = pendapatan;
     }
     
     public static int getCounterMns() {
         return counterMns;
     }
     
     public abstract void cetakInfo();
 }