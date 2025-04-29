// File: Kucing.java
// Kelas anak untuk Kucing
// Pembuat : Diva Arfis Permata - 24060123130102

public class Kucing extends Anabul {
    
    public Kucing(String nama) {
        super(nama);
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: Meong!");
    }
    
    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }
}