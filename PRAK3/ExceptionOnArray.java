/**
 * File      : ExceptionOnArray.java
 * Deskripsi : Program penggunaan eksepsi menggunakan class library Java
 *
 */
public class ExceptionOnArray{
    public static void main(String[] args){
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[1];
        try{
            arrayInteger[0] = 11;
            arrayInteger[1] = 10;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}