package tugas6;

public class Manusia {
    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;

    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public String getJenisKelamin() {
        String jenisKelamin = "";
        if (isJenisKelamin()==true){
            jenisKelamin = "Laki - Laki";
        } else{
            jenisKelamin = "Perempuan";
        }
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public double getTunjangan() {
        double tunjangan = 0;
        if(isMenikah()==true && isJenisKelamin()==true){
            tunjangan = 25;
        } else if (isMenikah()==true && isJenisKelamin()==false){
            tunjangan = 20;
        } else if (isMenikah()==false){
            tunjangan = 15;
        }
        return tunjangan;
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public String toString() {
        return "Nama\t\t:\t"+getNama() +
                "\nNIK\t\t:\t"+getNIK() +
                "\nJenis Kelamin\t:\t"+getJenisKelamin() +
                "\nPendapatan\t:\t"+getPendapatan() + "$";
    }
}
