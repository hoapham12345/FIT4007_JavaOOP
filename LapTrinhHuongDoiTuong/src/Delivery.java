public class Delivery {
    private int deliveryId;
    private Order order;
    private String deliveryStatus; // Pending, In Progress, Delivered

    public Delivery(int deliveryId, Order order, String deliveryStatus) {
        this.deliveryId = deliveryId;
        this.order = order;
        this.deliveryStatus = deliveryStatus;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public Order getOrder() {
        return order;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public void displayDelivery() {
        System.out.println("Delivery ID: " + deliveryId + ", Order ID: " + order.getOrderId() + ", Status: " + deliveryStatus);
    }
}
