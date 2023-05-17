package Tugas7;

public class KueMain {
    public static void main(String[] args) {
        System.out.println("=======DAFTAR PEMBELIAN KUE=======");
        Kue[] daftarKue = new Kue[20];
        daftarKue[0] = new KuePesanan("Donat", 2500, 50);
        daftarKue[1] = new KuePesanan("Pastel", 3000, 40);
        daftarKue[2] = new KuePesanan("Lemper", 2000, 67);
        daftarKue[3] = new KuePesanan("Kue Putu", 3000, 60);
        daftarKue[4] = new KuePesanan("Risol", 2500, 67);
        daftarKue[5] = new KuePesanan("Sosis Solo", 2500, 65);
        daftarKue[6] = new KuePesanan("Nagasari", 2000, 70);
        daftarKue[7] = new KuePesanan("Cucur", 2500, 45);
        daftarKue[8] = new KuePesanan("Molen", 3000, 80);
        daftarKue[9] = new KuePesanan("Pukis", 5000, 55);
        daftarKue[10] = new KueJadi("Nastar", 50000, 4);
        daftarKue[11] = new KueJadi("Lidah Kucing", 45000, 3);
        daftarKue[12] = new KueJadi("Kastengel", 35000, 1);
        daftarKue[13] = new KueJadi("cookies", 40000, 2);
        daftarKue[14] = new KueJadi("Kue Kacang", 45000, 2);
        daftarKue[15] = new KueJadi("Ciput", 30000, 1);
        daftarKue[16] = new KueJadi("Bola Coklat", 35000, 4);
        daftarKue[17] = new KueJadi("Kue Keju", 40000, 3);
        daftarKue[18] = new KueJadi("Putri Salju", 40000, 2);
        daftarKue[19] = new KueJadi("Kue Abon", 35000, 1);

        // Tampilan semua kue
        for (int i = 0; i < daftarKue.length; i++) {
            System.out.println(daftarKue[i].toString());
            if (daftarKue[i] instanceof KuePesanan ) {
                System.out.println("Jenis Kue\t: Kue Pesanan");
            }
            else {
                System.out.println("Jenis kue\t: Kue Jadi");
            }
        }
        System.out.println();

        // Total harga semua kue
        double hargaSemuaKue = 0;
        for (int i = 0; i < daftarKue.length; i++) {
            hargaSemuaKue += daftarKue[i].hitungHarga();
        }
        System.out.println("=======HARGA TOTAL SEMUA KUE=======");
        System.out.println("TOTAL HARGA\t\t: " + hargaSemuaKue);

        //total harga dan berat kue pesanan
        System.out.println("\n=TOTAL HARGA DAN BERAT KUE PESANAN=");
        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;
        for (int i = 0; i < daftarKue.length; i++) {
            if(daftarKue[i] instanceof KuePesanan) {
                totalHargaPesanan += daftarKue[i].hitungHarga();
                totalBeratPesanan += ((KuePesanan) daftarKue[i]).getBerat();
            }
        }
        System.out.println("HARGA TOTAL KUE PESANAN\t: " + totalHargaPesanan);
        System.out.println("BERAT TOTAL KUE PESANAN\t: " + totalBeratPesanan);

        //total harga dan jumlah kue jadi
        System.out.println("\n==TOTAL HARGA DAN JUMLAH KUE JADI==");
        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;
        for(int i = 0; i < daftarKue.length; i++) {
            if(daftarKue[i] instanceof KueJadi) {
                totalHargaJadi += daftarKue[i].hitungHarga();
                totalJumlahJadi += ((KueJadi) daftarKue[i]).getJumlah();
            }
        }
        System.out.println("HARGA TOTAL KUE JADI\t: " + totalHargaJadi);
        System.out.println("JUMLAH TOTAL KUE JADI\t: " + totalJumlahJadi);
    
        //Mencari kue termahal
        double kueMahal = 0;
        Kue mahal = null;
        for (int i = 0; i < daftarKue.length; i++) {
            if(kueMahal < daftarKue[i].hitungHarga()){
                kueMahal = daftarKue[i].hitungHarga();
                mahal = daftarKue[i];
            }
        }
        if(mahal != null) {
            System.out.println("\n===========KUE TERMAHAL===========" + mahal.toString());
        }
    }
}
