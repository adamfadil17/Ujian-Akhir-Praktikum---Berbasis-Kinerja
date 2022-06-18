package tugas8;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Adam Fadilah Islamawan");
        System.out.println("215150700111017");
        System.out.println();

        Scanner in = new Scanner(System.in);

        int count = 0;
        int choice = 0;

        System.out.println("SELAMAT DATANG DI GAME DEFEND FILKOM");
        System.out.println();
        System.out.println("Silahkan Masukkan Nama Player\t: ");
        String name = in.nextLine();

        System.out.println("");
        System.out.println("Silahkan Pilih Karakter yang Anda Inginkan\t: ");
        System.out.println("1.\tMagician");
        System.out.println("2.\tHealer");
        System.out.println("3.\tWarrior");

        do{
            try{
                choice = in.nextInt();
                System.out.println("Selamat Datang, "+name);
                if (choice != 1 && choice != 2 && choice != 3)
                    throw new NullPointerException();
            } catch (InputMismatchException e) {
                System.out.println("Tolong Masukkan Inputan dalam bentuk Angka !");
                System.out.println("Silahkan Pilih Karakter yang Anda Inginkan\t: ");
                in.nextLine();
            } catch (NullPointerException e){
                System.out.println();
                System.out.println("Karakter tidak tersedia");
                System.out.println("Silahkan Pilih Karakter yang Anda Inginkan\t: ");
                in.nextLine();
            }
        }while(choice != 1 && choice != 2 && choice != 3);


        Titan titan = new Titan();
        Character character = null;
        switch (choice){
            case 1:
                character = new Magician();
                character.info();
                break;
            case 2:
                character = new Healer();
                ((Healer)character).info();
                break;
            case 3:
                character = new Warrior();
                ((Warrior)character).info();
                break;
            default:
                System.out.println("Hero tidak ditemukan");
        }

        while(titan.getHP() > 0 && character.getHP() > 0){
            System.out.printf("=========\tTURN %d\t======== %n", count);
            if (character.attack()){
                titan.receiveDamage(character.getAttack());
            }
            count++;

            System.out.println("Enemy's HP\t= "+titan.getHP());
            System.out.printf("%s's HP \t= %d %n ", name, character.getHP());

            if (titan.getHP() == 0)
                break;

            System.out.printf("=========\tTURN %d\t======== %n", count);
            if (count % 2 == 0 && character instanceof Healer){
                System.out.println("Menggunakan skill Heal");
                ((Healer) character).heal();
            }

            if (titan.attack() == true){
                character.receiveDamage(titan.getAttack());
            }
            System.out.println("Enemy's HP\t= "+titan.getHP());
            System.out.printf("%s's HP \t= %d %n ", name, character.getHP());
            count++;
        }

        if (titan.getHP() <= 0){
            titan.setHP(0);
            System.out.println("===========================");
            System.out.println(name+" Menang");
            System.out.println("===========================");
            System.out.println("Titan Kalah");
        } else if(character.getHP() <= 0){
            character.setHP(0);
            System.out.println("===========================");
            System.out.println(name+" Kalah");
            System.out.println("===========================");
            System.out.println("Titan Menang");
        }

        System.out.println("");
        System.out.println("========\tPLAYER\t========");
        character.info();
        System.out.println("========\tMUSUH\t=========");
        titan.info();
    }
}
