package UBFood;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String mName, pName;
        double pPrice;

        Scanner in = new Scanner(System.in);

        System.out.println("Nama       : " + "Adam Fadilah Islamawan");
        System.out.println("NIM        : " + "215150700111017");
        System.out.println("Keterangan : " + "TUGAS 4");
        System.out.print("\n");


        //Data Merchant Default Sebelum Ditambahkan
        DataMerchant.merch = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merch = DataMerchant.tambahMerchant(new Merchant("Nasgor Mlebes", "Nasgor", 10000));
        DataMerchant.merch = DataMerchant.tambahMerchant(new Merchant("Ayam Geprak Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        DataMerchant.tampilData();

        //Menu Penginputan Data Penambahan Merchant
        System.out.println("=== Tolong Masukkan Data Merchant Baru! ===");
        System.out.println("Nama Merchant : ");
        mName = in.nextLine();
        System.out.println("Nama Produk   : ");
        pName = in.nextLine();
        System.out.println("Harga Produk  : ");
        pPrice = in.nextDouble();
        in.nextLine();

        //Membuat  Data Baru menggunakan Scanner
        DataMerchant.merch = DataMerchant.tambahMerchant(new Merchant(mName, pName, pPrice));
        System.out.print("\n");

        //Menampilkan Data Default + Data baru yang Ditambahkan
        DataMerchant.tampilData();
        System.out.print("\n");

        //Mencari Data yang Ingin di Tampilkan
        System.out.println("Masukkan Nama Merchant yang Ingin Anda Cari   : ");
        String cari = in.nextLine();
        DataMerchant.tampilMerchant(DataMerchant.cariMerchant(cari));
        System.out.print("\n");

        //Mengupdate Data Merchant
        /*System.out.println("Pilih Data Merchant yang Ingin Anda Update : ");
        System.out.println("Masukkan Nama Merchant yang Ingin di Ganti");
        String pilih = in.nextLine();
        System.out.println("Masukkan Nama Merchant Baru : ");
        String namaUpdate = in.nextLine();
        System.out.println("Masukkan Nama Produk Baru   : ");
        String produkUpdate = in.nextLine();
        System.out.println("Masukkan Harga Produk Baru  : ");
        double hargaUpdate = in.nextDouble();

        DataMerchant.updateMerchant((DataMerchant.cariMerchant(pilih)), namaUpdate, produkUpdate, hargaUpdate);
        */

        //Update Data Merchant
        DataMerchant.updateMerchant(DataMerchant.cariMerchant("Bakso Pak Sahid"), "Nasgor Sayang", "Nasi Goreng Mawut", 12000);
        System.out.println("===Tampilan Update Data===");
        System.out.print("\n");
        DataMerchant.tampilMerchant(DataMerchant.cariMerchant("Bakso Pak Sahid"));

    }
}
