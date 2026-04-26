/*
Kelompok PBO:
1. Agung Rama Pramana Putra (24060124120007)
2. Andiny Khaerany Suhartady (24060124140194)
3. Cindy Kurniawan (24060124140201)
4. Jessica Laurencia Panjaitan (24060124130084)
5. Putri Elizabeth Simanjuntak (24060124120018)
*/


public abstract class  User {
    protected int id;
    protected String nama;
    protected String email;
    protected String password;

    public User(int var1, String var2, String var3, String var4){
        this.id = var1;
        this.nama = var2;
        this.email = var3;
        this.password = var4;
    }

    //setter & getter
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return this.nama;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return this.email;
    }

    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword(){
        return this.password;
    }


    public void login(String password){
        if (password.equals(this.getPassword())){
            System.out.println(this.getNama() + " berhasil login.");
        } else {
            System.out.println("Login gagal: password salah.");
        }
    }

    public void logout(){
        System.out.println("User telah logout");
    }


}