/*
*File :ExceptionOnArray.java
*Deskripsi : Program penggunaan eksepsi menggunakan class library Java
*Nama : Andiny Khaerany Suhartady
*NIM :24060124140194
*/
public class ExceptionOnArray {
    public static void main (String [] args){
        //intansi object array integer
        Integer [] arrayInteger =  new Integer [4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}
