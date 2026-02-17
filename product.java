package ecommerce;

public class product {

    static String name;
    public double productPrice;
    private int productStock;

    public product(double productPrice, int productStock) {
        this.productPrice = productPrice;
        this.productStock = productStock;
    }

    public product(int productName, double productPrice, int productStock) {
        name = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
    }
    
    public product(String productName, double productPrice, int productStock) {
        this.name = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
    }

    public void setProductPrice(double price) {
        this.productPrice = price;
    }

    public double getProductPrice() {
        return productPrice;
    }

    private void printProductInformation() {
        System.out.println("=== PRODUCT INFORMATION ====");
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: Rp " + productPrice);
        System.out.println("Stock: " + productStock);
    }
}
