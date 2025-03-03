public class Kendaraan {
    private String noplat ; 
    private String jenis ; 

    //kontruktor 
    public Kendaraan (){
        noplat = "#" ;
        jenis =  "#" ;
    }

    public Kendaraan (String noplat,String jenis){
        this.noplat = noplat ;
        this.jenis = jenis ;
    }

    //selektor 
    public String getnoplat (){
        return this.noplat ;
    }

    public String getjenis() {
        return this.jenis ; 
    }

    //mutator 
    public void setnoplat (String noplat) {
        this.noplat = noplat ;
    }

    public void setjenis (String jenis){
        this.jenis = jenis ;
    }

    public void printKendaraan() {
        System.out.println("No Plat: " + this.noplat);
        System.out.println("Jenis: " + this.jenis);
    }
}





