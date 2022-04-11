package UBFood;

import static UBFood.DataMerchant.*;

public class Main {
    public static void main(String[] args) {

        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mlebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Georek Kak Ros", "Ayam Kota Ekstra Nasi", 8000));
        DataMerchant.tampilData();
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(DataMerchant.in.nextLine(), DataMerchant.in.nextLine(), DataMerchant.in.nextDouble()));
        DataMerchant.tampilData();


    
    }
    
}
