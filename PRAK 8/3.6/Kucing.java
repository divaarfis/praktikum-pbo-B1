// File: Kucing.java
// Nama: Diva Arfis Permata 
// NIM : 24060123130102 

public class Kucing extends Anabul {
    
    public Kucing(String nama) {
        super(nama);
    }
    
    @Override
    public String bergerak() {
        return "melata";
    }
    
    @Override
    public String bersuara() {
        return "meong";
    }
}