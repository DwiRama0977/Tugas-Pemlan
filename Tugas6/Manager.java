package Tugas6;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String nama, String nik, boolean jenisKelamin, boolean menikah, double gaji, int tahun, int bulan, int hari, int jumlahAnak, String departemen) {
        super(nama, nik, jenisKelamin, menikah, gaji, tahun, bulan, hari, jumlahAnak);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public double getTunjangan() {
        return super.getTunjangan() + ((10/100) * getGaji());
    }

    public String toString() {
        return ("\nNama\t\t: " + getNama() + "\nNIK\t\t: " + getNik() + "\nJenis Kelamin\t: " + getKelamin() + "\nPendapatan\t: " 
        + getPendapatan() + "\nTahun Masuk\t: " + getTahunMasuk() + "\nJumlah Anak\t: " + getJumlahAnak() + "\nGaji\t\t: " + getGaji() 
        + "\nDepartemen\t: " + getDepartemen());
    }
}
