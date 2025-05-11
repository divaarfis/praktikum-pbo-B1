/**
 * File : BangunDatarGenericMain.java
 * Deskripsi : main class untuk menguji keempat buah kelas bangun datar
 * Nama: Diva Arfis Permata 
 * NIM : 24060123130102 
 */

public class BangunDatarGenericMain {
    public static void main(String[] args) {
        // Membuat objek lingkaran dan mengujinya
        Lingkaran lingkaran = new Lingkaran(7.0);
        BangunDatarGeneric<Lingkaran> bdgLingkaran = new BangunDatarGeneric<Lingkaran>();
        bdgLingkaran.set(lingkaran);
        System.out.println("Keliling lingkaran : " + bdgLingkaran.hitungKeliling());
        System.out.println("Tipe : " + bdgLingkaran.get().getClass().getName());
        System.out.println();
        
        // Membuat objek persegi dan mengujinya
        Persegi persegi = new Persegi(5.0);
        BangunDatarGeneric<Persegi> bdgPersegi = new BangunDatarGeneric<Persegi>();
        bdgPersegi.set(persegi);
        System.out.println("Keliling persegi : " + bdgPersegi.hitungKeliling());
        System.out.println("Tipe : " + bdgPersegi.get().getClass().getName());
        System.out.println();
        
        // Membuat objek persegi panjang dan mengujinya
        PersegiPanjang persegiPanjang = new PersegiPanjang(8.0, 4.0);
        BangunDatarGeneric<PersegiPanjang> bdgPersegiPanjang = new BangunDatarGeneric<PersegiPanjang>();
        bdgPersegiPanjang.set(persegiPanjang);
        System.out.println("Keliling persegi panjang : " + bdgPersegiPanjang.hitungKeliling());
        System.out.println("Tipe : " + bdgPersegiPanjang.get().getClass().getName());
        System.out.println();
        
        // Membuat objek segitiga dan mengujinya
        Segitiga segitiga = new Segitiga(3.0, 4.0, 5.0);
        BangunDatarGeneric<Segitiga> bdgSegitiga = new BangunDatarGeneric<Segitiga>();
        bdgSegitiga.set(segitiga);
        System.out.println("Keliling segitiga : " + bdgSegitiga.hitungKeliling());
        System.out.println("Tipe : " + bdgSegitiga.get().getClass().getName());
    }
}