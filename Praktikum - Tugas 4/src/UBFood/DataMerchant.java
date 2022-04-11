package UBFood;
import java.util.*;

import static UBFood.Merchant.*;

public class DataMerchant {

    static Scanner in = new Scanner(System.in);
    static Merchant merc[] = new Merchant[5];

    public static Merchant[] tambahMerchant(Merchant merchant){
        Merchant temp[] = new Merchant [DataMerchant.merc.length+1];
        for (int i = 0; i < DataMerchant.merc.length; i++) {
            temp[i] = DataMerchant.merc[i];
        }

        temp[DataMerchant.merc.length] = merchant;
        return temp;
    }

    public static void tampilData(){
        for(Merchant mch1 : merc){
            System.out.println("=== Tampil Data Merchant UBFood ===");
            System.out.println("Nama Merchant : "+mch1.getNamaMerchant());
            System.out.println("Nama Produk   : "+mch1.getNamaProduk());
            System.out.println("Harga         :"+(int)mch1.getHargaMakanan());
        }
    }

    public class Merchant cariMerchant(String nama){

    }

    public static void tampilMerchant(Merchant merhant){
        System.out.println("=== Tampil Data Merchant UB ===");


    } 

    public static void updateMerchant(Merchant merchant){
        
    } 

}
