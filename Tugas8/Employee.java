package Tugas8;

public class Employee implements Payable {
    int registrationNumber;
    String name;
    int salaryPerMonth;
    Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public double getPayableAmount() {
        double totaInvoiceAmount = 0.0;
        for (Invoice invoice : invoices) {
            totaInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totaInvoiceAmount;
    }

    public int getRegistrationNumber(){
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public Invoice[] getInvoice() {
        return invoices;
    }
}
