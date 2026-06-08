package praktikum11;

public class Player {
    private int tinggi;
    private int berat;

    public Player(int tinggi, int berat) {
        this.tinggi = tinggi;
        this.berat = berat;
    }

    public int getTinggi() {
        return tinggi;
    }

    public int getBerat() {
        return berat;
    }

    @Override
    public String toString() {
        return "Tinggi = " + tinggi + " cm, Berat = " + berat + " kg";
    }
}