package tugas6;

public class Main {
    public static void main(String[] args) {

        System.out.println("Nama\t:\tAdam Fadilah Islamawan");
        System.out.println("NIM\t:\t215150700111017");
        System.out.println("Kelas\t:\tPEMLAN TI-A");
        System.out.println("Ket\t:\tTUGAS 6");
        System.out.println();

        Manusia mns1 = new Manusia("Akbar Rusli", "3525647893645678", true, false);
        Manusia mns2 = new Manusia("Iftar Mamat", "3593645678256478", true, true);
        Manusia mns3 = new Manusia("Maimunah Fatihah", "3597864523656478", false, true);
        Manusia mns4 = new Manusia("Muhammad Ruslan", "3564785629834567", true, false);
        System.out.println("--------------------------- Manusia ---------------------------");
        System.out.println(mns1.toString());
        System.out.println();
        System.out.println("--------------------------- Manusia ---------------------------");
        System.out.println(mns2.toString());
        System.out.println();
        System.out.println("--------------------------- Manusia ---------------------------");
        System.out.println(mns3.toString());
        System.out.println();
        System.out.println("--------------------------- Manusia ---------------------------");
        System.out.println(mns4.toString());
        System.out.println();

        Pekerja pkj1 = new Pekerja("Rizqi Mubarok", "3564734585629867", true, false, 9, 14, "215150700111017");
        Pekerja pkj2 = new Pekerja("Junaidi Anwar", "3585629864734567", true, true, 7, 22,
        "215110150700117");
        Pekerja pkj3 = new Pekerja("Mahfud Manzhur", "3579838264456567", true, false, 6, 7, "217105851100117");
        Pekerja pkj4 = new Pekerja("Rizky Sungkar", "3579264838456567", true, true, 12, 21, "214571351100117");
        System.out.println("--------------------------- Pekerja ---------------------------");
        System.out.println(pkj1.toString());
        System.out.println();
        System.out.println("--------------------------- Pekerja ---------------------------");
        System.out.println(pkj2.toString());
        System.out.println();
        System.out.println("--------------------------- Pekerja ---------------------------");
        System.out.println(pkj3.toString());
        System.out.println();
        System.out.println("--------------------------- Pekerja ---------------------------");
        System.out.println(pkj4.toString());
        System.out.println();

        Mahasiswa mhs1 = new Mahasiswa("Adam Fadilah Islamawan", "3546783648364578", true, false, "215150700111017", 3.92);
        Mahasiswa mhs2 = new Mahasiswa("Shafa Auliya Faradina", "3544563648783678", false, false, "215150700111057", 3.72);
        Mahasiswa mhs3 = new Mahasiswa("Sholehudin Rachmad", "3546783648364578", true, false, "218152290101117", 3.4);
        Mahasiswa mhs4 = new Mahasiswa("Hasbulloh Khotib", "3546783836464578", true, false, "217103617111017", 2.92);
        System.out.println("--------------------------- Mahasiswa ---------------------------");
        System.out.println(mhs1.toString());
        System.out.println();
        System.out.println("--------------------------- Mahasiswa ---------------------------");
        System.out.println(mhs2.toString());
        System.out.println();
        System.out.println("--------------------------- Mahasiswa ---------------------------");
        System.out.println(mhs3.toString());
        System.out.println();
        System.out.println("--------------------------- Mahasiswa ---------------------------");
        System.out.println(mhs4.toString());
        System.out.println();

    Manager mng1 = new Manager("Azis Susanto", "3336584675846578", true, true, 12, 24, "245365373653", 1500);
    Manager mng2 = new Manager("Muniah Laila", "3136232732836572", false, false, 7, 14, "245365373653", 2000);
    Manager mng3 = new Manager("Zaenab Mustikah", "3636436246246574", false, true, 9, 21, "245365373653", 2500);
    Manager mng4 = new Manager("Ahmad Rosid", "3282372837236571", true, false, 6, 7, "245365373653", 1650);
    System.out.println("--------------------------- Manager ---------------------------");
    System.out.println(mng1.toString());
    System.out.println();
    System.out.println("--------------------------- Manager ---------------------------");
    System.out.println(mng2.toString());
    System.out.println();
    System.out.println("--------------------------- Manager ---------------------------");
    System.out.println(mng3.toString());
    System.out.println();
    System.out.println("--------------------------- Manager ---------------------------");
    System.out.println(mng4.toString());
    System.out.println();
    }    
}
