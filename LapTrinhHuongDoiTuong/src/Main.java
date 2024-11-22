import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderManager orderManager = new OrderManager();

        while (true) {
            System.out.println("1. Thêm đơn hàng mới");
            System.out.println("2. Hiển thị danh sách đơn hàng");
            System.out.println("3. Đánh dấu đơn hàng đã hoàn thành");
            System.out.println("4. Chỉnh sửa đơn hàng");
            System.out.println("5. Xóa đơn hàng");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Đọc dòng thừa sau khi nhập số

            switch (choice) {
                case 1:
                    // Thêm đơn hàng mới
                    System.out.print("Nhập ID đơn hàng: ");
                    int orderId = scanner.nextInt();
                    scanner.nextLine();  // Đọc dòng thừa
                    System.out.print("Nhập ID khách hàng: ");
                    int customerId = scanner.nextInt();
                    scanner.nextLine();  // Đọc dòng thừa
                    System.out.print("Nhập tên khách hàng: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Nhập email khách hàng: ");
                    String customerEmail = scanner.nextLine();
                    System.out.print("Nhập số điện thoại khách hàng: ");
                    String customerPhone = scanner.nextLine();

                    // Tạo đối tượng Customer
                    Customer customer = new Customer(customerId, customerName, customerEmail, customerPhone);

                    System.out.print("Nhập tên sản phẩm: ");
                    String product = scanner.nextLine();
                    System.out.print("Nhập giá sản phẩm: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();  // Đọc dòng thừa
                    System.out.print("Nhập địa chỉ giao hàng: ");
                    String address = scanner.nextLine();
                    Date orderDate = new Date();  // Lấy ngày hiện tại
                    System.out.print("Nhập trạng thái đơn hàng: ");
                    String status = scanner.nextLine();

                    // Tạo đối tượng Order và thêm vào quản lý đơn hàng
                    Order order = new Order(orderId, customer, product, price, status, orderDate, address);
                    orderManager.addOrder(order);
                    System.out.println("Đơn hàng đã được thêm.");
                    break;

                case 2:
                    // Hiển thị danh sách đơn hàng
                    orderManager.showOrders();
                    break;

                case 3:
                    // Đánh dấu đơn hàng đã hoàn thành
                    System.out.print("Nhập ID đơn hàng cần đánh dấu là hoàn thành: ");
                    int completedOrderId = scanner.nextInt();

                    // Gọi phương thức markOrderAsCompleted để cập nhật trạng thái
                    orderManager.markOrderAsCompleted(completedOrderId);
                    break;


                case 4:
                    // Chỉnh sửa đơn hàng
                    System.out.print("Nhập ID đơn hàng cần chỉnh sửa: ");
                    int editOrderId = scanner.nextInt();
                    orderManager.editOrder(editOrderId);
                    break;


                case 5:
                    // Xóa đơn hàng
                    System.out.print("Nhập ID đơn hàng cần xóa: ");
                    int deleteOrderId = scanner.nextInt();
                    orderManager.deleteOrder(deleteOrderId);
                    break;

                case 0:
                    // Thoát
                    System.out.println("Thoát chương trình.");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        }
    }
}
