package tugas6;

public class Manager extends Pekerja{
    private int lamaKerja;

    public Manager(String nama, String NIK, boolean jenisKelamin, boolean menikah, int jamKerja, int hariKerja,
            String NIP, int lamaKerja) {
        super(nama, NIK, jenisKelamin, menikah, jamKerja, hariKerja, NIP);
        this.lamaKerja = lamaKerja;
        //TODO Auto-generated constructor stub
    }   

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    @Override
    public double getBonus() {
        return super.getBonus()+(0.3*super.getBonus());
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan()+15+(0.3*super.getBonus());
    }

    @Override
    public String toString() {
        return "Nama\t\t:\t"+getNama() + 
                "\nNIK\t\t:\t"+getNIK() +
                "\nJenis Kelamin\t:\t"+getJenisKelamin() +
                "\nPendapatan\t:\t"+getPendapatan() +
                "\nBonus\t\t:\t"+getBonus() +
                "\nGaji\t\t:\t"+(getPendapatan()-getBonus()) +
                "\nStatus\t\t:\t"+getStatus() +
                "\nLama Kerja\t:\t"+getLamaKerja();
    }
}
