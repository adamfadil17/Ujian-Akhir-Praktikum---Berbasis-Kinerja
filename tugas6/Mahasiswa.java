package tugas6;

public class Mahasiswa extends Manusia{
    private String NIM;
    private double IPK;

    public Mahasiswa(String nama, String NIK, boolean jenisKelamin, boolean menikah,
                     String NIM, double IPK) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getStatus() {
        String prodi;
        String angkatan = getNIM();

        switch (getNIM().charAt(6)) {
            case '2':
                prodi = "Teknik Meniup Gelembung";
                break;
            case '3':
                prodi = "Teknik Berburu Ubur Ubur";
                break;
            case '4':
                prodi = "Sistem Perhamburgeran";
                break;
            case '6':
                prodi = "Pendidikan Chum Bucket";
                break;
            case '7':
                prodi = "Teknologi Telepon Kerang";
                break;
            default:
                prodi = "Prodi tidak ditemukan";
        }

        return prodi + ", 20"+angkatan.substring(0,2);
    }

    public double getBeasiswa() {
        double beasiswa = 0;

        if(getIPK() >= 3.0 && getIPK() < 3.5){
            beasiswa = 50;
        } else if (getIPK() >= 3.5 && getIPK() <= 4){
            beasiswa = 75;
        }

        return beasiswa;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan()+getBeasiswa();
    }

    @Override
    public String toString() {

        System.out.println(super.toString());
        return "IPK\t\t:\t"+getIPK() +
                "\nNIM\t\t:\t"+getNIM() +
                "\nStatus\t\t:\t"+getStatus();



    }
}
