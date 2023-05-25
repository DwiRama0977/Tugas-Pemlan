package Tugas8;

public class Invoice implements Payable {
    String productName;
    int quantity;
    int pricePerItem;
    public Invoice[] invoice2;

    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getPayableAmount() {
        return quantity * pricePerItem;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantitiy() {
        return quantity;
    }

    public int getPricePerItem() {
        return pricePerItem;
    }
}