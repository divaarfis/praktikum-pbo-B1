// File: KoleksiAnabul.java
// Nama: Diva Arfis Permata 
// NIM : 24060123130102 

import java.util.ArrayList;
import java.util.Random;

public class KoleksiAnabul {
    private ArrayList<Anabul> koleksi;
    private final int JUMLAH_ELEMEN = 10;
    private Random random = new Random();
    
    public KoleksiAnabul() {
        koleksi = new ArrayList<>();
        isiKoleksiAcak();
    }
    
    private void isiKoleksiAcak() {
        String[] namaKucing = {"Meong", "Kitty", "Si Belang", "Fluffy"};
        String[] namaAnjing = {"Doggy", "Rex", "Buddy", "Max"};
        String[] namaBurung = {"Tweety", "Birdy", "Si Kuning", "Cici"};
        
        for (int i = 0; i < JUMLAH_ELEMEN; i++) {
            int jenis = random.nextInt(3); // 0: Kucing, 1: Anjing, 2: Burung
            
            switch (jenis) {
                case 0:
                    koleksi.add(new Kucing(namaKucing[random.nextInt(namaKucing.length)]));
                    break;
                case 1:
                    koleksi.add(new Anjing(namaAnjing[random.nextInt(namaAnjing.length)]));
                    break;
                case 2:
                    koleksi.add(new Burung(namaBurung[random.nextInt(namaBurung.length)]));
                    break;
            }
        }
    }
    
    public void showAll() {
        System.out.println("===== KOLEKSI ANABUL =====");
        for (int i = 0; i < koleksi.size(); i++) {
            Anabul anabul = koleksi.get(i);
            System.out.println("[" + (i+1) + "] " + anabul.getClass().getSimpleName());
            System.out.println(anabul);
            System.out.println();
        }
        System.out.println("=========================");
    }
}