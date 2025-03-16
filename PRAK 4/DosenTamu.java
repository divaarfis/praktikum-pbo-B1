// File: DosenTamu.java
// Nama Pembuat: Diva Arfis Permata
// NIM : 34060123130102
// tanggal: 10 Maret 2025

import java.time.LocalDate;

public class DosenTamu extends Dosen {
    private String nidk; // Nomor Induk Dosen Khusus
    private LocalDate tanggalAkhirKontrak;
    
    public DosenTamu(String nitp, String nidk, String nama, LocalDate tanggalLahir, 
                    LocalDate tanggalMulai, LocalDate tanggalAkhirKontrak, 
                    String jabatan, String fakultas, double gajiPokok) {
        super(nitp, nama, tanggalLahir, tanggalMulai, jabatan, fakultas, gajiPokok);
        this.nidk = nidk;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }
    
    public String getNidk() {
        return nidk;
    }
    
    public LocalDate getTanggalAkhirKontrak() {
        return tanggalAkhirKontrak;
    }
    
    @Override
    public double hitungTotalGaji() {
        // Dosen tamu mendapat tunjangan 2.5x gaji pokok
        return gajiPokok + (2.5 * gajiPokok);
    }
    
    @Override
    public String infoBUP() {
        // Pada Dosen Tamu, BUP digantikan dengan masa kontrak berakhir
        return "Masa Kontrak Berakhir: " + formatTanggal(tanggalAkhirKontrak);
    }
    
    @Override
    public String getJenisBeban() {
        return "Pengajaran dan Konsultasi";
    }
    
    @Override
    public String getInfoPegawai() {
        StringBuilder info = new StringBuilder(super.getInfoPegawai());
        info.insert(0, "NIDK: " + nidk + "\n");
        return info.toString();
    }
}