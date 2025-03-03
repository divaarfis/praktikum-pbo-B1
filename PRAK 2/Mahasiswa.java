import java.util.ArrayList;

public class Mahasiswa {
    /*ATRIBUT*/
    private String nim;
    private String nama;
    private String prodi;
    ArrayList <MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /*METHOD*/
    public Mahasiswa(){
        this.listMatKul = new ArrayList<>();
    }

    public Mahasiswa (String nim, String nama, String prodi){
        this.nim = nim ;
        this.nama = nama ;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>() ;
    }

    //selektor 
    public String getNim(){
        return this.nim ;
    }

    public String getNama(){
        return this.nama ; 
    }

    public String getProdi(){
        return this.prodi ;
    }

    public Dosen getNamaDosen(){
        return this.dosenWali ;
    }

    public Kendaraan getKendaraan(){
        return this.kendaraan ;
    }

    //mutator 
    public void setNim(String nim){
        this.nim = nim;
    }

    public void setNama (String nama){
        this.nama = nama ;
    }

    public void setProdi (String prodi){
        this.prodi = prodi ;
    }

    public void setDoswal (Dosen dosenwali){
        this.dosenWali = dosenwali ;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan ;
    }

    //method 
    public void addMatKul(MataKuliah matkul){
        if (this.listMatKul.size() < 50){
            this.listMatKul.add(matkul);
        }else{
            System.out.println( "list MataKuliah penuh");
        }
    }


    public void printDetailMhs () {
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println();
        int i;

        System.out.println("Daftar Mata Kuliah:");
        for(i = 0; i < listMatKul.size(); i++) {
            MataKuliah mk = listMatKul.get(i);
            System.out.println((i+1) + "." + mk.getNamaMatkul() +" (" + mk.getsks() + "sks)") ;
        }

        System.out.println("\nTotal Mata Kuliah: " + getJumlahMatkul());
        System.out.println("Total SKS: " + getJumlahsks());

        System.out.println("\nDosen Wali:");
        if (dosenWali != null) {
            dosenWali.printDosen();
        } else {
            System.out.println("Belum ada dosen wali");
        }
        
        System.out.println("\nKendaraan:");
        if (kendaraan != null) {
            kendaraan.printKendaraan();
        } else {
            System.out.println("Tidak memiliki kendaraan");
        }
    
    }

    public int getJumlahsks(){
        int totalsks = 0;
        for (MataKuliah mk : this.listMatKul) {
            totalsks += mk.getsks();
        }
        return totalsks ;
    }

    public int  getJumlahMatkul(){
        return this.listMatKul.size();
    }

    public void printMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }



}//end class Mahasiswa