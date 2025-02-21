/* Nama File : Garis.java
 * Deskripsi : Berisi atribut dan method dalam class garis
 * Pembuat : Diva Arfis Permata/24060123130102
 * Tanggal : Selasa, 18 Februari 2025
 */

public class Garis {
    /*ATRIBUT */
    Titik T1;
    Titik T2;
    static int CounterGaris = 0;

    /*METHOD */
    //mengembalikan nilai counterTitik
    static int getCounterGaris(){
        return CounterGaris;
    }

    //konstruktor untuk membuat garis ((x1,y1),(x2,y2))
    Garis(Titik T1, Titik T2) {
        this.T1 = T1;
        this.T2 = T2;
        CounterGaris++;
    }

    //konstruktor untuk membuat garis ((0,0),(1,1))
    Garis() {
        this(new Titik(0, 0), new Titik(1, 1));
    }

    //mengembalikan nilai T1
    Titik getT1Garis() {
        return this.T1;
    }

    //mengembalikan nilai T2
    Titik getT2Garis() {
        return this.T2;
    }

    //mengubah/set titik T1
    void setT1Garis(Titik T1) {
        this.T1 = T1;
    }

    //mengubah/set titik T2
    void setT2Garis(Titik T2) {
        this.T2 = T2;
    }

    //mengembalikan nilai panjang garis
    double getPanjangGaris() {
        return Math.sqrt(Math.pow(T1.absis - T2.absis, 2) + Math.pow(T1.ordinat - T2.ordinat, 2));
    }

    //mengembalikan nilai gradien garis
    double getGradien() {
        double X = T1.getAbsis() - T2.getAbsis();
        if (X == 0) {
            System.out.println("Nilai x1 dan x2 sama, pembagian nol");
        }
        return (T1.getOrdinat() - T2.getOrdinat()) / X;
    }

    //mengembalikan titik tengah garis
    Titik gettitiktengah(){
        double x = ((this.T1.getAbsis() + this.T2.getOrdinat()) / 2)  ;
        double y = ((this.T1.getAbsis() + this.T2.getOrdinat()) / 2)  ;
        return new Titik(x, y) ;
    }

    //mengecek apakah garis sejajar dengan garis X, true/false
    boolean isSejajar(Garis X) {
        return this.getGradien() == X.getGradien();
    }

    //mengecek apakah garis G tegak lurus dengan garis X
    boolean isTegakLurus(Garis X) {
        return (this.getGradien() * X.getGradien()) == -1;
    }

    //menampilkan ke layar titik awal dan titik akhir garis
    void printT1T2() {
        System.out.println("Titik awal (" + T1.absis + "," + T1.ordinat + "), Titik akhir (" + T2.absis + ", " + T2.ordinat + ")");
    }

    //menampilkan persamaan garis dalam bentuk string y = mx + c.
    void printRumus() {
        double m = (T2.getOrdinat() - T1.getOrdinat()) / (T2.getAbsis() - T1.getAbsis());
        double c = T1.getOrdinat() - (m * T1.getAbsis());
        System.out.println("Persamaan garis: y = " + m + "x + " + c);
    }

} 


