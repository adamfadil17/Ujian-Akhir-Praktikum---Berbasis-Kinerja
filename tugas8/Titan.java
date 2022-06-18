package tugas8;
import java.util.*;

public class Titan extends Character{

    Titan(){
        setHP(200);
        setAttack(45);
        setDefense(0);
    }

    public int generateRandom(){
        Random random = new Random();
        int upper = 100;
        int randomInt;
        return randomInt = random.nextInt(upper);
    }

    @Override
    public boolean attack() {
        if (generateRandom() > 0 && generateRandom() <= 40){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Role\t: Titan");
        System.out.println("HP\t\t: "+getHP());
        System.out.println("Attack\t: "+getAttack());
        System.out.println("Defense\t: "+getDefense());
    }
}
