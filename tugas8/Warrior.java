package tugas8;

import java.util.Random;

public class Warrior extends Character {

    Warrior(){
        setHP(80);
        setAttack(25);
        setDefense(30);
    }

    public int generateRandom(){
        Random random = new Random();
        int upper = 100;
        int randomInt;
        return randomInt = random.nextInt(upper);
    }

    @Override
    public boolean attack() {
        if (generateRandom() > 0 && generateRandom() <= 60){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Role\t: Warrior");
        System.out.println("HP\t\t: "+getHP());
        System.out.println("Attack\t: "+getAttack());
        System.out.println("Defense\t: "+getDefense());
    }
}
