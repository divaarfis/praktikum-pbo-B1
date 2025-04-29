// File: Anjing.java
// Kelas anak untuk Anjing
// Pembuat : Diva Arfis Permata - 24060123130102

public class Anjing extends Anabul {
    
    public Anjing(String nama) {
        super(nama);
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Guk-guk!");
    }
    
    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }
}