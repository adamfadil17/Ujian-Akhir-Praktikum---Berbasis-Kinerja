package tugas8;

import java.util.Random;

public class Magician extends Character {

    Magician(){
        setHP(100);
        setAttack(60);
        setDefense(10);
    }

    public int generateRandom(){
        Random random = new Random();
        int upper = 100;
        int randomInt;
        return randomInt = random.nextInt(upper);
    }

    @Override
    public boolean attack() {
        if (generateRandom() > 0 && generateRandom() <= 35){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Role\t: Magician");
        System.out.println("HP\t\t: "+getHP());
        System.out.println("Attack\t: "+getAttack());
        System.out.println("Defense\t: "+getDefense());
    }
}
