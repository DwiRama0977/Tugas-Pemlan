package Tugas1;

public class Perpustakaan {
    private String penulis;
    private String judul;
    private String kategori;
    private String tahun;
    private String halaman;

    public void setKategori(String kategoriBuku) {
        this.kategori = kategoriBuku;
    }

    public void setPenulis(String penulisBuku) {
        this.penulis = penulisBuku;
    }

    public void setJudul(String judulBuku) {
        this.judul = judulBuku;
    }

    public void setTahun(String tahunTerbit) {
        this.tahun = tahunTerbit;
    }

    public void setHalaman(String halamanBuku) {
        this.halaman = halamanBuku;
    }

    public void tampil() {
        System.out.println("Judul Buku\t: " + this.judul);
        System.out.println("Penulis Buku\t: " + this.penulis);
        System.out.println("Tahun terbit\t: " + this.tahun);
        System.out.println("Halaman buku\t: " + this.halaman + " halaman");
        System.out.println();
    }
}