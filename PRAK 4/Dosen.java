// File: Dosen.java
// Nama Pembuat: Diva Arfis Permata
// NIM : 34060123130102
// tanggal: 10 Maret 2025

import java.time.LocalDate;

// Kelas abstrak Dosen yang mewarisi dari Pegawai
public abstract class Dosen extends Pegawai {
    
    public Dosen(String nomorInduk, String nama, LocalDate tanggalLahir, 
                LocalDate tanggalMulai, String jabatan, String fakultas, double gajiPokok) {
        super(nomorInduk, nama, tanggalLahir, tanggalMulai, jabatan, fakultas, gajiPokok);
    }
    
    // Method khusus untuk dosen
    public abstract String getJenisBeban();
    
    @Override
    public String getInfoPegawai() {
        StringBuilder info = new StringBuilder(super.getInfoPegawai());
        info.append("\nJenis Beban: ").append(getJenisBeban());
        return info.toString();
    }
}