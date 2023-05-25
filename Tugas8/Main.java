package Tugas8;

public class Main {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Barang", 2, 50);
        Invoice invoice2 = new Invoice("Konsumsi", 3, 25);

        Invoice[] invoices = {invoice1,invoice2};

        Employee employee1 = new Employee(111036, "Rama", 1000, invoices);

        System.out.println("=====STRUK TOTAL GAJI KARYAWAN=====");
        System.out.println("=========INFORMASI KARYAWAN========");
        System.out.println("No.Regristrasi Karyawan\t: " + employee1.getRegistrationNumber());
        System.out.println("Nama Karyawan\t\t: " + employee1.getName());
        System.out.println("Gaji per Bulan\t\t: " + employee1.getSalaryPerMonth());
        System.out.println("==============POTONGAN=============");
        System.out.println(invoice1.getProductName() + "\t\t" + invoice1.getPricePerItem() + " X " + invoice1.getQuantitiy() + "\t: " + invoice1.getPayableAmount());
        System.out.println(invoice2.getProductName() + "\t" + invoice2.getPricePerItem() + " X " + invoice2.getQuantitiy() + "\t: " + invoice2.getPayableAmount());
        System.out.println("--------------------------------- +");
        System.out.println("Total\t\t\t: " + (invoice1.getPayableAmount() + invoice2.getPayableAmount()));
        System.out.println("===================================");

        System.out.println("Total Gaji Bersih\t: " + employee1.getPayableAmount());
    }
}
