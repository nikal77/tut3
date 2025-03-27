public class Product {
    private int id;
    private String category;
    private String name;
    private double price;
    private int stockQuantity;

    public Product(int id, String category, String name, double price, int stockQuantity) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Category: " + category);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stock Quantity: " + stockQuantity);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }
}
