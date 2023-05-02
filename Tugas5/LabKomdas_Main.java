package Tugas5;

import java.util.Scanner;

public class LabKomdas_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LabKomdas HargaAsli = new LabKomdas(100000, 125000, 175000);
        LabKomdas HargaDiskon = new LabKomdas(95000, 120000, 160000);
        System.out.println("====SELAMAT DATANG DI TOKO JAKET====");
        System.out.println("Pilih jaket yang ingin dipesan");
        System.out.println("1. Jaket A");
        System.out.println("2. Jaket B");
        System.out.println("3. Jaket C");
        System.out.println("Pilih angka lain untuk keluar");
        System.out.print("Masukkan pilihan anda : ");
        int pilihan = input.nextInt();
        if (pilihan > 0 && pilihan <4) {
            System.out.print("Masukkan jumlah jaket : ");
            int jumlah = input.nextInt();
            if (jumlah <=100) {
                HargaAsli.total(pilihan, jumlah);
            }
            else {
                HargaDiskon.total(pilihan, jumlah);
            }
        }
        else {
            System.out.println("Anda telah keluar");
        }
    }
}
