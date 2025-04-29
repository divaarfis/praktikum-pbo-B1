// File: MainProgram.java
// Program utama untuk mensimulasikan perilaku Anabul
// Pembuat : Diva Arfis Permata - 24060123130102

public class MainProgram {
    public static void main(String[] args) {
        // Membuat objek dari masing-masing kelas anak
        Kucing kucing = new Kucing("Kitty");
        Anjing anjing = new Anjing("Buddy");
        Burung burung = new Burung("Tweety");
        
        // Membuat array dari tipe Anabul (polimorfisme)
        Anabul[] daftarAnabul = {kucing, anjing, burung};
        
        // Mensimulasikan suara dan gerakan setiap anabul
        System.out.println("Simulasi Perilaku Anabul:");
        System.out.println("========================");
        
        for (Anabul anabul : daftarAnabul) {
            System.out.println("\nPeliharaan: " + anabul.getNama());
            anabul.bersuara();
            anabul.bergerak();
        }
    }
}