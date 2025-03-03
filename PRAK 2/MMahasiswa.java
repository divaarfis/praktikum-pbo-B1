public class MMahasiswa {
    public static void main(String[] args) {
        // Membuat objek mata kuliah
        MataKuliah mk1 = new MataKuliah("INF1001", "Pemrograman Dasar", 3);
        MataKuliah mk2 = new MataKuliah("INF1002", "Algoritma dan Struktur Data", 4);
        MataKuliah mk3 = new MataKuliah("INF1003", "Basis Data", 3);
        
        // Membuat objek dosen
        Dosen dosen = new Dosen("198501152010121002", "Helmie S.si, M.si", "Informatika");
        
        // Membuat objek kendaraan
        Kendaraan kendaraan = new Kendaraan("D 1 va", "BMW 330i");
        
        // Membuat objek mahasiswa
        Mahasiswa mhs = new Mahasiswa("24060123130102", "Diva Arfis Permata", "Informatika");
        
        // Menambahkan mata kuliah
        mhs.addMatKul(mk1);
        mhs.addMatKul(mk2);
        mhs.addMatKul(mk3);
        
        // Menetapkan dosen wali dan kendaraan
        mhs.setDoswal(dosen);
        mhs.setKendaraan(kendaraan);
        
        // Menampilkan data mahasiswa sederhana
        System.out.println("===== DATA MAHASISWA SEDERHANA =====");
        mhs.printMhs();
        System.out.println();
        
        // Menampilkan data mahasiswa lengkap
        System.out.println("===== DATA MAHASISWA LENGKAP =====");
        mhs.printDetailMhs();
        
        // Menampilkan jumlah SKS dan mata kuliah
        System.out.println("\n===== MATA KULIAH=====");
        System.out.println("Jumlah Mata Kuliah: " + mhs.getJumlahMatkul());
        System.out.println("Total SKS: " + mhs.getJumlahsks());
    }
}