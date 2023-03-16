package Tugas1;

import java.util.Scanner;

public class Perputakaan_Main {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                String bukuAgama[][] = { { "Islam Rahmatan lil Alamin", "Ahmad Taufik", "2019", "89" },
                                { "Komunikasi dan Dakwah Islam", "Abdul Pirol", "2018", "162" },
                                { "Nalar Tasawuf", "Istania Widayati", "2019", "85" },
                                { "Murabahah", "Mukhlishin", "2018", "212" },
                                { "17 Tuntunan Hidup Muslim", "Wahyono Hadi", "2017", "393" } };

                String bukuFiksi[][] = { { "The lord of the Rings", "J.J.R. Tolkien", "2010", "378" },
                                { "Saman", "Ayu Utami", "2015", "240" },
                                { "Laskar Pelangi", "Andrea Hirata", "2007", "249" },
                                { "Tiada ojek di Paris", "Seno Gumira", "2009", "173" },
                                { "Bumi Manusia", "Pramoedya Ananta", "2006", "143" } };

                String bukuFilsafat[][] = { { "Filsafat", "Agus Thoha", "2020", "158" },
                                { "Studi Dasar Filsafat", "Tazkiyah Basa’ad", "2018", "197" },
                                { "Filsafat Pendidikan Islam", "Sehat Sultoni", "2018", "303" },
                                { "Filsafat Pendidikan Operasional", "Aswasulasikin", "2018", "151" },
                                { "Filsafat Pendidikan Vokasi", "Soetyono Iskandar", "2017", "112" } };

                String bukuPolitik[][] = { { "Filsafat Politik", "Henry J.Schmandt", "2009", "265" },
                                { "Politik Hukum di Indonesia", "Moh. Mahfud MD", "2016", "157" },
                                { "Etika Politik", "Frans Magnis Suseno", "2017", "374" },
                                { "The social Contract", "Jacques Rousseau", "2010", "276" },
                                { "Leviathan", "Thomas Hobbes", "2005", "348" } };

                String bukuPsikologi[][] = { { "Psikologi Industri & Organisasi", "Hany Azza", "2019", "105" },
                                { "Warna-warni Psikologi", "Ahmad faris", "2017", "195" },
                                { "Psikologi Pendidikan", "Mahsup & Yunita Septriana", "2018", "152" },
                                { "Psikologi Belajar", "Afi Parnawi", "2019", "160" },
                                { "Psikologi Komunikasi", "Markus Utomo", "2017", "76" } };

                String bukuSejarah[][] = { { "Sejarah Peradaban Islam", "Munir Subarman", "2015", "200" },
                                { "Hikayat Majapahit", "Nino Oktorino", "2016", "215" },
                                { "Jejak Mataram Islam", "Moh. Karso", "2009", "168" },
                                { "Sufisme Jawa", "Simuh", "2011", "236" },
                                { "Pasang Surut Demokrasi", "Muhammad Bakri", "2017", "268" } };

                String bukuTeknologi[][] = { { "Dasar Teknik Informatika", "Novega Pratama", "2020", "117" },
                                { "Pengantar Teknologi Informasi", "Buhori Muslim", "2017", "392" },
                                { "Metode Penelitian Teknik Informatika", "Ade Johar", "2019", "135" },
                                { "Aplikasi Komputer", "Dwi Krisbiantoro", "2018", "167" },
                                { "Pengantar Teknologi Informatika", "Bagaskoro", "2019", "121" } };

                int masukan = 8;

                do {
                System.out.println("======================================");
                System.out.println("SELAMAT DATANG DI PERPUSTAKAAN DIGITAL");
                System.out.println("======================================");
                System.out.println("Pilih Kategori Buku : ");
                System.out.println("1. Agama");
                System.out.println("2. Fiksi");
                System.out.println("3. Filsafat");
                System.out.println("4. Politik");
                System.out.println("5. Psikologi");
                System.out.println("6. Sejarah");
                System.out.println("7. Teknologi");
                System.out.println("(Masukkan angka lain untuk keluar)");
                System.out.print("Pilihan : ");
                masukan = input.nextInt();

                switch (masukan) {
                        case 1:
                                tampilan(bukuAgama, "Agama");
                                break;
                
                        case 2: 
                                tampilan(bukuFiksi, "Fiksi");
                                break;

                        case 3:
                                tampilan(bukuFilsafat, "Filsafat");
                                break;

                        case 4:
                                tampilan(bukuPolitik, "politik");
                                break;

                        case 5:
                                tampilan(bukuPsikologi, "Psikologi");
                                break;

                        case 6:
                                tampilan(bukuSejarah, "Sejarah");
                                break;

                        case 7: 
                                tampilan(bukuTeknologi, "Teknologi");
                                break;

                        default:
                                System.out.println("Anda telah keluar");
                                break;
                }
                } while (masukan>0 && masukan<8);
        }

        public static void tampilan(String atribut[][], String kategori_Buku) {
                Perpustakaan buku = new Perpustakaan();
                buku.setKategori(kategori_Buku);
                for (int i = 0; i < atribut.length; i++) {
                        buku.setJudul(atribut[i][0]);
                        buku.setPenulis(atribut[i][1]);
                        buku.setTahun(atribut[i][2]);
                        buku.setHalaman(atribut[i][3]);
                        buku.tampil();
                }
        }
}
