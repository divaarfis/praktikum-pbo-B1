// File: Anjing.java
// Nama: Diva Arfis Permata 
// NIM : 24060123130102 

public class Anjing extends Anabul {
    
    public Anjing(String nama) {
        super(nama);
    }
    
    @Override
    public String bergerak() {
        return "melata";
    }
    
    @Override
    public String bersuara() {
        return "guk-guk";
    }
}