/* Nama File : MGaris.java
 * Deskripsi : Berisi aplikasi file Garis.java
 * Pembuat : Diva Arfis Permata/ 24060123130102
 * Tanggal : Selasa, 18 Februari 2025
 */

public class MGaris {
    public static void main(String[] args) {
        System.out.println("==========Membuat Objek Garis==========");

        Garis G1 = new Garis(); // membuat garis G1 ((0,0),(1,1))
        Garis G2 = G1; // membuat garis G2 mereferensi G1
        Titik T2 = new Titik(6,6); 

        System.out.println("Garis G1: ");
        G1.printT1T2(); 
        System.out.println();

        System.out.println("==========Mengeset titik awal menjadi (1,3)==========");
        G1.setT1Garis(new Titik(1, 3)); 
        G1.printT1T2(); 
        System.out.println();

        System.out.println("==========Mengeset titik awal menjadi (6,6)==========");
        G1.setT2Garis(T2); 
        G1.printT1T2();
        System.out.println();

        System.out.println("==========Mencari panjang garis ==========");
        System.out.println("Panjang garis :" + G1.getPanjangGaris()); // menampilkan panjang garis G1
        System.out.println();

        System.out.println("==========Mencari gradien garis==========");
        System.out.println("Gradien garis :" + G1.getGradien()); // menampilkan gradien garis G1
        System.out.println();


        System.out.println("==========Mencari titik tengah garis===========");

        Garis G3 = new Garis();
        G3.setT1Garis(new Titik(4, 4)); 
        G3.setT2Garis(new Titik(6, 6));
        G3.printT1T2();
        System.out.println();
        
        Titik tengah = G3.gettitiktengah() ;
        System.out.println("Titik Tengah Garis 2: (" + tengah.getAbsis() + 
                          "," + tengah.getOrdinat() + ")");
        System.out.println();

        System.out.println("==========Menentukan kesejajaran garis ==========");
        System.out.println("Apakah garis G1 dan G2 sejajar? : " + G1.isSejajar(G2)); // menampilkan true/false apakah garis G1 & G2 sejajar
        System.out.println();

        System.out.println("==========Menentukan ketegaklurusan garis==========");
        System.out.println("Apakah garis G1 dan G2 saling Tegak Lurus? : " + G1.isTegakLurus(G2)); // menampilkan true/false apakah garis G1 & G2 saling tegak lurus
        System.out.println();

        System.out.println("==========Menampilkan persamaan garis==========");
        G1.printRumus(); // menampilkan rumus persamaan y = mx + c
    }
}
