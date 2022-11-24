package bsi.ac.id.martabak2;

public class Martabak {
    String nama;
    String harga;
    String bintang;
    int image;

    public Martabak(String nama, String harga, String bintang, int image) {
        this.nama = nama;
        this.harga = harga;
        this.bintang = bintang;
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public String getHarga() {
        return harga;
    }

    public String getBintang() {
        return bintang;
    }

    public int getImage() {
        return image;
    }
}
