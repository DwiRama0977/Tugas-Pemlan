package Tugas5;

class LabKomdas {
    private final int jaketA, jaketB, jaketC;
    private int harga;

    public LabKomdas (int hargaA, int hargaB, int hargaC) {
        jaketA = hargaA; 
        jaketB = hargaB;
        jaketC = hargaC;
    }
    public int getJaketA() {
        return jaketA;
    }
    public int getJaketB() {
        return jaketB;
    }
    public int getJaketC() {
        return jaketC;
    }

    public void total (int pilihan, int jumlah) {
        if  (pilihan==1) {
            harga = getJaketA() * jumlah;
            System.out.println("Harga per Jaket A : Rp." + getJaketA());
        }
        else if (pilihan == 2) {
            harga = getJaketB() * jumlah;
            System.out.println("Harga per Jaket B : Rp." + getJaketB());
        }
        else if (pilihan == 3) {
            harga = getJaketC() * jumlah;
            System.out.println("Harga per Jaket C : Rp." + getJaketC());
        }
        System.out.println("Total yang harus dibayar untuk " + jumlah + " jaket adalah : Rp." + harga);
    }
}