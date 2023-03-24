package Tugas1;

import java.util.Scanner;

public class Perputakaan_Main {
        public static void main(String[] args) {
                Perpustakaan book = new Perpustakaan();
                Scanner input = new Scanner(System.in);
                String bukuAgama[][] = { { "Islam Rahmatan lil Alamin", "Ahmad Taufik", "2019", "89",  "kumpulan karya sastra antologi puisi di era digital dalam meningkatkan kepekaan manusia" },
                                { "Komunikasi dan Dakwah Islam", "Abdul Pirol", "2018", "162","Berisi tentang dakwah islam dan juga cara berkomunikasi saat dakwah islam" },
                                { "Nalar Tasawuf", "Istania Widayati", "2019", "85", "Berisi tentang dasar beserta pengantar cara dan manfaat dalam belajar tasawuf" },
                                { "Murabahah", "Mukhlishin", "2018", "212", "Berisi tentang konsep, hukum, evaluasi, dan juga aplikasinya dalam perbankan islam" },
                                { "17 Tuntunan Hidup Muslim", "Wahyono Hadi", "2017", "393", "Buku ini mengajak Anda ke arah yang lebih baik, buku ini juga mengajak kita untuk mengenal diri kita sendiri sebagai makhluk Tuhan" } };

                String bukuFiksi[][] = { { "The lord of the Rings", "J.J.R. Tolkien", "2010", "378", "Cerita tentang peperangan antara kaum kurcaci dan penyihir dengan kaum monster" },
                                { "Saman", "Ayu Utami", "2015", "240", "Tentang seorang mantan pastur bernama Saman dan empat perempuan yang bersahabat dari kelas enam SD sampai mereka dewasa" },
                                { "Laskar Pelangi", "Andrea Hirata", "2007", "249", "Bercerita tentang kehidupan 10 anak dari keluarga miskin yang bersekolah dan penuh dengan keterbatasan" },
                                { "Tiada ojek di Paris", "Seno Gumira", "2009", "173", "Kumpulan esai-esai bernas Seno Gumira Ajidarma tentang masyarakat urban dan kota metropolitan" },
                                { "Bumi Manusia", "Pramoedya Ananta", "2006", "143", "Menceritakan kegamangan Minke antara kemajuan Eropa dan perjuangan membela tanah airnya serta hubungannya dengan Annelies" } };

                String bukuFilsafat[][] = { { "Filsafat Ilmu", "Agus Thoha", "2020", "158", "Berisi tentang dasar-dasar pengembangan ilmu filsafat sebagai pondasi filsafat" },
                                { "Studi Dasar Filsafat", "Tazkiyah Basa’ad", "2018", "197", "Membahas tentang dasar-dasar filsafat dan juga sejarah perkembangan ilmu filsafat itu sendiri" },
                                { "Filsafat Pendidikan Islam", "Sehat Sultoni", "2018", "303", "Membahas tentang filsafat pendidikan dan mempelajari lebih jauh tentang hakikat manusia dalam pemikiran islam" },
                                { "Filsafat Pendidikan Operasional", "Aswasulasikin", "2018", "151", "Mempelajari filsafat pendidikan pragmatis, filsafat pendidikan perenialisme, dan filsafat dalam rekonstruktifisme budaya" },
                                { "Filsafat Pendidikan Vokasi", "Soetyono Iskandar", "2017", "112", "Menjabarkan tentang perkembangan moral, konstruksi karakter dan tawuran serta membahas konflik yang terjadi dalam kehidupan sehari-hari" } };

                String bukuPolitik[][] = { { "Filsafat Politik", "Henry J.Schmandt", "2009", "265", "Mempelajari perkembangan politik dari masa ke masa dan bagaimana filsafat berperan dalam ilmu politik" },
                                { "Politik Hukum di Indonesia", "Moh. Mahfud MD", "2016", "157", "Berisi berbagai penalaran kritis tentang sistem hukum di Indonesia khususnya mengenai demokrasi" },
                                { "Etika Politik", "Frans Magnis Suseno", "2017", "374", "Membahas bagaimana sistem pembagian kekuasaan, bentuk negara, maupun hak asasi manusia" },
                                { "The social Contract", "Jacques Rousseau", "2010", "276", "Mempelajari ilmu yang mendalami materi politik khususnya mengenai ilmu negara secara komprehensif" },
                                { "Leviathan", "Thomas Hobbes", "2005", "348", "Tentang politik yang engibaratkan negara sebagai Leviathan bagi rakyatnya, yakni monster yang menjaga gerak-gerik rakyatnya agar tetap patuh pada pemerintah yang berwenang" } };

                String bukuPsikologi[][] = { { "Psikologi Industri & Organisasi", "Hany Azza", "2019", "105", "Membahas psikologi dalam dunia industri dan organisasi seperti perekrutan, manajemen dan terkait dengan cara penanganan karyawan" },
                                { "Warna-warni Psikologi", "Ahmad faris", "2017", "195", "Pembahasan terkait dengan dunia psikologi seperti diri, pribadi, keluarga dan dinamikanya, pendidikan, masyarakat dan lingkup sosial" },
                                { "Psikologi Pendidikan", "Mahsup & Yunita Septriana", "2018", "152", "Mengulas tentang perhatian atau ketertarikan manusia, pengamatan, tanggapan, fantasi, ingata, berfikir, perasaan, motif" },
                                { "Psikologi Belajar", "Afi Parnawi", "2019", "160", "Dijelaskan mengenai belajar, dimana belajar merupakan suatu proses perubahan di dalam kepribadian manusia" },
                                { "Psikologi Komunikasi", "Markus Utomo", "2017", "76", "Mempelajari usaha untuk memprediksi, menguraikan, dan mengendalikan peristiwa mental dan behaviorial dalam komunikasi" } };

                String bukuSejarah[][] = { { "Sejarah Peradaban Islam", "Munir Subarman", "2015", "200", "Berisi tentang penjelasan secara umum serajah islam selepas wafatnya Rosulullah Saw." },
                                { "Hikayat Majapahit", "Nino Oktorino", "2016", "215", "Berisi tentang sejarah awal mula berdirinya kerajaan majapahit hingga runtuhnya kerajaan majapahit" },
                                { "Jejak Mataram Islam", "Moh. Karso", "2009", "168", "Menjelaskan tentang asal-usul berdirinya kerajaan mataram islam dan juga peninggalannya" },
                                { "Sufisme Jawa", "Simuh", "2011", "236", "Tentang upaya melacak Sufisme Jawa dengan pendekatan historis dan tekstual-kultural" },
                                { "Pasang Surut Demokrasi", "Muhammad Bakri", "2017", "268", "Membahas tentang demokrasi di Indonesia dari tahun ke tahun sebagai tolak ukur pandangan bangsa" } };

                String bukuTeknologi[][] = { { "Dasar Teknik Informatika", "Novega Pratama", "2020", "117", "Mempelajari tentang pengolahahan data, pemprosesan data, penyimpanan data, manipulasi data" },
                                { "Pengantar Teknologi Informasi", "Buhori Muslim", "2017", "392", "Berisi tentang pengantar dalam pendidikan teknologi informasi serta sebagai patokan dasarnya" },
                                { "Metode Penelitian Teknik Informatika", "Ade Johar", "2019", "135", "Membahas tentang penelitian dalam teknik informartika untuk bisa meindentifikasi masalah dan hipotesis" },
                                { "Aplikasi Komputer", "Dwi Krisbiantoro", "2018", "167", "Berisi tentang dasar pengembangan dalam pembuatan aplikasi komputer di teknik informatika" },
                                { "Pengantar Teknologi Informatika", "Bagaskoro", "2019", "121", "Mengulas tentang konsep-konsep dan dasar dalam teknologi informasi dan komunikasi" } };

                int masukan = 8;
                String judulLama = "";
                int index = 0;
                Perpustakaan bukuBaru;

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
                                copyBuku("Agama", bukuAgama);
                                break;

                        case 2: 
                                tampilan(bukuFiksi, "Fiksi");
                                copyBuku("Fiksi", bukuFiksi);
                                break;

                        case 3:
                                tampilan(bukuFilsafat, "Filsafat");
                                copyBuku("Filsafat", bukuFilsafat);
                                break;

                        case 4:
                                tampilan(bukuPolitik, "Politik");
                                copyBuku("Politik", bukuPolitik);
                                break;

                        case 5:
                                tampilan(bukuPsikologi, "Psikologi");
                                copyBuku("Psikologi", bukuPsikologi);
                                break;

                        case 6:
                                tampilan(bukuSejarah, "Sejarah");
                                copyBuku("Sejarah", bukuSejarah);
                                break;

                        case 7: 
                                tampilan(bukuTeknologi, "Teknologi");
                                copyBuku("Teknologi", bukuTeknologi);
                                break;

                        default:
                                System.out.println("Anda telah keluar");
                                break;
                }
                } while (masukan>0 && masukan<8);
        }

        public static void tampilan(String atribut[][], String kategori_Buku) {
                Scanner input = new Scanner(System.in);

                //INSTANSIASI OBJEK BUKU
                // Perpustakaan bukuCopy = new Perpustakaan();
                
                //MEMANGGIL METHOD SETTER
                //buku.setKategori(kategori_Buku);

                for (int i = 0; i < atribut.length; i++) {
                        //(JAWABAN NO.2)INSTANSIASI BUKU DENGAN MEMANGGIL CONSTRUCTOR SEMUA ATRIBUT
                        Perpustakaan buku = new Perpustakaan(kategori_Buku, atribut[i][0], atribut[i][1], atribut[i][2], atribut[i][3], atribut[i][4]);
                        buku.tampil();
                        System.out.println("Jumlah kata pada sinopsis : " + buku.jumlahKata(atribut[i][4]));
                        System.out.println();

                        // MEMANGGIL METHOD SETTER
                        // buku.setJudul(atribut[i][0]);
                        // buku.setPenulis(atribut[i][1]);
                        // buku.setTahun(atribut[i][2]);
                        // buku.setHalaman(atribut[i][3]);
                        // buku.setSinopsis(atribut[i][4]);
                }
        }

        //(JAWABAN NO. 5)MENGCOPY OBJEK BUKU BERDASARKAN JUDUL
        public static void copyBuku (String kategori, String kategoriBuku[][]){
                Perpustakaan book = new Perpustakaan();
                Scanner input = new Scanner(System.in);
                System.out.println("Masukkan Judul Buku yang akan dicopy : ");
                String judulLama = input.nextLine();
                int index = book.cariBuku(judulLama, kategoriBuku);
                Perpustakaan bukuBaru = new Perpustakaan(kategori, kategoriBuku[index][0], kategoriBuku[index][1], kategoriBuku[index][2], kategoriBuku[index][3], kategoriBuku[index][4]);
                System.out.println();
                System.out.println("Hasil copy buku baru : ");
                bukuBaru.tampil();
                System.out.println();
        }
}