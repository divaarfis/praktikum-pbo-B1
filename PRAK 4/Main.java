// File: Main.java
// Nama Pembuat: Diva Arfis Permata
// NIM : 34060123130102
// tanggal: 10 Maret 2025

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Membuat contoh setiap jenis pegawai
        
        // Contoh Dosen Tetap
        DosenTetap dosenTetap = new DosenTetap(
            "54154374818", // NIP
            "1234567890",  // NIDN
            "Dr. Ahmad",   // Nama
            LocalDate.of(1990, 5, 5), // Tanggal Lahir
            LocalDate.of(2010, 6, 1), // Tanggal Mulai
            "Dosen Tetap", // Jabatan
            "Fakultas Sains dan Matematika", // Fakultas
            5000000.0      // Gaji Pokok
        );
        
        // Contoh Dosen Tamu
        DosenTamu dosenTamu = new DosenTamu(
            "62178394011", // NITP
            "0987654321",  // NIDK
            "Prof. Budi",  // Nama
            LocalDate.of(1985, 3, 15), // Tanggal Lahir
            LocalDate.of(2018, 9, 1),  // Tanggal Mulai
            LocalDate.of(2026, 8, 31), // Tanggal Akhir Kontrak
            "Dosen Tamu",  // Jabatan
            "Fakultas Teknik", // Fakultas
            5500000.0      // Gaji Pokok
        );
        
        // Contoh Tendik
        Tendik tendik = new Tendik(
            "71934682510", // NITP
            "Citra",       // Nama
            LocalDate.of(1992, 11, 20), // Tanggal Lahir
            LocalDate.of(2015, 7, 1),   // Tanggal Mulai
            "Tenaga Pendidik", // Jabatan
            "Laboratorium Komputer", // Fakultas/Bidang
            3000000.0      // Gaji Pokok
        );
        
        // Menampilkan informasi pegawai
        System.out.println("===== INFORMASI DOSEN TETAP =====");
        System.out.println(dosenTetap.getInfoPegawai());
        System.out.println();
        
        System.out.println("===== INFORMASI DOSEN TAMU =====");
        System.out.println(dosenTamu.getInfoPegawai());
        System.out.println();
        
        System.out.println("===== INFORMASI TENDIK =====");
        System.out.println(tendik.getInfoPegawai());
    }
}