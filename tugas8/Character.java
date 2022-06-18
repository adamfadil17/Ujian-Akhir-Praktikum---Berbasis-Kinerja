package tugas8;

public abstract class Character {
    private int defense, attack, HP;

    public abstract boolean attack();

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void receiveDamage(int damage){
        setHP(HP-(damage-getDefense()));
        if (HP <= 0)
            setHP(0);
    }
    //Method Attack

    //Method Info
    public void info(){
        System.out.println("-------- STATUS --------");
    }
}
