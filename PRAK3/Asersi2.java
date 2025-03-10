/**
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi,yang akan menolak input
 *             jari-jari lingkaran yang bernilai nol
 */
//class Lingkaran
class Lingkaran{
    private double jariJari;
    
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}
//class Asersi2
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh nol!!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = "
            +kelilingLingkaran);
    }
}

//pertanyaan: secara konsep, ada yang kurang tepat pada program asersi2 diatas. jelaskan pada lembar laporan praktikum!
//jawaban:perintah assert diatas memeriksa apakah jari-jari > 0, jika tidak akan memunculkan pesan error. Namun, untuk 
//menjalankan asersi di java, perlu menggunakan -enableassertions. program ini dimaksudkan untuk menolak input jari-jari lingkaran 
//yang bernilai nol atau negatif.Namun jika program dijalankan tanpa -enableassertions, asersi akan diabaikan dan program 
//akan tetap menerima nilai jari-jari negatif atau nol. Sehingga kita harus memastikan bahwa program selalu dijalankan dengan -enableassertion