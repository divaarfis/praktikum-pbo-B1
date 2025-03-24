/**
 * File: Petani.java
 * Pembuat : Diva Arfis Permata - 24060123130102
 * Tanggal: 24 Maret 2025
 */

 import java.time.LocalDate;
 import java.time.Period;
 
 public class Petani extends Manusia implements Pekerja {
     private String daerahAsal;
     private LocalDate tglMulaiKerja;
     private static int counterPetani = 0;
     
     public Petani(String nama, LocalDate tglLahir, String alamat, double pendapatan, String daerahAsal) {
         super(nama, tglLahir, alamat, pendapatan);
         this.daerahAsal = daerahAsal;
         this.tglMulaiKerja = tglLahir.plusYears(15);
         counterPetani++;
     }
     
     public String getDaerahAsal() {
         return daerahAsal;
     }
     
     public void setDaerahAsal(String daerahAsal) {
         this.daerahAsal = daerahAsal;
     }
     
     public LocalDate getTglMulaiKerja() {
         return tglMulaiKerja;
     }
     
     public void setTglMulaiKerja(LocalDate tglMulaiKerja) {
         this.tglMulaiKerja = tglMulaiKerja;
     }
     
     public static int getCounterPetani() {
         return counterPetani;
     }
     
     @Override
     public int hitungMasaKerja() {
         // C = 1 
         int additionalYears = 1; 
         Period period = Period.between(tglMulaiKerja, LocalDate.now());
         return period.getYears() + additionalYears;
     }
     
     @Override
     public double hitungPajak() {
         return 0;
     }
     
     @Override
     public void cetakInfo() {
         System.out.println();
         System.out.println("=== Informasi Petani ===");
         System.out.println("Nama: " + nama);
         System.out.println("Tanggal Lahir: " + tglLahir);
         System.out.println("Alamat: " + alamat);
         System.out.println("Pendapatan: " + pendapatan);
         System.out.println("Daerah Asal: " + daerahAsal);
         System.out.println("Tanggal Mulai Kerja: " + tglMulaiKerja);
         System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
         System.out.println("Pajak: " + hitungPajak());
     }
 }