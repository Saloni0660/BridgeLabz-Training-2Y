public class RetailOrderManagement {
    public static void main(String[] args) {
        Order order = new Order(1001, "2025-09-15");
        ShippedOrder shippedOrder = new ShippedOrder(1002, "2025-09-10", "TRACK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder(1003, "2025-09-01", "TRACK67890", "2025-09-05");

        System.out.println("Order ID: " + order.getOrderId() + ", Status: " + order.getOrderStatus());
        System.out.println("Order ID: " + shippedOrder.getOrderId() + ", Status: " + shippedOrder.getOrderStatus());
        System.out.println("Order ID: " + deliveredOrder.getOrderId() + ", Status: " + deliveredOrder.getOrderStatus());
    }
}

// Base class
class Order {
    protected int orderId;
    protected String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }
}

// Subclass 1
class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }
}

// Subclass 2
class DeliveredOrder extends ShippedOrder {
    public String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }
}
