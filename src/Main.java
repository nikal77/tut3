import java.util.ArrayList;

public class ComputerStore {
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    private int productCount;
    private int customerCount;
    private int orderCount;

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public void createOrder(Customer customer, Product[] products, int[] quantities) {
        Order newOrder = new Order(123, customer, products, quantities, "2025-03-21", "New");
        orders.add(newOrder);
    }

    public void updateStockAfterOrder(Order order) {
        Product[] product = order.getProduct();
        int[] quantities = order.getQuantities();
        for (int i = 0; i < product.length; i++) {
            product[i].setStockQuantity(product[i].getStockQuantity()-quantities[i]);
        }
    }

    public void changeOrderStatus(int orderId, String newStatus) {
        orders.get(orderId).setStatus(newStatus);
    }

    public void displayProductsInCategory(String category) {
        for (Product product : products) {
            if (product.getCategory().equals(category)) {
                System.out.println(product);
            }
        }
    }

    public void displayCustomerOrders(int customerId) {
        for (Customer customer : customers) {
            if (customer.getId() == customerId) {
                System.out.println(customer);
            }
        }
    }
}
