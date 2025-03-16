// File: Tendik.java
// Nama Pembuat: Diva Arfis Permata
// NIM : 34060123130102
// tanggal: 10 Maret 2025

import java.time.LocalDate;

public class Tendik extends Pegawai {
    private String nitp; // Nomor Induk Tenaga Pendidik
    
    public Tendik(String nitp, String nama, LocalDate tanggalLahir, 
                 LocalDate tanggalMulai, String jabatan, String fakultas, double gajiPokok) {
        super(nitp, nama, tanggalLahir, tanggalMulai, jabatan, fakultas, gajiPokok);
        this.nitp = nitp;
    }
    
    public String getNitp() {
        return nitp;
    }
    
    @Override
    public double hitungTotalGaji() {
        // Formula perhitungan gaji untuk Tendik: 14 x 10 x gaji pokok
        return 14 * 10 * gajiPokok;
    }
    
    @Override
    public String infoBUP() {
        // Untuk tendik, informasi fakultas dijadikan bidang tempat bekerja
        return "Bidang Tempat Bekerja: " + fakultas;
    }
    
    @Override
    public String getInfoPegawai() {
        StringBuilder info = new StringBuilder(super.getInfoPegawai());
        info.insert(0, "NITP: " + nitp + "\n");
        return info.toString();
    }
}