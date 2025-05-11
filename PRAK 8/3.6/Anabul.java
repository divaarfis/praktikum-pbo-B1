// File: Anabul.java
// Nama: Diva Arfis Permata 
// NIM : 24060123130102 

public abstract class Anabul {
    protected String nama;
    
    public Anabul(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public abstract String bergerak();
    public abstract String bersuara();
    
    @Override
    public String toString() {
        return "Nama: " + nama + 
               "\nGerakan: " + bergerak() + 
               "\nSuara: " + bersuara();
    }
}