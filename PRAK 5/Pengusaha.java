/**
 * File: Pengusaha.java
 * Pembuat : Diva Arfis Permata - 24060123130102
 * Tanggal: 24 Maret 2025
 */

 import java.time.LocalDate;
 import java.time.Period;
 
 public class Pengusaha extends Manusia implements Pekerja {
     private String npwp;
     private LocalDate tglMulaiKerja;
     private static int counterPengusaha = 0;
     
     public Pengusaha(String nama, LocalDate tglLahir, String alamat, double pendapatan, String npwp) {
         super(nama, tglLahir, alamat, pendapatan);
         this.npwp = npwp;
         this.tglMulaiKerja = tglLahir.plusYears(20);
         counterPengusaha++;
     }
     
     public String getNpwp() {
         return npwp;
     }
     
     public void setNpwp(String npwp) {
         this.npwp = npwp;
     }
     
     public LocalDate getTglMulaiKerja() {
         return tglMulaiKerja;
     }
     
     public void setTglMulaiKerja(LocalDate tglMulaiKerja) {
         this.tglMulaiKerja = tglMulaiKerja;
     }
     
     public static int getCounterPengusaha() {
         return counterPengusaha;
     }
     
     @Override
     public int hitungMasaKerja() {
         // B = 0 
         int additionalYears = 0; 
         Period period = Period.between(tglMulaiKerja, LocalDate.now());
         return period.getYears() + additionalYears;
     }
     
     @Override
     public double hitungPajak() {
         return 0.15 * pendapatan;
     }
     
     @Override
     public void cetakInfo() {
         System.out.println();
         System.out.println("=== Informasi Pengusaha ===");
         System.out.println("Nama: " + nama);
         System.out.println("Tanggal Lahir: " + tglLahir);
         System.out.println("Alamat: " + alamat);
         System.out.println("Pendapatan: " + pendapatan);
         System.out.println("NPWP: " + npwp);
         System.out.println("Tanggal Mulai Kerja: " + tglMulaiKerja);
         System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
         System.out.println("Pajak: " + hitungPajak());
     }
 }