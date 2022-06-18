package tugas6;

public class Pekerja extends Manusia {
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    public Pekerja(String nama, String NIK, boolean jenisKelamin, boolean menikah,
                  int jamKerja, int hariKerja, String NIP) {
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus() {

        double bonusLembur;
        double bonusLibur;

        if (getHariKerja() > 1 && getHariKerja() < 7) {
            bonusLibur = getHariKerja()*20;
            bonus = bonusLibur;
        } else if (getHariKerja() == 7){
            bonusLembur = (getHariKerja()-2)*(getJamKerja()-7)*7;
            bonusLibur = 2*getHariKerja()*20;
            bonus = bonusLembur+bonusLibur;
        }else if (getHariKerja() > 7 && getHariKerja() < 14){
            bonusLembur = (getHariKerja()-3)*(getJamKerja()-7)*7;
            bonusLibur = 3*getHariKerja()*20;
            bonus = bonusLembur+bonusLibur;
        } else if (getHariKerja() == 14){
            bonusLembur = (getHariKerja()-4)*(getJamKerja()-7)*7;
            bonusLibur = 4*getHariKerja()*20;
            bonus = bonusLembur+bonusLibur;
        } else if(getHariKerja() > 14 && getHariKerja() < 21){
            bonusLembur = (getHariKerja()-5)*(getJamKerja()-7)*7;
            bonusLibur = 5*getHariKerja()*20;
            bonus = bonusLembur+bonusLibur;
        } else if (getHariKerja() == 21){
            bonusLembur = (getHariKerja()-6)*(getJamKerja()-7)*7;
            bonusLibur = 6*getHariKerja()*20;
            bonus = bonusLembur+bonusLibur;
        } else if (getHariKerja() > 21 && getHariKerja() < 28){
            bonusLembur = (getHariKerja()-7)*(getJamKerja()-7)*7;
            bonusLibur = 7*getHariKerja()*20;
            bonus = bonusLembur+bonusLibur;
        } else if (getHariKerja() >= 28 && getHariKerja() <= 31){
            bonusLembur = (getHariKerja()-8)*(getJamKerja()-7)*7;
            bonusLibur = 8*getHariKerja()*20;
            bonus = bonusLembur+bonusLibur;
        } else {
            System.out.println("hari Kerja Maksimal 31 Hari");
        }
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getStatus(){
        
        String output1 = "";
        String output2 = "";
        String output3 = "";
        
        switch (getNIP().charAt(6)) {
            case '1':
                output1 = "Pemasaran, ";
                break;
            case '2':
                output1 = "Humas, ";
                break;
            case '3':
                output1 = "Riset, ";
                break;
            case '4':
                output1 = "Teknologi, ";
                break;
            case '5':
                output1 = "Personalia, ";
                break;
            case '6':
                output1 = "Akademik, ";
                break;
            case '7':
                output1 = "Administrasi, ";
                break;
            case '8':
                output1 = "Operasional, ";
                break;
            case '9':
                output1 = "Pembangunan, ";
                break;
            default:
                output1 = "Departemen tidak ditemukan";
        }

        switch (getNIP().charAt(0)) {
            case '1':
                output2 = "Mondstadt ";
                break;
            case '2':
                output2 = "Liyue ";
                break;
            case '3':
                output2 = "Inazuma ";
                break;
            case '4':
                output2 = "Sumeru ";
                break;
            case '5':
                output2 = "Fontaine ";
                break;
            case '6':
                output2 = "Natlan ";
                break;
            case '7':
                output2 = "Snezhnaya ";
                break;
            default:
                output2 = "Kantor Cabang tidak ditemukan";
        }


        switch (getNIP().charAt(2)) {
            case '1':
                output3 = "cabang ke- 1";
                break;
            case '2':
                output3 = "cabang ke- 2";
                break;
            case '3':
                output3 = "cabang ke- 3";
                break;
            case '4':
                output3 = "cabang ke- 4";
                break;
            case '5':
                output3 = "cabang ke- 5";
                break;
            case '6':
                output3 = "cabang ke- 6";
                break;
            case '7':
                output3 = "cabang ke- 7";
                break;
            case '8':
                output3 = "cabang ke- 8";
                break;
            case '9':
                output3 = "cabang ke- 9";
                break;
            default:
                output3 = "Cabang tidak ditemukan";
        }

        return output1+output2+output3;
    }

    @Override
    public double getTunjangan() {
        double gaji;
        double bonusLembur;
        double bonusLibur;
        double total = 0;

        if (getHariKerja() > 1 && getHariKerja() < 7) {
            gaji = getHariKerja()*getJamKerja()*15;
            bonusLibur = getHariKerja()*20;
            total = gaji+bonusLibur;
        } else if (getHariKerja() == 7){
            gaji = getHariKerja()*getJamKerja()*15;
            bonusLembur = (getHariKerja()-2)*(getJamKerja()-7)*7;
            bonusLibur = 2*getHariKerja()*20;
            total = gaji+bonusLembur+bonusLibur;
        }else if (getHariKerja() > 7 && getHariKerja() < 14){
            gaji = getHariKerja()*getJamKerja()*15;
            bonusLembur = (getHariKerja()-3)*(getJamKerja()-7)*7;
            bonusLibur = 3*getHariKerja()*20;
            total = gaji+bonusLembur+bonusLibur;
        } else if (getHariKerja() == 14){
            gaji = getHariKerja()*getJamKerja()*15;
            bonusLembur = (getHariKerja()-4)*(getJamKerja()-7)*7;
            bonusLibur = 4*getHariKerja()*20;
            total = gaji+bonusLembur+bonusLibur;
        } else if(getHariKerja() > 14 && getHariKerja() < 21){
            gaji = getHariKerja()*getJamKerja()*15;
            bonusLembur = (getHariKerja()-5)*(getJamKerja()-7)*7;
            bonusLibur = 5*getHariKerja()*20;
            total = gaji+bonusLembur+bonusLibur;
        } else if (getHariKerja() == 21){
            gaji = getHariKerja()*getJamKerja()*15;
            bonusLembur = (getHariKerja()-6)*(getJamKerja()-7)*7;
            bonusLibur = 6*getHariKerja()*20;
            total = gaji+bonusLembur+bonusLibur;
        } else if (getHariKerja() > 21 && getHariKerja() < 28){
            gaji = getHariKerja()*getJamKerja()*15;
            bonusLembur = (getHariKerja()-7)*(getJamKerja()-7)*7;
            bonusLibur = 7*getHariKerja()*20;
            total = gaji+bonusLembur+bonusLibur;
        } else if (getHariKerja() >= 28 && getHariKerja() <= 31){
            gaji = getHariKerja()*getJamKerja()*15;
            bonusLembur = (getHariKerja()-8)*(getJamKerja()-7)*7;
            bonusLibur = 8*getHariKerja()*20;
            total = gaji+bonusLembur+bonusLibur;
        } else {
            System.out.println("hari Kerja Maksimal 31 Hari");
        }

        return total;
    }

    @Override
    public double getPendapatan(){
        return super.getTunjangan()+getTunjangan();
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "NIP\t\t:\t"+getNIP() +
                "\nBonus\t\t:\t"+getBonus() + "$" +
                "\nGaji\t\t:\t"+(getPendapatan()-getBonus()) + "$" +
                "\nStatus\t\t:\t"+getStatus();
    }
}
