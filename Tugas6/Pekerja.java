package Tugas6;

import java.time.LocalDate;

public class Pekerja extends Human {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, String nik, boolean jenisKelamin, boolean menikah, double gaji, int tahun, int bulan, int hari, int jumlahAnak) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, hari);
        this.jumlahAnak = jumlahAnak;
    }

    public void setGaji (double gaji) {
        this.gaji = gaji;
    }

    public void setTahunMasuk (LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public void setJumlahAnak (int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() {
        return gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public double getBonus() {
        double tahun = 2023 - this.tahunMasuk.getYear();
        if (tahun > 10) {
            return gaji * (15.0/100);
        }
        else if (tahun > 5) {
            return gaji * (10.0/100);
        }
        else {
            return gaji * (5.0/100);
        }
    }

    public double getTunjangan() {
        return super.getTunjangan() + (20 * jumlahAnak);
    }

    public double getPendapatan() {
        return super.getPendapatan() + getGaji() + getBonus();
    }

    public String toString() {
        return ("\nNama\t\t: " + getNama() + "\nNIK\t\t: " + getNik() + "\nJenis Kelamin\t: " + getKelamin() + "\nPendapatan\t: " 
        + getPendapatan() + "\nTahun Masuk\t: " + getTahunMasuk() + "\nJumlah Anak\t: " + getJumlahAnak() + "\nGaji\t\t: " + getGaji());
    }
}
