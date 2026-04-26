public class MainAnabul {
    public static void main(String[] args) {
        Anabul[] daftar = {
            new Kucing("Aisyaila"),
            new Anjing("Cazyi"),
            new Burung("Mersht")
        };

        for (Anabul a : daftar) {
            a.bersuara();
            a.gerak();
            System.out.println();
        }
    }
}
