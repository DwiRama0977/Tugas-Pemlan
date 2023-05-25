package Tugas8;

public class Invoice implements Payable { 
    private String productName;
    private int quantity;
    private int pricePerItem;
    private Invoice[] invoice2;

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
