package tugas7;

public class PegawaiTetap extends Pegawai {
    private double upah;
    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    @Override
    public double gaji() {
        return super.gaji()+getUpah();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Status            : " + "Pegawai Tetap" + "\n" +
                "Upah              : "+ "Rp. "+String.format("%.0f", getUpah()) + "\n" +
                "Pendapatan        : "+ "Rp. "+String.format("%.0f", gaji());
    }
}
