package tugas7;

public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;
    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public double gaji() {
        return super.gaji()+(getPenjualan()*getKomisi());
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Status            : " + "Sales" + "\n" +
                "Total Penjualan   : "+getPenjualan() + "\n" +
                "Besaran Komisi    : "+"Rp. "+String.format("%.0f", getKomisi()) + "\n" +
                "Pendapatan        : "+"Rp. "+String.format("%.0f", gaji());
    }
}
