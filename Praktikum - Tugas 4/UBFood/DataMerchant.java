package UBFood;

public class DataMerchant {

    static Merchant[] merch = new Merchant[0];

    public static Merchant[] tambahMerchant(Merchant tambah){

        int i = 0;

        Merchant[] merch2 = new Merchant[DataMerchant.merch.length+1];

        while(i < DataMerchant.merch.length){
            merch2[i] = merch[i];
            i++;
        }

        merch2[DataMerchant.merch.length] = tambah;

        return merch2;
    }

    public static void tampilData(){

        for (Merchant mch : DataMerchant.merch){
            System.out.println("===Tampilan Data Merchant UBFood===");
            System.out.println("Nama Merchant  : "+mch.getMerchantName());
            System.out.println("Nama Produk    : "+mch.getProductName());
            System.out.println("Harga          : "+(int)mch.getFoodPrice());
        }
    }

    //Method untuk Mencari Data Merchant
    public static Merchant cariMerchant(String nama){

        int status = 0;


        int i = 0;

        while(i < DataMerchant.merch.length){

            if(DataMerchant.merch[i].getMerchantName().equals(nama)){
                status = i;
                break;
            }
                i++;
        }

        return merch[status];

    }

    //Method untuk Menampilkan Data yang Dipilih
    public static void tampilMerchant(Merchant tambah){
        System.out.println("===Tampilan Data Merchant UBFood===");
        System.out.println("Nama Merchant  : "+tambah.getMerchantName());
        System.out.println("Nama Produk    : "+tambah.getProductName());
        System.out.println("Harga          : "+(int)tambah.getFoodPrice());
    }

    // Method untuk mengupdate Data Default Merchant dengan menggunakan setter
    public static void updateMerchant(Merchant tambah, String mName, String pName, double pPrice){
        tambah.setMerchantName(mName);
        tambah.setProductName(pName);
        tambah.setFoodPrice(pPrice);
    }

}
