import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderManager {
    private List<Order> orders;

    public OrderManager() {
        orders = new ArrayList<>();
    }

    // Thêm đơn hàng vào danh sách
    public void addOrder(Order order) {
        orders.add(order);
    }

    // Phương thức hiển thị tất cả đơn hàng
    public void showOrders() {
        if (orders.isEmpty()) {
            System.out.println("Danh sách đơn hàng trống.");
            return;
        }
        System.out.printf("%-5s| %-20s| %-12s| %-25s| %-20s| %-10s| %-10s\n",
                "ID", "TÊN KHÁCH HÀNG", "SẢN PHẨM", "ĐỊA CHỈ", "NGÀY ĐẶT", "TRẠNG THÁI", "GIÁ TIỀN");
        for (Order order : orders) {
            order.displayOrder();
        }
    }

    // Phương thức lấy danh sách các đơn hàng
    public List<Order> getOrders() {
        return orders;
    }

    // Phương thức đánh dấu đơn hàng đã hoàn thành
    public void markOrderAsCompleted(int orderId) {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                order.setStatus("Hoàn thành");
                System.out.println("Đơn hàng với ID " + orderId + " đã được đánh dấu là hoàn thành.");
                return;
            }
        }
        System.out.println("Không tìm thấy đơn hàng với ID " + orderId);
    }

    // Phương thức chỉnh sửa thông tin đơn hàng
    public void editOrder(int orderId) {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Chỉnh sửa đơn hàng có ID: " + orderId);

                System.out.print("Nhập tên sản phẩm mới: ");
                String newProduct = scanner.nextLine();
                order.setProduct(newProduct);

                System.out.print("Nhập giá mới: ");
                double newPrice = scanner.nextDouble();
                order.setPrice(newPrice);
                scanner.nextLine();  // Đọc dòng thừa

                System.out.print("Nhập địa chỉ giao hàng mới: ");
                String newAddress = scanner.nextLine();
                order.setAddress(newAddress);

                System.out.print("Nhập trạng thái mới: ");
                String newStatus = scanner.nextLine();
                order.setStatus(newStatus);

                System.out.println("Đơn hàng đã được chỉnh sửa.");
                return;
            }
        }
        System.out.println("Không tìm thấy đơn hàng với ID " + orderId);
    }

    // Phương thức xóa đơn hàng
    public void deleteOrder(int orderId) {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                orders.remove(order);
                System.out.println("Đơn hàng với ID " + orderId + " đã bị xóa.");
                return;
            }
        }
        System.out.println("Không tìm thấy đơn hàng với ID " + orderId);
    }
}
