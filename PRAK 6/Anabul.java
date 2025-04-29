// File: Anabul.java
// Kelas induk untuk hewan peliharaan
// Pembuat : Diva Arfis Permata - 24060123130102

public abstract class Anabul {
    protected String nama;
    
    // Constructor
    public Anabul(String nama) {
        this.nama = nama;
    }
    
    // Method abstract yang harus diimplementasikan oleh kelas anak
    public abstract void bersuara();
    public abstract void bergerak();
    
    // Getter untuk nama
    public String getNama() {
        return nama;
    }
}