package Tugas6;

public class HumanMain {
    public static void main(String[] args) {
        Human manusia1 = new Human("Bagus", "357091111", true, true);
        System.out.println(manusia1.toString());

        Human manusia2 = new Human("Cindy", "357901029", false, true);
        System.out.println(manusia2.toString());

        Human manusia3 = new Human("Rizki", "356111278", true, false);
        System.out.println(manusia3.toString());

        MahasiswaFilkom mahasiswa1 = new MahasiswaFilkom("Rama", "350782918", true, false, "225150700111036", 2);
        System.out.println(mahasiswa1.toString());

        MahasiswaFilkom mahasiswa2 = new MahasiswaFilkom("Rama", "350782918", true, false, "225150700111036", 3);
        System.out.println(mahasiswa2.toString());

        MahasiswaFilkom mahasiswa3 = new MahasiswaFilkom("Rama", "350782918", true, false, "225150700111036", 3.8);
        System.out.println(mahasiswa3.toString());

        Pekerja pekerja1 = new Pekerja("Faisal", "357567777", true, true, 400, 2021, 5, 9, 2);
        System.out.println(pekerja1.toString());

        Pekerja pekerja2 = new Pekerja("Ranti", "357412435", false, false, 600, 2014, 1, 1, 0);
        System.out.println(pekerja2.toString());

        Pekerja pekerja3 = new Pekerja("Sasuke", "35712345", true, true, 500, 2003, 2, 3, 10);
        System.out.println(pekerja3.toString());

        Manager manager1 = new Manager("Rama", "357301276", true, false, 7500, 2008, 2, 10, 0, "Data Analis");
        System.out.println(manager1.toString());
    }
}
