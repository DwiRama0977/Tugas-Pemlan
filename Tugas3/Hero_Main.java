package Tugas3;

import java.util.Scanner;

public class Hero_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("    GAME PERANG ANTAR HERO");
        System.out.println("===============================");

        Hero hero1 = new Hero ();
        System.out.print("Masukkan nama hero 1\t: ");
        hero1.setNama(input.nextLine());
        System.out.print("Masukkan attack hero 1\t: ");
        hero1.setAtk(input.nextDouble());
        System.out.print("Masukkan hp hero 1\t: ");
        hero1.setHp(input.nextDouble());
        System.out.println("==========INFO HERO 1==========");
        hero1.tampil();

        System.out.print("Masukkan nama hero 2\t: ");
        String nama = input.next();
        System.out.print("Masukkan atk hero 2\t: ");
        double atk = input.nextDouble();
        System.out.print("Masukkan hp hero 2\t: ");
        double hp = input.nextDouble();
        System.out.println("==========INFO HERO 2==========");
        Hero hero2 = new Hero(nama, atk, hp);
        hero2.tampil();

        int i = 1;
        while (hero1.getHp() > 0 && hero2.getHp() > 0) {
            System.out.println("==========RONDE KE-" + i++ + "===========");
            hero1.lawan(hero2);
            if (hero2.getHp() > 0) {
                hero2.lawan(hero1);
            }
        }
        
        if (hero1.getHp()<0) {
            akhir(hero2.getNama());
        } 
        else {
            akhir(hero1.getNama());
        }
    }
    public static void  akhir (String nama) {
            System.out.println(nama + " memenangkan pertandingan");
            System.out.println("Pertandingan telah selesai");
            System.out.println();
    }
}
