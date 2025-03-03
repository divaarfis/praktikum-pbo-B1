/* Nama File : MTitik.java
 * Deskripsi : Berisi aplikasi file Titik.java
 * Pembuat : Diva Arfis Permata/ 24060123130102
 * Tanggal : Selasa, 18 Februari 2025
 */

public class MTitik {
    public static void main(String[] args) {
        System.out.println("==========Membuat Objek Titik==========");
        // Membuat titik T1
        System.out.println("Titik T1:");
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        System.out.println();
        
        System.out.println("==========Menggeser Objek Titik==========");
        System.out.println("Titik T1 digeser sejauh (3,4), maka koordinat T1 sekarang: ");
        T1.geser(3, 4);
        T1.printTitik();
        System.out.println();

        System.out.println("==========Mengcopy titik==========");
        Titik T2 = T1;
        T2.setAbsis(10);
        T2.setOrdinat(6);
        System.out.println("Titik T2 di set (10,6): ");
        T2.printTitik();
        System.out.println();

        //Titik T3 = new Titik(); 
        
        System.out.println("==========Menghitung objek titik==========");
        System.out.println("jumlah objek titik: " + T1.getCouterTitik());
        System.out.println("**objek titik dihitung 1 karena T2 merupakan copy dari T1");
        System.out.println();

        System.out.println("==========Mencari kuadran titik==========");
        T2.printTitik();
        System.out.println("Titik 2 berada di kuadran: " + T1.getkuadran());
       System.out.println();

        System.out.println("==========Mencari jarak titik dengan titik pusat (0.0)==========");
        T1.printTitik() ;
        System.out.println("jarak titik dengan titik pusat adalah  " + T2.getjarakpusat() );
        System.out.println();

        Titik T3 = new Titik();
        T3.setAbsis(5);
        T3.setOrdinat(12);
        T3.printTitik();

        Titik T4 = new Titik();
        T4.setAbsis(3);
        T4.setOrdinat(4);

        System.out.println("jarak: "+ T3.getjarakpusat());

        System.out.println();
        System.out.println("==========Mencari jarak titik satu dengan titik yang lain)==========");
        T3.printTitik() ;
        T4.printTitik() ;
        double jarak = T1.getjarak(T3);
        System.out.println("jarak antara T3 dan T4 adalah " + jarak ) ;
        
        System.out.println("==========Merefleksikan titik dengan sumbu X==========");
        
        System.out.println("sebelum di refleksi: ");
        T3.printTitik();
        
        System.out.println();

        T3.refleksiX();
        System.out.println("setelah di refleksi oleh sumbu X: ");
        T3.printTitik();
        System.out.println();

        System.out.println("==========Merefleksikan titik dengan sumbu Y==========");
        
        System.out.println("sebelum di refleksi: ");
        T3.printTitik();
        
        System.out.println();

        T3.refleksiY();
        System.out.println("setelah di refleksi oleh sumbu Y: ");
        T3.printTitik();




    }
}