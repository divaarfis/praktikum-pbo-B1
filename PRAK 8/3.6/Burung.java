// File: Burung.java
// Nama: Diva Arfis Permata 
// NIM : 24060123130102 

public class Burung extends Anabul {
    
    public Burung(String nama) {
        super(nama);
    }
    
    @Override
    public String bergerak() {
        return "terbang";
    }
    
    @Override
    public String bersuara() {
        return "cuit-cuit";
    }
}