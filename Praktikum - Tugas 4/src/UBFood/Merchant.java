package UBFood;

public class Merchant {
    static String namaMerchant;
    static String namaProduk;
    static double hargaMakanan;
    
    public Merchant(String namaMerchant, String namaProduk, double hargaMakanan) {
        this.setNamaMerchant(namaMerchant);
        this.setNamaProduk(namaProduk);
        this.setHargaMakanan(hargaMakanan);
    }

    public String getNamaMerchant() {
        return namaMerchant;
    }

    public void setNamaMerchant(String namaMerchant) {
        this.namaMerchant = namaMerchant;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHargaMakanan() {
        return hargaMakanan;
    }

    public void setHargaMakanan(double hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    
}
