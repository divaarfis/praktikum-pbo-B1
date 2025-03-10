/**
 * File        : AngkaSial.java
 * Deskripsi   : Program penggunaan exception buatan sendiri
 *              Pengenalan klausa 'throw' dan 'throws'
 */

 public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(16);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

//pertanyaan: ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java diatas dieksekusi? 
//apakah baris 21 pada AngkaSial.java diatas dieksekusi? 
//jawaban: baris 12 dieksekusi saat input bukan 13, sedangkan baris 21 akan dieksekusi saat 
//exception ditangkap,  yang terjadi ketikda as.cobaAngka(13) dipanggil