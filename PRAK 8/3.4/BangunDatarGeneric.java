/**
 * File : BangunDatarGeneric.java
 * Deskripsi : kelas konstruksi generic untuk BangunDatar
 * Nama: Diva Arfis Permata 
 * NIM : 24060123130102 
 */

 public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}