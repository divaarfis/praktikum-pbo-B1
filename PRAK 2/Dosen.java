public class Dosen {
    private String NIP;
    private String Nama; 
    private String Prodi ;



    //konstruktor 
    public Dosen (){
        NIP = "#" ;
        Nama = "#" ;
        Prodi = "#" ;
    }

    public Dosen (String NIP, String Nama, String Prodi){
        this.NIP = NIP ;
        this.Nama = Nama ; 
        this.Prodi = Prodi ;
    }

    //selektor 
    public String getNIP(){
        return this.NIP ;
    }

    public String getNamaDosen (){
        return this.Nama ;
    }

    public String getProdiDosen(){
        return this.Prodi ;
    } 

    //mutator 
    public void setNip (String NIP){
        this.NIP = NIP ; 
    }

    public void setNamaDosen (String Nama){
        this.Nama = Nama ; 
    }

    public void setNamaProdi (String Prodi){
        this.Prodi = Prodi ; 
    }

    public void printDosen() {
        System.out.println("NIP: " + this.NIP);
        System.out.println("Nama: " + this.Nama);
        System.out.println("Jurusan: " + this.Prodi);
    }



}
