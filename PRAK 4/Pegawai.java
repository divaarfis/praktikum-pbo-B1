// File: Pegawai.java
// Nama Pembuat: Diva Arfis Permata
// NIM : 34060123130102
// tanggal: 10 Maret 2025

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Pegawai {
    protected String nomorInduk;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tanggalMulai;
    protected String jabatan;
    protected String fakultas;
    protected double gajiPokok;
    
    // Format tanggal untuk display
    protected static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("d MMMM yyyy");
    // Tanggal referensi untuk menghitung masa kerja
    protected static final LocalDate TANGGAL_REFERENSI_AWAL = LocalDate.of(2015, 1, 1);
    protected static final LocalDate TANGGAL_REFERENSI_AKHIR = LocalDate.of(2025, 3, 10);
    
    public Pegawai(String nomorInduk, String nama, LocalDate tanggalLahir, 
                  LocalDate tanggalMulai, String jabatan, String fakultas, double gajiPokok) {
        this.nomorInduk = nomorInduk;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tanggalMulai = tanggalMulai;
        this.jabatan = jabatan;
        this.fakultas = fakultas;
        this.gajiPokok = gajiPokok;
    }
    
    // Menghitung masa kerja dari tanggal mulai sampai tanggal referensi akhir
    public String hitungMasaKerja() {
        LocalDate tanggalHitung = (tanggalMulai.isBefore(TANGGAL_REFERENSI_AWAL)) 
                                ? TANGGAL_REFERENSI_AWAL : tanggalMulai;
        
        Period period = Period.between(tanggalHitung, TANGGAL_REFERENSI_AKHIR);
        return period.getYears() + " tahun " + period.getMonths() + " bulan";
    }
    
    // Format tanggal untuk display
    public String formatTanggal(LocalDate tanggal) {
        return tanggal.format(DATE_FORMATTER);
    }
    
    // Menghitung total gaji (implementasi berbeda di setiap subclass)
    public abstract double hitungTotalGaji();
    
    // Informasi BUP (implementasi berbeda di setiap subclass)
    public abstract String infoBUP();
    
    // Display informasi umum pegawai
    public String getInfoPegawai() {
        StringBuilder info = new StringBuilder();
        info.append("Nomor Induk: ").append(nomorInduk).append("\n");
        info.append("Nama: ").append(nama).append("\n");
        info.append("Tanggal Lahir: ").append(formatTanggal(tanggalLahir)).append("\n");
        info.append("TMT: ").append(formatTanggal(tanggalMulai)).append("\n");
        info.append("Jabatan: ").append(jabatan).append("\n");
        info.append("Fakultas: ").append(fakultas).append("\n");
        info.append("Gaji Pokok: Rp. ").append(String.format("%,.2f", gajiPokok)).append("\n");
        info.append("Total Gaji: Rp. ").append(String.format("%,.2f", hitungTotalGaji())).append("\n");
        info.append("Masa Kerja: ").append(hitungMasaKerja()).append("\n");
        info.append(infoBUP());
        
        return info.toString();
    }
}