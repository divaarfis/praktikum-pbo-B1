/**
 * File: PNS.java
 * Pembuat : Diva Arfis Permata - 24060123130102
 * Tanggal: 24 Maret 2025
 */

 import java.time.LocalDate;
 import java.time.Period;
 
 public class PNS extends Manusia implements Pekerja {
     private String nip;
     private LocalDate tglMulaiKerja;
     private static int counterPNS = 0;
     
     public PNS(String nama, LocalDate tglLahir, String alamat, double pendapatan, String nip) {
         super(nama, tglLahir, alamat, pendapatan);
         this.nip = nip;
         String startDateStr = nip.substring(8, 16);
         int year = Integer.parseInt(startDateStr.substring(0, 4));
         int month = Integer.parseInt(startDateStr.substring(4, 6));
         int day = Integer.parseInt(startDateStr.substring(6, 8));
         this.tglMulaiKerja = LocalDate.of(year, month, day);
         counterPNS++;
     }
     
     // Constructor without alamat
     public PNS(String nama, LocalDate tglLahir, double pendapatan, String nip) {
         super(nama, tglLahir, pendapatan);
         this.nip = nip;
         String startDateStr = nip.substring(8, 16);
         int year = Integer.parseInt(startDateStr.substring(0, 4));
         int month = Integer.parseInt(startDateStr.substring(4, 6));
         int day = Integer.parseInt(startDateStr.substring(6, 8));
         this.tglMulaiKerja = LocalDate.of(year, month, day);
         counterPNS++;
     }
     
     public String getNip() {
         return nip;
     }
     
     public void setNip(String nip) {
         this.nip = nip;
     }
     
     public LocalDate getTglMulaiKerja() {
         return tglMulaiKerja;
     }
     
     public void setTglMulaiKerja(LocalDate tglMulaiKerja) {
         this.tglMulaiKerja = tglMulaiKerja;
     }
     
     public static int getCounterPNS() {
         return counterPNS;
     }
     
     @Override
     public int hitungMasaKerja() {
         // A = 2 
         int additionalYears = 2; 
         Period period = Period.between(tglMulaiKerja, LocalDate.now());
         return period.getYears() + additionalYears;
     }
     
     @Override
     public double hitungPajak() {
         return 0.1 * pendapatan;
     }
     
     @Override
     public void cetakInfo() {
         System.out.println();
         System.out.println("=== Informasi PNS ===");
         System.out.println("Nama: " + nama);
         System.out.println("Tanggal Lahir: " + tglLahir);
         System.out.println("Alamat: " + alamat);
         System.out.println("Pendapatan: " + pendapatan);
         System.out.println("NIP: " + nip);
         System.out.println("Tanggal Mulai Kerja: " + tglMulaiKerja);
         System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
         System.out.println("Pajak: " + hitungPajak());
     }
 }