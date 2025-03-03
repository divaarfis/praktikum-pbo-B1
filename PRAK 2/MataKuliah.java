public class MataKuliah {
    private String idmatkul;
    private String NamaMatkul;
    private int sks;

    //konstruktor 
    public MataKuliah(){
        idmatkul="#" ;
        NamaMatkul = "#" ;
        sks = 0 ;
    }

    public MataKuliah(String idmatkul, String NamaMatkul, Integer sks) {
        this.idmatkul = idmatkul ;
        this.NamaMatkul = NamaMatkul ;
        this.sks = sks ;
    }

    //selektor 
    public String getidmatkul(){
        return this.idmatkul ;
    }

    public String getNamaMatkul(){
        return this.NamaMatkul;
    }

    public Integer getsks(){
        return this.sks ;
    }

    //mutator 
    public void setidmatkul(String idmatkul){
        this.idmatkul = idmatkul ;
    }

    public void setNamaMatkul(String NamaMatkul){
        this.NamaMatkul = NamaMatkul ;
    }

    public void setsks (int sks) {
        this.sks = sks ;
    }


}
