package tugas7;

public class PegawaiHarian extends Pegawai{
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;

    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    @Override
    public double gaji() {
        double total = 0;
        if (getTotalJam() <= 40){
            total = getTotalJam()*getUpahPerJam();
        } else if(getTotalJam() > 40){
            total = (40*getUpahPerJam())+((getTotalJam()-40)*getUpahPerJam()*1.5);
        }
        return super.gaji()+total;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Status            : " + "Pegawai Harian" + "\n" +
                "Upah per Jam      : "+"Rp. "+String.format("%.0f", getUpahPerJam()) + "\n" +
                "Total Jam kerja   : "+getTotalJam() + "\n" +
                "Pendapatan        : "+"Rp. "+String.format("%.0f", gaji());
    }
}
