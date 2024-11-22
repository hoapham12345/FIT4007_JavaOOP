import java.util.Date;  // Thêm dòng này để sử dụng lớp Date

public class Order {
    private int orderId;
    private Customer customer;
    private String product;
    private double price;  // Thuộc tính giá tiền
    private String status;
    private Date orderDate;  // Sử dụng lớp Date
    private String address;

    public Order(int orderId, Customer customer, String product, double price, String status, Date orderDate, String address) {
        this.orderId = orderId;
        this.customer = customer;
        this.product = product;
        this.price = price;
        this.status = status;
        this.orderDate = orderDate;
        this.address = address;
    }

    // Phương thức hiển thị thông tin đơn hàng
    public void displayOrder() {
        System.out.printf("%-5d| %-20s| %-12s| %-25s| %-20s| %-10s| %-10.2f\n",
                orderId,
                customer.getName(),
                product,
                address,
                orderDate.toString(),
                status,
                price);
    }

    // Getters và setters cho các thuộc tính
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
