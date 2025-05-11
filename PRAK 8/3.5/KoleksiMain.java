/**
 * File : KoleksiMain.java
 * Deskripsi : aplikasi untuk menguji kelas Koleksi
 * Nama: Diva Arfis Permata 
 * NIM : 24060123130102 
 */
public class KoleksiMain {
    public static void main(String[] args) {
        // Membuat koleksi String
        System.out.println("=== Koleksi String ===");
        Koleksi<String> kolString = new Koleksi<>();
        
        // Menambahkan elemen
        kolString.tambah("Java");
        kolString.tambah("Python");
        kolString.tambah("C++");
        kolString.tambah("JavaScript");
      
        // Menampilkan semua elemen
        System.out.println("Isi koleksi string:");
        kolString.tampilSemua();
        
        // Mengubah elemen
        System.out.println("\nMengubah elemen indeks 2:");
        kolString.setIsi(2, "Diva");
        kolString.tampilSemua();
        
        // Menghapus elemen
        System.out.println("\nMenghapus elemen indeks 1:");
        kolString.hapus(1);
        kolString.tampilSemua();
        
        // Mendapatkan elemen
        System.out.println("\nMendapatkan elemen indeks 0: " + kolString.getIsi(0));
        
        // Membuat koleksi Integer
        System.out.println("\n\n=== Koleksi Integer ===");
        Koleksi<Integer> kolInteger = new Koleksi<>(5);
        
        // Menambahkan elemen
        for (int i = 0; i < 10; i++) {
            kolInteger.tambah(i * 10);
        }
        
        // Menampilkan semua elemen
        System.out.println("Isi koleksi integer setelah penambahan 10 elemen:");
        kolInteger.tampilSemua();
        
        // Mengubah ukuran koleksi
        System.out.println("\nMengubah ukuran koleksi menjadi 7:");
        kolInteger.setUkuran(7);
        kolInteger.tampilSemua();
        
        // Membuat koleksi objek Character
        System.out.println("\n\n=== Koleksi Character ===");
        Koleksi<Character> kolChar = new Koleksi<>();
        
        // Menambahkan elemen
        kolChar.tambah('D');
        kolChar.tambah('I');
        kolChar.tambah('V');
        kolChar.tambah('A');
        kolChar.tambah('A');
        kolChar.tambah('R');
        kolChar.tambah('F');
        kolChar.tambah('I');
        kolChar.tambah('S');
        kolChar.tambah('P');
        
        // Menampilkan semua elemen
        System.out.println("Isi koleksi character:");
        kolChar.tampilSemua();
        
        // Menghapus beberapa elemen
        System.out.println("\nMenghapus elemen indeks 0, 2, dan 4:");
        kolChar.hapus(0);
        kolChar.hapus(2);
        kolChar.hapus(4);
        kolChar.tampilSemua();
    }
}