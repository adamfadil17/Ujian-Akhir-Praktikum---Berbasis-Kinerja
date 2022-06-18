package uap;

class Helper {
    // Helper function to initialize variable that used in runtime environment
    static void initialize(){

        // Code Here
        // P.S: I think something is wrong with Initialize function

        // Initilaize Admin Instances
        Main.admins[0] = new Admin();
        Main.admins[1] = new Admin();

        // Initialize Hewan Instances
        Main.ayam = new Ayam();
        Main.domba = new Domba();
        Main.sapi = new Sapi();

        // Initialize Tanaman Instances
        Main.cengkeh = new Cengkeh();
        Main.kepalaSawit = new KepalaSawit();

        // Initialize Medicine instances
        Main.boosterAyam = new Medicine();
        Main.boosterSapi = new Medicine();
        Main.pesticideCengkeh = new Medicine();
        Main.boosterKepalaSawit = new Medicine();

        // Uang Kas 100000000
        Main.cash = 0;
    }

    // Helper function to authentication
    // PS: Doing an iteration to check one by one admin instances
    static boolean authentication(String username, String password) {

        Main.admins[0].setName("joko");
        Main.admins[0].setPassword("ini_password_joko");
        Main.admins[1].setName("dengklek");
        Main.admins[1].setPassword("ini_password_dengklek");



        if(username.equals(Main.admins[0].getName()) && password.equals(Main.admins[0].getPassword())){
            return true;
        } else if(username.equals(Main.admins[1].getName()) && password.equals(Main.admins[1].getPassword())){
            return true;
        }
        return false;
    }

    // PS: You can add new helper function below this comment if you want
}
