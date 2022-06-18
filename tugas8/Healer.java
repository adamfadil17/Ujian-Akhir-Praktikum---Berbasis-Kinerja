package tugas8;

import java.util.Random;

public class Healer extends Character {

    Healer(){
        setHP(70);
        setAttack(10);
        setDefense(10);
    }

    public void heal(){
        setHP(getHP()+25);
    }

    public int generateRandom(){
        Random random = new Random();
        int upper = 100;
        int randomInt;
        return randomInt = random.nextInt(upper);
    }

    @Override
    public boolean attack() {
        if (generateRandom() > 0 && generateRandom() <= 85){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Role\t: Healer");
        System.out.println("HP\t\t: "+getHP());
        System.out.println("Attack\t: "+getAttack());
        System.out.println("Defense\t: "+getDefense());
    }
}
