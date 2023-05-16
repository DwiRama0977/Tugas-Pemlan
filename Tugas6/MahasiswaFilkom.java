package Tugas6;

class MahasiswaFilkom extends Human{
    private String nim ;
    private double ipk;

    public MahasiswaFilkom (String nama, String nik, boolean jenisKelamin, boolean menikah, String nim, double ipk) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public void setNim (String nim) {
        this.nim = nim;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public double getIpk() {
        return ipk;
    }

    public String getStatus() {
        String angkatan = nim.substring(0, 2);
        if (nim.substring(6, 7).equalsIgnoreCase("2")) {
            return "Teknik Informatika, " + angkatan;
        }
        else if (nim.substring(6,7).equalsIgnoreCase("3")) {
            return "Teknik Komputer, " + angkatan;
        }
        else if (nim.substring(6,7).equalsIgnoreCase("4")) {
            return ("System Informasi, " + angkatan);
        }
        else if (nim.substring(6,7).equalsIgnoreCase("6")) {
            return ("Pendidikan Teknologi Informasi, " + angkatan);
        }
        else if (nim.substring(6,7).equalsIgnoreCase("7")) {
            return ("Teknologi Informasi, " + angkatan);
        }
        else {
            return "Tidak termasuk ke dalam prodi yang ada, " + angkatan;
        }
    }

    public double getBeasiswa() {
        if (getIpk() > 3.5) {
            return 75 + getPendapatan();
        }
        else if (getIpk() >= 3.0) {
            return 50 + getPendapatan();
        }
        else {
            return 0 + getPendapatan();
        }
    }

    public String toString() {
        return ("\nNama\t\t: " + getNama() + "\nNIK\t\t: " + getNik() + "\nJenis Kelamin\t: " + getKelamin() + "\nPendapatan\t: "
                + getBeasiswa() + "\nNIM\t\t: " + getNim() + "\nIPK\t\t: " + getIpk() + "\nStatus\t\t: " + getStatus());
    }
}
