package Tugas6;

class Human {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Human(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public String getKelamin() {
        return jenisKelamin == true ? ("Laki-laki") : "Perempuan";
    }

    public String getNik() {
        return nik;
    }

    public boolean getMenikah() {
        return menikah;
    }

    public double getTunjangan() {
        if (getMenikah() == true) {
            if (jenisKelamin = true) {
                return 25;
            } else {
                return 20;
            }
        } else {
            return 15;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public String toString () {
        return (
            "\nNama\t\t: " + getNama() +"\nNIK\t\t: " + getNik() + "\nJenis Kelamin\t: " + getKelamin() + "\nPendapatan\t: " + getPendapatan()
        );
    }
}
