/* Nama File : Titik.java
 * Deskripsi : Berisi atribut dan method dalam class titik
 * Pembuat : Diva Arfis Permata/ 24060123130102
 * Tanggal : Selasa, 18 Februari 2025
 */

public class Titik {
    /* States/Atribut */
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /* Behavior/Method */  

    // Konstruktor
    /*Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik ++;
    } */

    //konstruktor untuk membuat dengan nilai absis dan ordinat tertentu 
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //konstruktor untuk membuat titik (0,0)
    public Titik () {
        this (0,0);
    }

    //mengembalikan nilai counterTitik
    public static int getCouterTitik(){
        return counterTitik;
    }
    
    // Mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // Mengubah nilai absis
    public void setAbsis(double x) {
        this.absis = x;
    }

    // Mengubah nilai ordinat
    public void setOrdinat(double y) {
        this.ordinat = y;
    }

    // Menggeser nilai absis dan ordinat masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    // Mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    public void printCounterTitik(){
        System.out.println(this.counterTitik);
    }

    //getkuadran 
    public int getkuadran(){
        if (getAbsis() > 0 && getOrdinat() > 0) {
            return 1 ;
        } else if (getAbsis() < 0 && getOrdinat() > 0){
            return 2;
        }else if (getAbsis() < 0 && getOrdinat() < 0){
            return 3;
        }else if (getAbsis() > 0 && getOrdinat() < 0){
            return 4;
        }
        return 0;
    }

    //Menghitung jarak titik satu dengan titik pusat (0,0)
    public double getjarakpusat () {
        return Math.sqrt(Math.pow(getAbsis(), 2) + Math.pow(getOrdinat(), 2)) ;
    }

    //menghitung jarak titik satu dengan titik yang lain
    public double getjarak(Titik T) {
        return Math.sqrt(Math.pow(this.getAbsis()- T.getAbsis(), 2) + Math.pow(this.getOrdinat() - T.getOrdinat(), 2)) ;
    }

    //refleksi X 
    public void refleksiX (){
        this.setOrdinat(this.getOrdinat() * -1)  ;
    }

    //refleksi Y
    public void refleksiY (){
        this.setAbsis(this.getAbsis () * -1);
    }

    











}


