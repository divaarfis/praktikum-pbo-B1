/**
 * File : Koleksi.java
 * Deskripsi : implementasi kelas generik Koleksi
 * Nama: Diva Arfis Permata 
 * NIM : 24060123130102 
 */
public class Koleksi<T> {
    private T[] wadah;
    private int nbelm;
    private final static int UKURAN_DEFAULT = 10;
    
    // Konstruktor dengan ukuran default
    @SuppressWarnings("unchecked")
    public Koleksi() {
        wadah = (T[]) new Object[UKURAN_DEFAULT];
        nbelm = 0;
    }
    
    // Konstruktor dengan ukuran kustom
    @SuppressWarnings("unchecked")
    public Koleksi(int ukuran) {
        wadah = (T[]) new Object[ukuran];
        nbelm = 0;
    }
    
    // Mendapatkan elemen pada indeks i
    public T getIsi(int i) {
        if (i >= 0 && i < nbelm) {
            return wadah[i];
        } else {
            return null;
        }
    }
    
    // Mengatur/mengubah elemen pada indeks i
    public void setIsi(int i, T data) {
        if (i >= 0 && i < nbelm) {
            wadah[i] = data;
        }
    }
    
    // Mendapatkan jumlah elemen
    public int getUkuran() {
        return nbelm;
    }
    
    // Mengatur ukuran koleksi
    @SuppressWarnings("unchecked")
    public void setUkuran(int ukuran) {
        if (ukuran > 0) {
            T[] wadahBaru = (T[]) new Object[ukuran];
            int panjangSalin = Math.min(ukuran, nbelm);
            
            // Salin elemen ke array baru
            for (int i = 0; i < panjangSalin; i++) {
                wadahBaru[i] = wadah[i];
            }
            
            wadah = wadahBaru;
            // Sesuaikan nbelm jika diperlukan
            if (nbelm > ukuran) {
                nbelm = ukuran;
            }
        }
    }
    
    // Menambahkan elemen baru
    public void tambah(T data) {
        if (nbelm < wadah.length) {
            wadah[nbelm] = data;
            nbelm++;
        } else {
            // Ubah ukuran jika penuh
            setUkuran(wadah.length * 2);
            wadah[nbelm] = data;
            nbelm++;
        }
    }
    
    // Menghapus elemen pada indeks i
    public void hapus(int i) {
        if (i >= 0 && i < nbelm) {
            // Geser elemen
            for (int j = i; j < nbelm - 1; j++) {
                wadah[j] = wadah[j + 1];
            }
            wadah[nbelm - 1] = null;
            nbelm--;
        }
    }
    
    // Menampilkan semua elemen
    public void tampilSemua() {
        System.out.println("Jumlah elemen: " + nbelm);
        for (int i = 0; i < nbelm; i++) {
            System.out.println("Elemen " + i + ": " + wadah[i]);
        }
    }
}