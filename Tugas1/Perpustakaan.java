package Tugas1;

public class Perpustakaan {
    private String penulis;
    private String judul;
    private String kategori;
    private String tahun;
    private String halaman;
    private String sinopsis;

    //(JAWABAN NO.2)MENGGUNAKAN CONSTRUKTOR
    public Perpustakaan(String kategori, String judul, String penulis, String tahun, String halaman, String sinopsis) {
        this.kategori = kategori;
        this.penulis = penulis;
        this.judul = judul;
        this.tahun = tahun;
        this.halaman = halaman;
        this.sinopsis = sinopsis; 
    }

    public Perpustakaan() {
    }

    //(JAWABAN NO.3)METHOD HITUNG KATA PADA ATRIBUT SINOPSIS
    public int jumlahKata(String sinopsis){
        String hasil = sinopsis.replace('-', ' ');
        String kata[] = hasil.split(" ");
        return kata.length;
    }

    //(JAWABAN NO. 5)MEMBUAT METHOD COPY OBJEK YANG NILAINYA SAMA
    public Perpustakaan copy (Perpustakaan bukuLama){
        Perpustakaan bukuBaru = new Perpustakaan(bukuLama.kategori, bukuLama.judul, bukuLama.penulis, bukuLama.tahun, bukuLama.halaman, bukuLama.sinopsis);
        return bukuBaru;
    }

    //METHOD UNTUK MENCARI BUKU BERDASARKAN JUDUL
    public int cariBuku (String judul, String bukuLama[][]){
        int hasil = 0;
        for (int i = 0; i < 5; i++){
            if (bukuLama[i][0].equalsIgnoreCase(judul)) {
            return hasil = i;
            }
        }
        return hasil;
    }

    // MENGGUNAKAN METHOD SETTER
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public void setHalaman(String halaman) {
        this.halaman = halaman;
    }

    public void tampil() {
        System.out.println("Judul Buku\t: " + this.judul);
        System.out.println("Penulis Buku\t: " + this.penulis);
        System.out.println("Tahun terbit\t: " + this.tahun);
        System.out.println("Halaman buku\t: " + this.halaman + " halaman");
        System.out.println("Sinopsis buku\t: " + this.sinopsis);
    }
}