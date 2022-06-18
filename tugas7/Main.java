package tugas7;

public class Main {
    public static void main(String[] args) {

        System.out.println("Nama\t:\tAdam Fadilah Islamawan");
        System.out.println("NIM\t\t:\t215150700111017");
        System.out.println("Kelas\t:\tPEMLAN TI-A");
        System.out.println("Ket\t\t:\tTUGAS 7");
        System.out.println();

        Pegawai pgw = new PegawaiTetap("Johny Ahmad", "356746573857344567", 3500000);
        Pegawai pgw1 = new PegawaiTetap("Sahrul Bairuni", "354456574657387367", 2700000);
        Pegawai pgw2 = new PegawaiTetap("Jeno Salim", "356573746857344567", 2000000);
        Pegawai pgw3 = new PegawaiTetap("Mahmud Salam", "356447465738573567", 1800000);

        Pegawai pgw4 = new PegawaiHarian("Ayu Astuti", "356443857465773567", 10000, 40);
        Pegawai pgw5 = new PegawaiHarian("Budi Surahman", "338574655644773567", 7000, 40);
        Pegawai pgw6 = new PegawaiHarian("Cecep Manang", "364543857465773567", 85000, 40);
        Pegawai pgw7 = new PegawaiHarian("Dian Putri", "375657736443857456", 15000, 40);

        Pegawai pgw8 = new Sales("Sulistia", "375653644377857456", 60, 45000);
        Pegawai pgw9 = new Sales("Ari Lesmana", "354437653677857456", 38, 55000);
        Pegawai pgw10 = new Sales("Putri Tanjung", "375677853644357456", 56, 70000);
        Pegawai pgw11 = new Sales("Ahmad Hasyim", "344756536377857456", 45, 40000);
        Pegawai pgw12 = new Sales("Komang Irawan", "337756536447857456", 70, 65000);

        System.out.println(pgw.toString());
        System.out.println();
        System.out.println(pgw1.toString());
        System.out.println();
        System.out.println(pgw2.toString());
        System.out.println();
        System.out.println(pgw3.toString());
        System.out.println();
        System.out.println(pgw4.toString());
        System.out.println();
        System.out.println(pgw5.toString());
        System.out.println();
        System.out.println(pgw6.toString());
        System.out.println();
        System.out.println(pgw7.toString());
        System.out.println();
        System.out.println(pgw8.toString());
        System.out.println();
        System.out.println(pgw9.toString());
        System.out.println();
        System.out.println(pgw10.toString());
        System.out.println();
        System.out.println(pgw11.toString());
        System.out.println();
        System.out.println(pgw12.toString());
        System.out.println();
    }
}



