// File: DosenTetap.java
// Nama Pembuat: Diva Arfis Permata
// NIM : 34060123130102
// tanggal: 10 Maret 2025

import java.time.LocalDate;

public class DosenTetap extends Dosen {
    private String nidn; // Nomor Induk Dosen Nasional
    private static final int USIA_PENSIUN = 65;
    
    public DosenTetap(String nip, String nidn, String nama, LocalDate tanggalLahir, 
                     LocalDate tanggalMulai, String jabatan, String fakultas, double gajiPokok) {
        super(nip, nama, tanggalLahir, tanggalMulai, jabatan, fakultas, gajiPokok);
        this.nidn = nidn;
    }
    
    public String getNidn() {
        return nidn;
    }
    
    @Override
    public double hitungTotalGaji() {
        // Dosen tetap mendapat tunjangan 2x gaji pokok
        return gajiPokok + (2 * gajiPokok);
    }
    
    @Override
    public String infoBUP() {
        // BUP Dosen tetap adalah 65 tahun
        LocalDate tanggalPensiun = tanggalLahir.plusYears(USIA_PENSIUN);
        return "BUP: " + USIA_PENSIUN + " tahun, jatuh pada " + formatTanggal(tanggalPensiun);
    }
    
    @Override
    public String getJenisBeban() {
        return "Pengajaran, Penelitian, dan Pengabdian Masyarakat";
    }
    
    @Override
    public String getInfoPegawai() {
        StringBuilder info = new StringBuilder(super.getInfoPegawai());
        info.insert(0, "NIDN: " + nidn + "\n");
        return info.toString();
    }
}