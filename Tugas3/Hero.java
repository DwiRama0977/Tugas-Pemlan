package Tugas3;

public class Hero {
    private String nama;
    private double hp;
    private double atk;

    public Hero (String nama, double atk, double hp){
        this.nama = nama;
        this.atk = atk;
        this.hp = hp;
    }

    public Hero (){
    }
    
    public void setNama (String nama){
        this.nama = nama;
    }

    public void setAtk (double atk){
        this.atk = atk;
    }

    public void setHp (double hp){
        this.hp = hp;
    }

    public String getNama (){
        return this.nama;
    }

    public double getAtk (){
        return this.atk;
    }

    public double getHp (){
        return this.hp;
    }

    public void tampil (){
        System.out.println("Nama hero\t\t: " + this.nama);
        System.out.println("Attack hero\t\t: " + this.atk);
        System.out.println("Health Poin hero\t: " + this.hp);
        System.out.println();
    }

    public void lawan (Hero musuh) {
        System.out.println(this.nama + " menyerang " + musuh.nama);
        System.out.println(musuh.nama + " mendapat damage sebesar " + this.atk);
        
        musuh.menyerang(musuh.atk);
        System.out.println("hp " + musuh.nama + " tersisa " + musuh.hp);
        System.out.println();
        if (musuh.hp <= 0) {
            System.out.println("=============HASIL=============");
            System.out.println(musuh.nama + " telah kalah");
        }
    }
    
    public void menyerang (double atk){
        this.hp -= atk;
    }
}
