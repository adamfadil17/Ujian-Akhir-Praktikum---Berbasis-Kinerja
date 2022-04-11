import java.util.Scanner;

// Nama   : Adam Fadilah Islamawan
// NIM   : 215150700111017

class Baju{

    String type;
    double price;
    int sum;
    

    Baju(String type, int sum){
        this.type = type;
        this.sum = sum;
    }

    final double bajuA = 100000;
    final double bajuB = 125000;
    final double bajuC = 175000;

    void hargaA(){
        if(sum > 100){
            price  = (bajuA-5000);
        } else if(sum > 0 && sum <= 100){
            price = bajuA;
        }
    }
    void hargaB(){
        if(sum > 100){
            price  = (bajuB-5000);
        } else if(sum > 0 && sum <= 100){
            price = bajuB;
        }
    }
    void hargaC(){
        if(sum > 100){
            price  = (bajuC-15000);
        } else if(sum > 0 && sum <= 100){
            price = bajuC;
        }
    }

    void showData(){
        if(type.equalsIgnoreCase("a")){
            hargaA();
        }
        else if(type.equalsIgnoreCase("b")){
            hargaB();
        }
        else if(type.equalsIgnoreCase("c")){
            hargaC();
        }

        //formating untuk menghilangkan ,00)
        String priceSet = String.format("%.0f", price);
        String priceTotal = String.format("%.0f", price*sum);
        System.out.println("Jenis yang anda beli : " + type);
        System.out.println("Harga per buah       : " + priceSet);
        System.out.println("Total harga          : " + priceTotal);
    }
}

public class tugas {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String jenis = in.nextLine();
        int jumlah = in.nextInt();

        System.out.println("Baju yang tersedia :");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");        
        System.out.println("Baju C dengan harga 175000");
        System.out.println("Baju yang akan anda beli bertipe : " + jenis);
        System.out.println("Jumlah Baju yang akan anda beli adalah : " + jumlah);   

        Baju baju = new Baju(jenis, jumlah);

        baju.showData();

    }
}
