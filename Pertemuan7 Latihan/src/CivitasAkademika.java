public class CivitasAkademika {
    protected String nama;

    public CivitasAkademika (String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public String getNomor(){
        return "-";  //default dan akan dilakukan override
    }
}
